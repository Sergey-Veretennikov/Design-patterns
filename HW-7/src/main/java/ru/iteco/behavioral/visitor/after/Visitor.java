package ru.iteco.behavioral.visitor.after;

import ru.iteco.behavioral.visitor.before.Circle;
import ru.iteco.behavioral.visitor.before.Rectangle;
import ru.iteco.behavioral.visitor.before.Triangle;

public abstract class Visitor {

    private String operationName;

    protected Visitor(String operationName) {
        this.operationName = operationName;
    }

    public abstract void visit(VisCircle figures);

    public abstract void visit(VisRectangle figures);

    public abstract void visit(VisTriangle figures);

    public String getOperationName() {
        return operationName;
    }
}
