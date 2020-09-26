package ru.iteco.patterns;

import ru.iteco.patterns.specifications.AbstractCarBody;
import ru.iteco.patterns.specifications.AbstractCarEngine;
import ru.iteco.patterns.specifications.AbstractCarInterior;

public abstract class AbstractCars {

    private AbstractCarBody carBody;
    private AbstractCarEngine carEngine;
    private AbstractCarInterior carInterior;

    public AbstractCars(AbstractCarBody carBody, AbstractCarEngine carEngine, AbstractCarInterior carInterior) {
        this.carBody = carBody;
        this.carEngine = carEngine;
        this.carInterior = carInterior;
    }

    public AbstractCarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(AbstractCarBody carBody) {
        this.carBody = carBody;
    }

    public AbstractCarEngine getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(AbstractCarEngine carEngine) {
        this.carEngine = carEngine;
    }

    public AbstractCarInterior getCarInterior() {
        return carInterior;
    }

    public void setCarInterior(AbstractCarInterior carInterior) {
        this.carInterior = carInterior;
    }

    @Override
    public String toString() {
        return "Cars{" + carBody +
                ", " + carEngine +
                ", " + carInterior +
                '}';
    }
}
