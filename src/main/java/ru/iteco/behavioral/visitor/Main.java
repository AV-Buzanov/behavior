package ru.iteco.behavioral.visitor;

import ru.iteco.behavioral.visitor.after.CareVisitor;
import ru.iteco.behavioral.visitor.after.VisAloe;
import ru.iteco.behavioral.visitor.after.VisHomeplants;
import ru.iteco.behavioral.visitor.after.VisLongCactus;
import ru.iteco.behavioral.visitor.after.VisRoundCactus;
import ru.iteco.behavioral.visitor.after.WateringVisitor;
import ru.iteco.behavioral.visitor.before.Aloe;
import ru.iteco.behavioral.visitor.before.HomePlants;
import ru.iteco.behavioral.visitor.before.LongCactus;
import ru.iteco.behavioral.visitor.before.RoundCactus;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {
    public static void main(String[] args) {
        //Before
        HomePlants[] homePlants = {new LongCactus(), new RoundCactus(), new Aloe()};
        for (HomePlants homeplant : homePlants) {
            homeplant.care();
            homeplant.watering();
        }

        System.out.println("**********************");
        //after
        VisHomeplants[] homeplants2 = {
                new VisLongCactus(),
                new VisRoundCactus(),
                new VisAloe()};

        var careVisitor = new CareVisitor();
        var waterVisitor = new WateringVisitor();
        for (VisHomeplants plant : homeplants2) {
            plant.accept(careVisitor);
            plant.accept(waterVisitor);
        }

    }
}
