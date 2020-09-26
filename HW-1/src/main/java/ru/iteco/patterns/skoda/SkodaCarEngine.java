package ru.iteco.patterns.skoda;

import ru.iteco.patterns.specifications.AbstractCarEngine;
import ru.iteco.patterns.specifications.FuelType;

public class SkodaCarEngine extends AbstractCarEngine {

    public SkodaCarEngine(int enginePower, FuelType fuelType) {
        super(enginePower, fuelType);
    }
}
