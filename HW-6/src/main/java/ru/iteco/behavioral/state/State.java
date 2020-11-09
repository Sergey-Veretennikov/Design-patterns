package ru.iteco.behavioral.state;

public interface State {

    String baseState();

    String toCloseMachine();

    String depositMoney(int money);

    String selectedDevice(Device device);

    String selectedDocument(String name);

    String PrintDocumentState();
}
