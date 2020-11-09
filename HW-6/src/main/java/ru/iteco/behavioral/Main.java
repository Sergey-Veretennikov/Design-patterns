package ru.iteco.behavioral;

import ru.iteco.behavioral.state.CopyMachine;
import ru.iteco.behavioral.state.Device;

public class Main {

    public static void main(String[] args) {
        new CopyMachine().depositMoney(100).selectedDevice(Device.USB).selectedDocument("qwert")
        .printDocument().printDocument().goTakeMoney();

        new CopyMachine().depositMoney(50).selectedDevice(Device.WI_FI).toCloseMachine()
                .depositMoney(50).selectedDevice(Device.WI_FI).selectedDocument("asdfg")
                .printDocument().goTakeMoney();
    }
}
