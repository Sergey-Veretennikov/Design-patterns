package ru.iteco.behavioral.visitor.after;

public class PerimeterVisitor extends Visitor {

    public PerimeterVisitor() {
        super("PerimeterVisitor");
    }

    @Override
    public void visit(VisCircle figures) {
        System.out.println("Add Rectangle");
    }

    @Override
    public void visit(VisRectangle figures) {
        System.out.println("Perimeter");
    }

    @Override
    public void visit(VisTriangle figures) {
        System.out.println("Add Rectangle");
    }
}
