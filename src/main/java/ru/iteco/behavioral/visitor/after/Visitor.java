package ru.iteco.behavioral.visitor.after;

/**
 * Visitor.
 *
 * @author Ilya_Sukhachev
 */
public abstract class Visitor {

    private String operationName;

    protected Visitor(String operationName) {
        this.operationName = operationName;
    }

    public abstract void visit(VisLongCactus cactus);

    public abstract void visit(VisRoundCactus cactus);

    public abstract void visit(VisAloe cactus);

    public String getOperationName() {
        return operationName;
    }
}
