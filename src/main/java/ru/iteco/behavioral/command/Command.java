package ru.iteco.behavioral.command;

/**
 * Command.
 *
 * @author Ilya_Sukhachev
 */
public abstract class Command {

    protected Calculator calculator;
    protected int operand;
    protected OperationType operation;
    protected OperationType rollbackOperation;

    protected Command(Calculator calculator, int operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    public void execute() {
        calculator.operation(operation, operand);
    }

    public void rollback() {
        calculator.operation(rollbackOperation, operand);
    }

    public OperationType getOperation() {
        return operation;
    }

    public OperationType getRollbackOperation() {
        return rollbackOperation;
    }
}
