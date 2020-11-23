package ru.iteco.behavioral.visitor.before;

public abstract class Figures {

    private String name;

    public Figures(String name) {
        this.name = name;
    }

    public abstract void draw(int x, int y);

    public abstract void getArea();

    public abstract void getPerimeter();

    public abstract void getRadius();


    public String getName() {
        return name;
    }
}
