package ru.iteco.decorator;

public class Main {
    public static void main(String[] args) {

        Message message = new Message("Иванов Иван", "ssdss", "asd  sda12587  sdawqw");

        ChatRoom chatRoom = new ChatRoomImpl();
        chatRoom = new DecoratorBuilder(chatRoom)
                .withHidingUser()
                .withMessageEncryption()
                .build();

        chatRoom.sendMessage(message);
        System.out.println("Modified message = " + message);
        System.out.println(chatRoom.receivedMessage());
    }
}
