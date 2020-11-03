package ru.iteco.behavioral.visitor.before;

/**
 * Cactus.
 *
 * @author Ilya_Sukhachev
 */
public abstract class Cactus extends HomePlants {

    public Cactus(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println("Add nutrients for cacti");
    }
}
