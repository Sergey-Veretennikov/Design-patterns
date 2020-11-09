package ru.iteco.behavioral.state;

public class SelectedDeviceState implements State {

    @Override
    public String toCloseMachine(int money) {
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
        return "Вы выбрали: " + device.name();
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
        return null;
    }
}
