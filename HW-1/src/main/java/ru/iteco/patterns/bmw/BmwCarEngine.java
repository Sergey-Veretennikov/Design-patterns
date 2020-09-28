package ru.iteco.patterns.bmw;

import ru.iteco.patterns.specifications.AbstractCarEngine;
import ru.iteco.patterns.specifications.FuelType;

public class BmwCarEngine extends AbstractCarEngine {

    public BmwCarEngine(int enginePower, FuelType fuelType) {
        super(enginePower, fuelType);
    }
}
