package ru.iteco.patterns.audi;

import ru.iteco.patterns.specifications.AbstractCarEngine;
import ru.iteco.patterns.specifications.FuelType;

public class AudiCarEngine extends AbstractCarEngine {

    public AudiCarEngine(int enginePower, FuelType fuelType) {
        super(enginePower, fuelType);
    }
}
