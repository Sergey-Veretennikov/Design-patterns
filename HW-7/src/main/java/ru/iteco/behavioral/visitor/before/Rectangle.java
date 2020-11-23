package ru.iteco.behavioral.visitor.before;

public class Rectangle extends Figures {

    public Rectangle() {
        super("Rectangle");
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Figure Rectangle draw x = " + x + "y = " + y);
    }

    @Override
    public void getArea() {
        System.out.println("Add Triangle");
    }

    @Override
    public void getPerimeter() {
        System.out.println("Rectangle");

    }

    @Override
    public void getRadius() {
        System.out.println("Add Circle");
    }
}
