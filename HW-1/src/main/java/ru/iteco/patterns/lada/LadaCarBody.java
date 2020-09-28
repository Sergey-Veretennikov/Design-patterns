package ru.iteco.patterns.lada;

import ru.iteco.patterns.specifications.AbstractCarBody;
import ru.iteco.patterns.specifications.KindMachine;

public class LadaCarBody extends AbstractCarBody {

    public LadaCarBody(String name, String color, KindMachine kindMachine) {
        super(name, color, kindMachine);
    }
}
