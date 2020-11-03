package ru.iteco.behavioral.strategy.traveler;

/**
 * TrainStrategy.
 *
 * @author Ilya_Sukhachev
 */
public class TrainStrategy implements MovingStrategy {

    @Override
    public void move() {
        System.out.println("I to to");
    }

}
