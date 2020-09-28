package ru.iteco.patterns.audi;

import ru.iteco.patterns.specifications.AbstractCarBody;
import ru.iteco.patterns.specifications.KindMachine;

public class AudiCarBody extends AbstractCarBody {

    public AudiCarBody(String name, String color, KindMachine kindMachine) {
        super(name, color, kindMachine);
    }
}
