package ru.iteco.behavioral.visitor;

import ru.iteco.behavioral.visitor.after.*;

public class Main {

    public static void main(String[] args) {

        VisFigures[] visFigures = {
                new VisCircle(),
                new VisRectangle(),
                new VisTriangle()};

        var areaVisitor = new AreaVisitor();
        var drawVisitor = new DrawVisitor(5, 10);
        var perimeterVisitor = new PerimeterVisitor();
        var radiusVisitor = new RadiusVisitor();
        for (VisFigures visFigure : visFigures) {
            visFigure.accept(areaVisitor);
            visFigure.accept(drawVisitor);
            visFigure.accept(perimeterVisitor);
            visFigure.accept(radiusVisitor);
        }
    }
}
