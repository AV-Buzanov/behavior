package ru.iteco.behavioral.visitor.after;

/**
 * VisLongCactus.
 *
 * @author Ilya_Sukhachev
 */
public class VisLongCactus extends VisHomeplants {

    public VisLongCactus() {
        super("VisLongCactus");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
