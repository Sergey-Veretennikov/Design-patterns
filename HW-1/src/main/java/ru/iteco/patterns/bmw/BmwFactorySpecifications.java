package ru.iteco.patterns.bmw;

import ru.iteco.patterns.CarFactorySpecifications;
import ru.iteco.patterns.specifications.*;

public class BmwFactorySpecifications implements CarFactorySpecifications {

    @Override
    public AbstractCarBody createAbstractCarBody() {
        return new BmwCarBody("BMW", "Черный", KindMachine.HATCHBACK);
    }

    @Override
    public AbstractCarEngine createAbstractCarEngine() {
        return new BmwCarEngine(205, FuelType.BENZINE);
    }

    @Override
    public AbstractCarInterior createAbstractCarInterior() {
        return new BmwCarInterior("Одноцветный", "Черный", "Кожзам");
    }
}
