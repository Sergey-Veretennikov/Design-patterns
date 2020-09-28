package ru.iteco.patterns.lada;

import ru.iteco.patterns.AbstractCars;
import ru.iteco.patterns.specifications.AbstractCarBody;
import ru.iteco.patterns.specifications.AbstractCarEngine;
import ru.iteco.patterns.specifications.AbstractCarInterior;

public class Lada extends AbstractCars {

    public Lada(AbstractCarBody carBody, AbstractCarEngine carEngine, AbstractCarInterior carInterior) {
        super(carBody, carEngine, carInterior);
    }
}
