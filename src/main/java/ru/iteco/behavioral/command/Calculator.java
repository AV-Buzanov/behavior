package ru.iteco.behavioral.command;

/**
 * Calculator.
 *
 * @author Ilya_Sukhachev
 */
public class Calculator {

    private int result = 0;

    public void operation(OperationType operation, int operand) {
        switch (operation) {
            case ADD:
                result += operand;
                break;
            case SUB:
                result -= operand;
                break;
            default:
                throw new RuntimeException(operation.name());
        }

        System.out.printf("Current value: %d, after %s:%d", result, operation, operand);
        System.out.println();
    }
}
