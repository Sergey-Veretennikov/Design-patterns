package ru.iteco.patterns.specifications;

public abstract class AbstractCarBody {

    private String name;
    private String color;
    private KindMachine kindMachine;

    public AbstractCarBody(String name, String color, KindMachine kindMachine) {
        this.name = name;
        this.color = color;
        this.kindMachine = kindMachine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public KindMachine getKindMachine() {
        return kindMachine;
    }

    public void setKindMachine(KindMachine kindMachine) {
        this.kindMachine = kindMachine;
    }

    @Override
    public String toString() {
        return "CarBody{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", kindMachine=" + kindMachine +
                '}';
    }
}
