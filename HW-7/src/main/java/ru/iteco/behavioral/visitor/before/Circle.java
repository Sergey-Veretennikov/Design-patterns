package ru.iteco.behavioral.visitor.before;

public class Circle extends Figures {

    public Circle() {
        super("Circle");
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Figure Circle draw x = " + x + "y = " + y);
    }

    @Override
    public void getArea() {
        System.out.println("Add Triangle");
    }

    @Override
    public void getPerimeter() {
        System.out.println("Add Rectangle");
    }

    @Override
    public void getRadius() {
        System.out.println("Radius");
    }
}
