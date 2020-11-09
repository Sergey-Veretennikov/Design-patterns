package ru.iteco.behavioral.state;

public class CopyMachine {

    public interface Cancel {
        CopyMachine toCloseMachine();
    }

    public interface DepositMoney extends Cancel {
        SelectedDevice selectedDevice(Device device);
    }

    private class DepositMoneyImpl implements DepositMoney {

        @Override
        public SelectedDevice selectedDevice(Device device) {
            setState(new SelectedDeviceState());
            System.out.println(getState().selectedDevice(device));
            setDevice(device);
            return new SelectedDeviceImpl();
        }

        @Override
        public CopyMachine toCloseMachine() {
            return getMachine().copyMachine();
        }
    }

    public interface SelectedDevice extends Cancel {
        SelectedDocument selectedDocument(String nameDocument);
    }

    private class SelectedDeviceImpl implements SelectedDevice {

        @Override
        public SelectedDocument selectedDocument(String nameDocument) {
            calculate();
            setState(new SelectedDocumentState());
            System.out.println(getState().selectedDocument(nameDocument));
            return new SelectedDocumentImpl();
        }

        @Override
        public CopyMachine toCloseMachine() {
            return getMachine().copyMachine();
        }
    }

    public interface SelectedDocument extends Cancel {
        PrintDocument printDocument();
    }

    private class SelectedDocumentImpl implements SelectedDocument {

        @Override
        public CopyMachine toCloseMachine() {
            return getMachine().copyMachine();
        }

        @Override
        public PrintDocument printDocument() {
            return null;
        }
    }

    public interface PrintDocument {

    }

    private State state;
    private int money;
    private Device device;
    private String name;
    private CopyMachine machine;

    public CopyMachine() {
        this.state = new BaseState();
        this.machine = this;
        System.out.println(state.baseState());
    }

    public DepositMoney depositMoney(int money) {
        this.state = new DepositMoneyState();
        System.out.println(state.depositMoney(money));
        this.money = money;
        return new DepositMoneyImpl();
    }

    private void setDevice(Device device) {
        this.device = device;
    }

    private void setState(State state) {
        this.state = state;
    }

    private void calculate() {
        this.money = money - 5;
    }

    private State getState() {
        return this.state;
    }

    private CopyMachine copyMachine() {
        setState(new BaseState());
        System.out.println(getState().toCloseMachine());
        return new CopyMachine();
    }

    private CopyMachine getMachine(){
        return this;
    }
}
