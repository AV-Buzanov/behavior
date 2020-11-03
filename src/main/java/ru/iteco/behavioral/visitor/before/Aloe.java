package ru.iteco.behavioral.visitor.before;

/**
 * Aloe.
 *
 * @author Ilya_Sukhachev
 */
public class Aloe extends HomePlants {
    public Aloe() {
        super("Aloe");
    }

    @Override
    public void watering() {
        System.out.println("SomeWatering");
    }

    @Override
    public void care() {
        System.out.println("SomeCare");
    }
}
