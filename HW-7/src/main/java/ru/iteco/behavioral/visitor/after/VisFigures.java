package ru.iteco.behavioral.visitor.after;

public abstract class VisFigures {

    private String name;

    public VisFigures(String name) {
        this.name = name;
    }

    public abstract void accept(Visitor visitor);

    public String getName() {
        return name;
    }
}
