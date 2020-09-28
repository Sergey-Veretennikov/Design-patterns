package ru.iteco.patterns.bmw;

import ru.iteco.patterns.AbstractCars;
import ru.iteco.patterns.specifications.AbstractCarBody;
import ru.iteco.patterns.specifications.AbstractCarEngine;
import ru.iteco.patterns.specifications.AbstractCarInterior;

public class Bmw extends AbstractCars {

    public Bmw(AbstractCarBody carBody, AbstractCarEngine carEngine, AbstractCarInterior carInterior) {
        super(carBody, carEngine, carInterior);
    }
}
