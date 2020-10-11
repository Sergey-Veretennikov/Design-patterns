package ru.iteco.builder;

public class Content {

    private final String body;

    private final String signature;

    public Content(String body, String from) {
        this.body = body;
        this.signature = "С уважением," + from;
    }

    @Override
    public String toString() {
        return "Content{" +
                "body='" + body + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }
}
