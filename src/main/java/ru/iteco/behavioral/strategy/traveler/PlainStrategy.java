package ru.iteco.behavioral.strategy.traveler;

/**
 * PlainStrategy.
 *
 * @author Ilya_Sukhachev
 */
public class PlainStrategy implements MovingStrategy {

    @Override
    public void move() {
        System.out.println("I fly");
    }

}
