package ru.iteco.behavioral.visitor.after;

/**
 * VisHomeplants.
 *
 * @author Ilya_Sukhachev
 */
public abstract class VisHomeplants {

    public String name;

    public VisHomeplants(String name) {
        this.name = name;
    }

    public abstract void accept(Visitor visitor);

    public String getName() {
        return name;
    }
}
