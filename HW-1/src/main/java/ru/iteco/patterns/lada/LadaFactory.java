package ru.iteco.patterns.lada;

import ru.iteco.patterns.AbstractCars;
import ru.iteco.patterns.CarFactory;
import ru.iteco.patterns.CarFactorySpecifications;

public class LadaFactory implements CarFactory {

    private CarFactorySpecifications factorySpecifications;

    public LadaFactory() {
        this.factorySpecifications = new LadaFactorySpecifications();
    }

    @Override
    public AbstractCars createCars() {
        return new Lada(factorySpecifications.createAbstractCarBody(),
                factorySpecifications.createAbstractCarEngine(),
                factorySpecifications.createAbstractCarInterior());
    }
}
