package ru.iteco.patterns;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream.of("bmw", "lada", "skoda", "", "audi")
        .map(CarFactoryHelper::create)
        .forEach(System.out::println);
    }
}
