package ru.iteco.behavioral.visitor.after;

public class VisCircle extends VisFigures {

    public VisCircle() {
        super("VisCircle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
