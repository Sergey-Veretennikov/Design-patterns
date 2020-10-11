package ru.iteco.builder;

import java.util.HashSet;

public class Email {

    private final String subject;
    private final String from;
    private final HashSet<String> toAll;
    private final HashSet<String> toCopy;
    private final Content content;

    public Email(String subject, String from, HashSet<String> toAll, HashSet<String> toCopy, Content content) {
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
