package ru.iteco.behavioral.visitor.after;

public class AreaVisitor extends Visitor {

    public AreaVisitor() {
        super("Area");
    }

    @Override
    public void visit(VisCircle figures) {
        System.out.println("Add Triangle");
    }

    @Override
    public void visit(VisRectangle figures) {
        System.out.println("Add Triangle");
    }

    @Override
    public void visit(VisTriangle figures) {
        System.out.println("Area");
    }
}
