package ru.iteco.builder;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class EmailBuilder {

    public IFillSubjectBuilder addSubject(String subject) {
        return new FillSubjectBuilderImpl(subject);
    }

    private static class FillSubjectBuilderImpl implements IFillSubjectBuilder {

        private final String subject;
        private final static String FROM_DEFAULT = "Иванов Иван Иванович";

        private FillSubjectBuilderImpl(String subject) {
            this.subject = subject;
        }

        @Override
        public IFillFromBuilder addFrom() {
            return new FillFromBuilderImpl(FROM_DEFAULT, subject);
        }

        @Override
        public IFillFromBuilder addFrom(String from) {
            return new FillFromBuilderImpl(from, subject);
        }
    }

    private static class FillFromBuilderImpl implements IFillFromBuilder {

        private final String from;
        private final String subject;
        private final Set<String> recipients = new HashSet<>();

        private FillFromBuilderImpl(String from, String subject) {
            this.from = from;
            this.subject = subject;
        }

        @Override
        public IFillRecipientBuilder addTo(String to) {
            if (to == null) {
                return new FillRecipientBuilderImpl(from, subject, recipients);
            }
            recipients.add(to.trim());
            return new FillRecipientBuilderImpl(from, subject, recipients);
        }

        @Override
        public IFillRecipientBuilder addToAll(List<String> toAll) {
            recipients.addAll(toAll.stream()
                    .filter(Objects::nonNull)
                    .map(String::strip)
                    .collect(Collectors.toList()));
            return new FillRecipientBuilderImpl(from, subject, recipients);
        }
    }

    private static class FillRecipientBuilderImpl implements IFillRecipientBuilder {

        private final String from;
        private final String subject;
        private final Set<String> recipients;
        private final Set<String> copyToAll = new HashSet<>();


        private FillRecipientBuilderImpl(String from, String subject, Set<String> recipients) {
            this.from = from;
            this.subject = subject;
            this.recipients = recipients;
        }

        @Override
        public IFillRecipientBuilder addTo(String to) {
            var toNotSpaces = to.trim();
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
        public IFillCopyToBuilder copyTo(String copyTo) {
            if (copyTo == null) {
                return new FillCopyToBuilderImpl(from, subject, recipients, copyToAll);
            }
            copyToAll.add(copyTo.trim());
            return new FillCopyToBuilderImpl(from, subject, recipients, copyToAll);
        }

        @Override
        public IFillCopyToBuilder copyToAll(List<String> copToAll) {
            copyToAll.addAll(copToAll.stream()
                    .filter(Objects::nonNull)
                    .map(String::trim)
                    .filter(c -> !copyToAll.contains(c))
                    .collect(Collectors.toList()));
            return new FillCopyToBuilderImpl(from, subject, recipients, copyToAll);
        }
    }

    public static class FillCopyToBuilderImpl implements IFillCopyToBuilder {

        private final String from;
        private final String subject;
        private final Set<String> recipients;
        private final Set<String> copyToAll;

        public FillCopyToBuilderImpl(String from, String subject, Set<String> recipients, Set<String> copyToAll) {
            this.from = from;
            this.subject = subject;
            this.recipients = recipients;
            this.copyToAll = copyToAll;
        }

        @Override
        public IFillCopyToBuilder copyTo(String copyTo) {
            var toNotSpaces = copyTo.trim();
            if (copyToAll.contains(toNotSpaces)) {
                return this;
            }
            copyToAll.add(toNotSpaces);
            return this;
        }

        @Override
        public IFillCopyToBuilder copyToAll(List<String> copToAll) {
            copyToAll.addAll(copToAll.stream()
                    .filter(Objects::nonNull)
                    .map(String::trim)
                    .filter(c -> !copyToAll.contains(c))
                    .collect(Collectors.toList()));
            return this;
        }

        @Override
        public IFillContentBuilder addContent(String content) {
            return new FillContentBuilderImpl(new Content(content, from), from, subject, recipients, copyToAll);
        }
    }

    public static class FillContentBuilderImpl implements IFillContentBuilder {

        private final Content content;
        private final String from;
        private final String subject;
        private final Set<String> recipients;
        private final Set<String> copyToAll;

        public FillContentBuilderImpl(Content content, String from, String subject, Set<String> recipients, Set<String> copyToAll) {
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
        IFillFromBuilder addFrom();

        IFillFromBuilder addFrom(String from);
    }

    public interface IFillFromBuilder {
        IFillRecipientBuilder addTo(String to);

        IFillRecipientBuilder addToAll(List<String> toAll);
    }

    public interface IFillRecipientBuilder {
        IFillRecipientBuilder addTo(String to);

        IFillRecipientBuilder addToAll(List<String> toAll);

        IFillCopyToBuilder copyTo(String copyTo);

        IFillCopyToBuilder copyToAll(List<String> coToAll);
    }

    public interface IFillCopyToBuilder {
        IFillCopyToBuilder copyTo(String copyTo);

        IFillCopyToBuilder copyToAll(List<String> coToAll);

        IFillContentBuilder addContent(String content);
    }

    public interface IFillContentBuilder {
        Email build();
    }
}
