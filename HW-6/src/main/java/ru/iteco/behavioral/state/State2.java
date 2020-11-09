package ru.iteco.behavioral.state;

public abstract class State2 {

    protected CopyMachine copyMachine;

    public State2(CopyMachine copyMachine) {
        this.copyMachine = copyMachine;
    }

  /*  protected abstract String depositMoney();

    public abstract String selectedDevice();*/

    public abstract String toCloseMachine();
}
