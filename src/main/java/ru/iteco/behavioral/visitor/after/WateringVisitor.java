package ru.iteco.behavioral.visitor.after;

/**
 * WateringVisitor.
 *
 * @author Ilya_Sukhachev
 */
public class WateringVisitor extends Visitor {

    public WateringVisitor() {
        super("Watering");
    }

    @Override
    public void visit(VisLongCactus cactus) {
        System.out.println("Watering with special salts");
    }

    @Override
    public void visit(VisRoundCactus cactus) {
        System.out.println("Watering one time on month");
    }

    @Override
    public void visit(VisAloe cactus) {
        System.out.println("SomeWatering");
    }
}
