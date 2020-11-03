package ru.iteco.behavioral.strategy.after;

/**
 * GameStrategy.
 *
 * @author Ilya_Sukhachev
 */
public interface GameStrategy {

    void initGame();

    boolean isGameOver();

    void nextTurn();

    int getTotalResult();
}
