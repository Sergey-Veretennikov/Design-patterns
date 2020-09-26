package ru.iteco.patterns.bmw;

import ru.iteco.patterns.specifications.AbstractCarBody;
import ru.iteco.patterns.specifications.KindMachine;

public class BmwCarBody extends AbstractCarBody {

    public BmwCarBody(String name, String color, KindMachine kindMachine) {
        super(name, color, kindMachine);
    }
}
