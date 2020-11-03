package ru.iteco.behavioral.command;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        var invoker = new CalculatorInvoker();

        invoker.calculate(OperationType.ADD, 100);
        invoker.calculate(OperationType.SUB, 50);
        invoker.calculate(OperationType.ADD, 75);

        invoker.undo(1);
        invoker.redo(1);

        invoker.undo(3);
        invoker.calculate(OperationType.SUB, 100);
        invoker.redo(1);
        invoker.redo(1);
    }
}
