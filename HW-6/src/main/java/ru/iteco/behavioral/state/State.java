package ru.iteco.behavioral.state;

public interface State {

    String baseState();

    String toCloseMachine(int money);

    String depositMoney(int money);

    String selectedDevice(Device device);

    String selectedDocument(String name);

    String printDocumentState();

    String goTakeMoney(int money);
}
