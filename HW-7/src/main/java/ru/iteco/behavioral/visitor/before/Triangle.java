package ru.iteco.behavioral.visitor.before;

public class Triangle extends Figures {

    public Triangle() {
        super("Triangle");
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Figure Triangle draw x = " + x + "y = " + y);
    }

    @Override
    public void getArea() {
        System.out.println("Area");
    }

    @Override
    public void getPerimeter() {
        System.out.println("Add Rectangle");
    }

    @Override
    public void getRadius() {
        System.out.println("Add Circle");
    }
}
