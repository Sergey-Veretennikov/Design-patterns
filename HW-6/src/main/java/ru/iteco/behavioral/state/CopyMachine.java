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
        public SelectedDevice selectedDevice(Device dev) {
            state = new SelectedDeviceState();
            System.out.println(state.selectedDevice(dev));
            return new SelectedDeviceImpl();
        }

        @Override
        public CopyMachine toCloseMachine() {
            return machine.copyMachine();
        }
    }

    public interface SelectedDevice extends Cancel {
        SelectedDocument selectedDocument(String nameDocument);
    }

    private class SelectedDeviceImpl implements SelectedDevice {

        @Override
        public SelectedDocument selectedDocument(String nameDocument) {
            state = new SelectedDocumentState();
            System.out.println(state.selectedDocument(nameDocument));
            return new SelectedDocumentImpl();
        }

        @Override
        public CopyMachine toCloseMachine() {
            return machine.copyMachine();
        }
    }

    public interface SelectedDocument extends Cancel {
        PrintDocument printDocument();
    }

    private class SelectedDocumentImpl implements SelectedDocument {

        @Override
        public CopyMachine toCloseMachine() {
            return machine.copyMachine();
        }

        @Override
        public PrintDocument printDocument() {
            calculate();
            state = new PrintDocumentState();
            System.out.println(state.printDocumentState());
            return new PrintDocumentImpl();
        }
    }

    public interface PrintDocument extends Cancel {
        PrintDocument printDocument();

        CopyMachine goTakeMoney();
    }

    private class PrintDocumentImpl implements PrintDocument {

        @Override
        public CopyMachine toCloseMachine() {
            return machine.copyMachine();
        }

        @Override
        public PrintDocument printDocument() {
            calculate();
            state = new PrintDocumentState();
            System.out.println(state.printDocumentState());
            return new PrintDocumentImpl();
        }

        @Override
        public CopyMachine goTakeMoney() {
            state = new GoTakeMoneyState();
            System.out.println(state.goTakeMoney(money));
            return new CopyMachine();
        }
    }

    private State state;
    private int money;
    private final CopyMachine machine;

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

    private void calculate() {
        this.money = money - 5;
    }

    private CopyMachine copyMachine() {
        state = new BaseState();
        System.out.println(state.toCloseMachine(money));
        return new CopyMachine();
    }
}
