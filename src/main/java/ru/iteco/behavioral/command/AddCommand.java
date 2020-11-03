package ru.iteco.behavioral.command;

/**
 * AddCommand.
 *
 * @author Ilya_Sukhachev
 */
public class AddCommand extends Command {
    protected AddCommand(Calculator calculator, int operand) {
        super(calculator, operand);
        this.operation = OperationType.ADD;
        this.rollbackOperation = OperationType.SUB;
    }


}
