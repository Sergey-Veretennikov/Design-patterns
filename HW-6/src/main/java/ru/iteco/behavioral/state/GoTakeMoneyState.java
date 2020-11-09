package ru.iteco.behavioral.state;

public class GoTakeMoneyState implements State {
    @Override
    public String baseState() {
        return null;
    }

    @Override
    public String toCloseMachine(int money) {
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
        return null;
    }

    @Override
    public String printDocumentState() {
        return null;
    }

    @Override
    public String goTakeMoney(int money) {
        return "Заберите сдачу: " + money;
    }
}
