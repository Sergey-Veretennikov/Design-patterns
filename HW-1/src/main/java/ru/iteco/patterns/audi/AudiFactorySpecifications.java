package ru.iteco.patterns.audi;

import ru.iteco.patterns.CarFactorySpecifications;
import ru.iteco.patterns.specifications.*;

public class AudiFactorySpecifications implements CarFactorySpecifications {

    @Override
    public AbstractCarBody createAbstractCarBody() {
        return new AudiCarBody("Audi", "красный", KindMachine.SUV);
    }

    @Override
    public AbstractCarEngine createAbstractCarEngine() {
        return new AudiCarEngine(150, FuelType.DIESEL);
    }

    @Override
    public AbstractCarInterior createAbstractCarInterior() {
        return new AudiCarInterior("Комбинированный", "бежевый", "кожа");
    }
}
