package ru.iteco.patterns.audi;

import ru.iteco.patterns.AbstractCars;
import ru.iteco.patterns.specifications.AbstractCarBody;
import ru.iteco.patterns.specifications.AbstractCarEngine;
import ru.iteco.patterns.specifications.AbstractCarInterior;

public class Audi extends AbstractCars {

    public Audi(AbstractCarBody carBody, AbstractCarEngine carEngine, AbstractCarInterior carInterior) {
        super(carBody, carEngine, carInterior);
    }
}
