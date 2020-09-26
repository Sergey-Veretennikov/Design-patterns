package ru.iteco.patterns.lada;

import ru.iteco.patterns.CarFactorySpecifications;
import ru.iteco.patterns.specifications.*;

public class LadaFactorySpecifications implements CarFactorySpecifications {

    @Override
    public AbstractCarBody createAbstractCarBody() {
        return new LadaCarBody("Lada", "Бежевая", KindMachine.HATCHBACK);
    }

    @Override
    public AbstractCarEngine createAbstractCarEngine() {
        return new LadaCarEngine(90, FuelType.BENZINE);
    }

    @Override
    public AbstractCarInterior createAbstractCarInterior() {
        return new LadaCarInterior("Одноцветный", "Светлый", "Тканевый");
    }
}
