package ru.iteco.behavioral.visitor.after;

/**
 * CareVisitor.
 *
 * @author Ilya_Sukhachev
 */
public class CareVisitor extends Visitor {

    public CareVisitor() {
        super("Caring");
    }

    @Override
    public void visit(VisLongCactus cactus) {
        System.out.println("Add nutrients for cacti");
    }

    @Override
    public void visit(VisRoundCactus cactus) {
        System.out.println("Add nutrients for cacti");
    }

    @Override
    public void visit(VisAloe cactus) {
        System.out.println("SomeCare");
    }
}
