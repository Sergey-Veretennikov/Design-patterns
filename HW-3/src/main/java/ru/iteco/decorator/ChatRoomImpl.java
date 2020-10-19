package ru.iteco.decorator;

public class ChatRoomImpl implements ChatRoom {

    private Message message;

    @Override
    public Message receivedMessage() {
        return message;
    }

    @Override
    public void sendMessage(Message message) {
        this.message = message;
    }
}
