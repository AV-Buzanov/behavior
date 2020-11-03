package ru.iteco.behavioral.command;

/**
 * SubCommand.
 *
 * @author Ilya_Sukhachev
 */
public class SubCommand extends Command {
    protected SubCommand(Calculator calculator, int operand) {
        super(calculator, operand);
        this.operation = OperationType.SUB;
        this.rollbackOperation = OperationType.ADD;
    }

}
