package ru.iteco.builder;

import java.util.Set;

public class Email {

    private final String subject;
    private final String from;
    private final Set<String> toAll;
    private final Set<String> toCopy;
    private final Content content;

    public Email(String subject, String from, Set<String> toAll, Set<String> toCopy, Content content) {
        this.subject = subject;
        this.from = from;
        this.toAll = toAll;
        this.toCopy = toCopy;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Email{" +
                "subject='" + subject + '\'' +
                ", from='" + from + '\'' +
                ", toAll=" + toAll +
                ", toCopy=" + toCopy +
                ", " + content +
                '}';
    }
}
