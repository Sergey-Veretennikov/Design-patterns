package ru.iteco.decorator;

public class ChatRoomDecoratorHidingUser extends ChatRoomDecoratorBase {

    public ChatRoomDecoratorHidingUser(ChatRoom chatRoom) {
        super(chatRoom);
    }

    @Override
    protected Message onBeforeChatRoom(Message message) {
        message.setAuthor(Author.name(message.getAuthor()).getCode());
        return message;
    }

    @Override
    protected Message onAfterChatRoom(Message message) {
        message.setAuthor(Author.code(message.getAuthor()).getName());
        return super.onAfterChatRoom(message);
    }
}
