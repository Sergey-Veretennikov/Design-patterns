package ru.iteco.patterns;

import ru.iteco.patterns.audi.AudiFactory;
import ru.iteco.patterns.bmw.BmwFactory;
import ru.iteco.patterns.lada.LadaFactory;
import ru.iteco.patterns.skoda.SkodaFactory;

public class CarFactoryHelper {

    public static AbstractCars create(String name) {
        switch (name) {
            case "audi":
                return new AudiFactory().createCars();
            case "bmw":
                return new BmwFactory().createCars();
            case "lada":
                return new LadaFactory().createCars();
            case "skoda":
                return new SkodaFactory().createCars();
            default:
                return null;
        }
    }
}
