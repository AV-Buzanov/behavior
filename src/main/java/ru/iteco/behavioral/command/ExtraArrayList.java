package ru.iteco.behavioral.command;

import java.util.ArrayList;

/**
 * ExtraArrayList.
 *
 * @author Ilya_Sukhachev
 */
public class ExtraArrayList extends ArrayList {

    @Override
    public void removeRange(int fromIndex, int toIndex) {
        super.removeRange(fromIndex, toIndex);
    }
}
