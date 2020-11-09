package ru.iteco.behavioral.state;

public class SelectedDocumentState implements State {

    @Override
    public String toCloseMachine() {
        return null;
    }

    @Override
    public String baseState() {
        return null;
    }

    @Override
    public String depositMoney(int money) {
        return null;
    }

    @Override
    public String selectedDevice(Device device) {
        return null;
    }

    @Override
    public String selectedDocument(String name) {
        return "Вы выбрали документ: " + name;
    }

    @Override
    public String PrintDocumentState() {
        return null;
    }
}
