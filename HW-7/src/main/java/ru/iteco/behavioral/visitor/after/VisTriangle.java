package ru.iteco.behavioral.visitor.after;

public class VisTriangle extends VisFigures {

    public VisTriangle() {
        super("VisTriangle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
