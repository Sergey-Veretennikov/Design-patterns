package ru.iteco.decorator;

public class DecoratorBuilder {

    private ChatRoom chatRoom;

    public DecoratorBuilder(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public DecoratorBuilder withHidingUser() {
        chatRoom = new ChatRoomDecoratorHidingUser(chatRoom);
        return this;
    }

    public DecoratorBuilder withMessageEncryption() {
        chatRoom = new ChatRoomDecoratorMessageEncryption(chatRoom);
        return this;
    }

    public ChatRoom build() {
        return chatRoom;
    }
}
