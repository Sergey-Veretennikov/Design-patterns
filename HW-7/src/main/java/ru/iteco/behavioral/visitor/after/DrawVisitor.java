package ru.iteco.behavioral.visitor.after;

public class DrawVisitor extends Visitor {

    private int x;
    private int y;

    public DrawVisitor(int x, int y) {
        super("Draw");
        this.x = x;
        this.y = y;
    }

    @Override
    public void visit(VisCircle figures) {
        System.out.println("Draw x=" + x + "y= " + y);
    }

    @Override
    public void visit(VisRectangle figures) {
        System.out.println("Draw x=" + x + "y= " + y);
    }

    @Override
    public void visit(VisTriangle figures) {
        System.out.println("Draw x=" + x + "y= " + y);
    }
}
