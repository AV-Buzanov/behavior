package ru.iteco.behavioral.visitor.before;

/**
 * Homeplants.
 *
 * @author Ilya_Sukhachev
 */
public abstract class HomePlants {

    public HomePlants(String name) {
        this.name = name;
    }

    private String name;

    public abstract void watering();

    public abstract void care();

    public String getName() {
        return name;
    }
}
