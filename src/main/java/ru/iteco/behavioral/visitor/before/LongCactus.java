package ru.iteco.behavioral.visitor.before;

/**
 * LongCactus.
 *
 * @author Ilya_Sukhachev
 */
public class LongCactus extends Cactus {

    public LongCactus() {
        super("LongCactus");
    }

    @Override
    public void watering() {
        System.out.println("Watering with special salts");
    }
}
