package ru.iteco.behavioral.visitor.after;

public class RadiusVisitor extends Visitor {

    public RadiusVisitor() {
        super("RadiusVisitor");
    }

    @Override
    public void visit(VisCircle figures) {
        System.out.println("Radius");
    }

    @Override
    public void visit(VisRectangle figures) {
        System.out.println("Add Circle");
    }

    @Override
    public void visit(VisTriangle figures) {
        System.out.println("Add Circle");
    }
}
