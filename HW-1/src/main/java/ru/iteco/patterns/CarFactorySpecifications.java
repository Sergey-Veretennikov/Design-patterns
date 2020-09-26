package ru.iteco.patterns;

import ru.iteco.patterns.specifications.AbstractCarBody;
import ru.iteco.patterns.specifications.AbstractCarEngine;
import ru.iteco.patterns.specifications.AbstractCarInterior;

public interface CarFactorySpecifications {

    AbstractCarBody createAbstractCarBody();

    AbstractCarEngine createAbstractCarEngine();

    AbstractCarInterior createAbstractCarInterior();
}
