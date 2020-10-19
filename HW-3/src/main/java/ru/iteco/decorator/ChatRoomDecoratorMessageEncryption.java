package ru.iteco.decorator;

public class ChatRoomDecoratorMessageEncryption extends ChatRoomDecoratorBase {

    private static final String VALUE = "Tекст зашифрован <";

    public ChatRoomDecoratorMessageEncryption(ChatRoom chatRoom) {
        super(chatRoom);
    }

    @Override
    protected Message onBeforeChatRoom(Message message) {
        message.setMessageText(VALUE + message.getMessageText() + ">");
        return message;
    }

    @Override
    protected Message onAfterChatRoom(Message message) {
        message.setMessageText(message.getMessageText().substring(VALUE.length(), message.getMessageText().length() - 1));
        return super.onAfterChatRoom(message);
    }
}
