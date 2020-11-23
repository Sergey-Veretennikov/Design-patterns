package ru.iteco.behavioral.visitor.after;

public class VisRectangle extends VisFigures {

    public VisRectangle() {
        super("VisRectangle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
