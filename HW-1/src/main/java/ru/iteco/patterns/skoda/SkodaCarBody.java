package ru.iteco.patterns.skoda;

import ru.iteco.patterns.specifications.AbstractCarBody;
import ru.iteco.patterns.specifications.KindMachine;

public class SkodaCarBody extends AbstractCarBody {

    public SkodaCarBody(String name, String color, KindMachine kindMachine) {
        super(name, color, kindMachine);
    }
}
