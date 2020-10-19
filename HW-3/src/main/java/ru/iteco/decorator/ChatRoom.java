package ru.iteco.decorator;

public interface ChatRoom {

    Message receivedMessage();

    void sendMessage(Message message);
}
