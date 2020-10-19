package ru.iteco.decorator;

public class ChatRoomDecoratorBase implements ChatRoom {

    protected ChatRoom chatRoom;

    public ChatRoomDecoratorBase(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    @Override
    public Message receivedMessage() {
        Message message = chatRoom.receivedMessage();
        return onAfterChatRoom(message);
    }

    @Override
    public void sendMessage(Message message) {
        Message mes = onBeforeChatRoom(message);
        chatRoom.sendMessage(mes);
    }

    protected Message onBeforeChatRoom(Message message) {
        return message;
    }

    protected Message onAfterChatRoom(Message message) {
        return message;
    }

}
