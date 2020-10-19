package ru.iteco.decorator;

public class Message {

    private String author;

    private String addressee;

    private String messageText;

    public Message(String author, String addressee, String messageText) {
        this.author = author;
        this.addressee = addressee;
        this.messageText = messageText;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getAuthor() {
        return author;
    }

    public String getAddressee() {
        return addressee;
    }

    public String getMessageText() {
        return messageText;
    }

    @Override
    public String toString() {
        return "Message{" +
                "author='" + author + '\'' +
                ", addressee='" + addressee + '\'' +
                ", messageText='" + messageText + '\'' +
                '}';
    }
}
