package ru.iteco.behavioral.visitor.before;

/**
 * LongCactus.
 *
 * @author Ilya_Sukhachev
 */
public class RoundCactus extends Cactus {

    public RoundCactus() {
        super("RoundCactus");
    }

    @Override
    public void watering() {
        System.out.println("Watering one time on month");
    }
}
