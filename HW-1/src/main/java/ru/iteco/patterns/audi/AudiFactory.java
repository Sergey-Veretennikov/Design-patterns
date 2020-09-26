package ru.iteco.patterns.audi;

import ru.iteco.patterns.AbstractCars;
import ru.iteco.patterns.CarFactory;
import ru.iteco.patterns.CarFactorySpecifications;

public class AudiFactory implements CarFactory {

    private CarFactorySpecifications factorySpecifications;

    public AudiFactory() {
        this.factorySpecifications = new AudiFactorySpecifications();
    }

    @Override
    public AbstractCars createCars() {
        return new Audi(factorySpecifications.createAbstractCarBody(),
                factorySpecifications.createAbstractCarEngine(),
                factorySpecifications.createAbstractCarInterior());
    }
}
