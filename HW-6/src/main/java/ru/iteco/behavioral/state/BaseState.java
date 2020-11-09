package ru.iteco.behavioral.state;

public class BaseState implements State {

    @Override
    public String toCloseMachine() {
        return "Вы вернулись в начало";
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
        return null;
    }

    @Override
    public String PrintDocumentState() {
        return null;
    }

    @Override
    public String baseState() {
        return "Внесите деньги";
    }
}
