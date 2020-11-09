package ru.iteco.behavioral.state;

public class DepositMoneyState implements State {

    @Override
    public String baseState() {
        return null;
    }

    @Override
    public String toCloseMachine() {
        return null;
    }

    @Override
    public String depositMoney(int money) {
        return "Внесено: " + money + " рублей.";
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
}
