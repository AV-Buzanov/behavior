package ru.iteco.behavioral.command;

import java.util.List;

/**
 * CalculatorInvoker.
 *
 * @author Ilya_Sukhachev
 */
public class CalculatorInvoker {

    protected Calculator calc = new Calculator();
    protected List<Command> commands = new ExtraArrayList();
    protected int current = 0;

    public void calculate(OperationType operation, int operand) {
        System.out.println("Calculate");
        var command = createCommand(operation, operand);
        command.execute();

        if (current < commands.size()) {
            ((ExtraArrayList) commands).removeRange(current, commands.size() - current);
        }

        commands.add(command);
        current++;
    }

    public void undo(int steps) {
        System.out.printf("Undo %d steps", steps);
        System.out.println();
        for (int i = 0; i < steps; i++) {
            if (current > 0) {
                commands.get(--current).rollback();
            }
        }
        System.out.println();
    }

    public void redo(int steps) {
        System.out.printf("Undo %d steps", steps);
        System.out.println();
        for (int i = 0; i < steps; i++) {
            if (current < commands.size()) {
                commands.get(current++).execute();
            }
        }
        System.out.println();
    }

    private Command createCommand(OperationType operation, int operand) {
        switch (operation) {
            case ADD:
                return new AddCommand(calc, operand);
            case SUB:
                return new SubCommand(calc, operand);
            default:
                throw new RuntimeException(operation.name());
        }
    }
}
