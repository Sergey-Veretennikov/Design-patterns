package ru.iteco.patterns.skoda;

import ru.iteco.patterns.AbstractCars;
import ru.iteco.patterns.specifications.AbstractCarBody;
import ru.iteco.patterns.specifications.AbstractCarEngine;
import ru.iteco.patterns.specifications.AbstractCarInterior;

public class Skoda extends AbstractCars {

    public Skoda(AbstractCarBody carBody, AbstractCarEngine carEngine, AbstractCarInterior carInterior) {
        super(carBody, carEngine, carInterior);
    }
}
