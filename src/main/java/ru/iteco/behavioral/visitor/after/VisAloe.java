package ru.iteco.behavioral.visitor.after;

/**
 * VisLongCactus.
 *
 * @author Ilya_Sukhachev
 */
public class VisAloe extends VisHomeplants {

    public VisAloe() {
        super("VisAloe");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
