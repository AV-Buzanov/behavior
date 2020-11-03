package ru.iteco.behavioral.visitor.after;

/**
 * VisLongCactus.
 *
 * @author Ilya_Sukhachev
 */
public class VisRoundCactus extends VisHomeplants {

    public VisRoundCactus() {
        super("VisRoundCactus");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
