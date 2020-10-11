package ru.iteco.builder;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmailBuilder {

    public IFillSubjectBuilder addSubject(String subject) {
        return new FillSubjectBuilderImpl(subject);
    }

    private static class FillSubjectBuilderImpl implements IFillSubjectBuilder {

        private final String subject;

        private FillSubjectBuilderImpl(String subject) {
            this.subject = subject;
        }

        @Override
        public IFillRecipientBuilder addFrom() {
            return new FillRecipientBuilderImpl("Иванов Иван Иванович", subject);
        }

        @Override
        public IFillRecipientBuilder addFrom(String from) {
            return new FillRecipientBuilderImpl(from, subject);
        }
    }

    private static class FillRecipientBuilderImpl implements IFillRecipientBuilder {

        private final String from;
        private final String subject;
        private final HashSet<String> recipients = new HashSet<>();
        private final HashSet<String> copyToAll = new HashSet<>();


        private FillRecipientBuilderImpl(String from, String subject) {
            this.from = from;
            this.subject = subject;
        }

        @Override
        public IFillRecipientBuilder addTo(String to) {
            if (to == null) {
                return this;
            }
            var toNotSpaces = to.trim();
            if (recipients.isEmpty()) {
                recipients.add(toNotSpaces);
                return this;
            }
            if (recipients.contains(toNotSpaces)) {
                return this;
            }
            recipients.add(toNotSpaces);
            return this;
        }

        @Override
        public IFillRecipientBuilder addToAll(List<String> toAll) {
            recipients.addAll(toAll.stream()
                    .filter(Objects::nonNull)
                    .map(String::trim)
                    .filter(c -> !recipients.contains(c))
                    .collect(Collectors.toList()));
            return this;
        }

        @Override
        public IFillContentBuilder copyTo(String copyTo) {
            if (copyTo == null) {
                return new FillCopyToBuilderImpl(from, subject, recipients, copyToAll);
            }
            var toNotSpaces = copyTo.trim();
            copyToAll.add(toNotSpaces.trim());
            return new FillCopyToBuilderImpl(from, subject, recipients, copyToAll);
        }

        @Override
        public IFillContentBuilder copyToAll(List<String> coToAll) {
            copyToAll.addAll(coToAll.stream()
                    .filter(Objects::nonNull)
                    .map(String::trim)
                    .collect(Collectors.toList()));
            return new FillCopyToBuilderImpl(from, subject, recipients, copyToAll);
        }
    }

    public static class FillCopyToBuilderImpl implements IFillContentBuilder {

        private final String from;
        private final String subject;
        private final HashSet<String> recipients;
        private final HashSet<String> copyToAll;

        public FillCopyToBuilderImpl(String from, String subject, HashSet<String> recipients, HashSet<String> copyToAll) {
            this.from = from;
            this.subject = subject;
            this.recipients = recipients;
            this.copyToAll = copyToAll;
        }

        @Override
        public IFillContentBuilder copyTo(String copyTo) {
            if (copyTo == null) {
                return this;
            }
            var toNotSpaces = copyTo.trim();
            if (copyToAll.contains(toNotSpaces)) {
                return this;
            }
            copyToAll.add(toNotSpaces);
            return this;
        }

        @Override
        public IFillContentBuilder copyToAll(List<String> coToAll) {
            copyToAll.addAll(coToAll.stream()
                    .filter(Objects::nonNull)
                    .map(String::trim)
                    .collect(Collectors.toList()));
            return this;
        }

        @Override
        public IFinalEmailBuilder addContent(String content) {
            return new FinalEmailBuilderImpl(new Content(content, from), from, subject, recipients, copyToAll);
        }
    }

    public static class FinalEmailBuilderImpl implements IFinalEmailBuilder {

        private final Content content;
        private final String from;
        private final String subject;
        private final HashSet<String> recipients;
        private final HashSet<String> copyToAll;

        public FinalEmailBuilderImpl(Content content, String from, String subject, HashSet<String> recipients, HashSet<String> copyToAll) {
            this.content = content;
            this.from = from;
            this.subject = subject;
            this.recipients = recipients;
            this.copyToAll = copyToAll;
        }

        @Override
        public Email build() {
            return new Email(subject, from, recipients, copyToAll, content);
        }
    }


    public interface IFillSubjectBuilder {
        IFillRecipientBuilder addFrom();

        IFillRecipientBuilder addFrom(String from);
    }

    public interface IFillRecipientBuilder extends IFillCopyToBuilder {
        IFillRecipientBuilder addTo(String to);

        IFillRecipientBuilder addToAll(List<String> toAll);
    }

    public interface IFillCopyToBuilder {
        IFillContentBuilder copyTo(String copyTo);

        IFillContentBuilder copyToAll(List<String> coToAll);
    }

    public interface IFillContentBuilder extends IFillCopyToBuilder {
        IFinalEmailBuilder addContent(String content);
    }

    public interface IFinalEmailBuilder {
        Email build();
    }

}
