package ru.iteco.patterns.specifications;

public abstract class AbstractCarEngine {

    private int enginePower;
    private FuelType fuelType;

    public AbstractCarEngine(int enginePower, FuelType fuelType) {
        this.enginePower = enginePower;
        this.fuelType = fuelType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "CarEngine{" +
                "enginePower=" + enginePower +
                ", fuelType=" + fuelType +
                '}';
    }
}
