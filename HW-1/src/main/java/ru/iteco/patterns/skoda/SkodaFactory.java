package ru.iteco.patterns.skoda;

import ru.iteco.patterns.AbstractCars;
import ru.iteco.patterns.CarFactory;
import ru.iteco.patterns.CarFactorySpecifications;

public class SkodaFactory implements CarFactory {

    private CarFactorySpecifications factorySpecifications;

    public SkodaFactory() {
        this.factorySpecifications = new SkodaFactorySpecifications();
    }

    @Override
    public AbstractCars createCars() {
        return new Skoda(factorySpecifications.createAbstractCarBody(),
                factorySpecifications.createAbstractCarEngine(),
                factorySpecifications.createAbstractCarInterior());
    }
}
