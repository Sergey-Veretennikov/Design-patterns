package ru.iteco.patterns.lada;

import ru.iteco.patterns.specifications.AbstractCarEngine;
import ru.iteco.patterns.specifications.FuelType;

public class LadaCarEngine extends AbstractCarEngine {

    public LadaCarEngine(int enginePower, FuelType fuelType) {
        super(enginePower, fuelType);
    }
}
