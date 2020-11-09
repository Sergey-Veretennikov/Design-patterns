package ru.iteco.behavioral;

import ru.iteco.behavioral.state.CopyMachine;
import ru.iteco.behavioral.state.Device;

public class Main {

    public static void main(String[] args) {
        new CopyMachine().depositMoney(10).selectedDevice(Device.USB).toCloseMachine().depositMoney(10)
                .selectedDevice(Device.USB).selectedDocument("qweqwe").printDocument();
    }
}
