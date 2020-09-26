package ru.iteco.patterns.skoda;

import ru.iteco.patterns.CarFactorySpecifications;
import ru.iteco.patterns.specifications.*;

public class SkodaFactorySpecifications implements CarFactorySpecifications {

    @Override
    public AbstractCarBody createAbstractCarBody() {
        return new SkodaCarBody("Skoda", "Белая", KindMachine.SUV);
    }

    @Override
    public AbstractCarEngine createAbstractCarEngine() {
        return new SkodaCarEngine(190, FuelType.BENZINE);
    }

    @Override
    public AbstractCarInterior createAbstractCarInterior() {
        return new SkodaCarInterior("Одноцветный", "Светлый", "Кожанный");
    }
}
