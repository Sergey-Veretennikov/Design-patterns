package ru.iteco.patterns.bmw;

import ru.iteco.patterns.AbstractCars;
import ru.iteco.patterns.CarFactory;
import ru.iteco.patterns.CarFactorySpecifications;

public class BmwFactory implements CarFactory {

    private CarFactorySpecifications factorySpecifications;

    public BmwFactory() {
        this.factorySpecifications = new BmwFactorySpecifications();
    }

    @Override
    public AbstractCars createCars() {
        return new Bmw(factorySpecifications.createAbstractCarBody(),
                factorySpecifications.createAbstractCarEngine(),
                factorySpecifications.createAbstractCarInterior());
    }
}
