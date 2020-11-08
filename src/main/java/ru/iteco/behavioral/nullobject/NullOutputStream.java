package ru.iteco.behavioral.nullobject;

import java.io.OutputStream;

/**
 * NullOutputStream.
 *
 * @author Ilya_Sukhachev
 */
public class NullOutputStream extends OutputStream {

    @Override
    public void write(int b) {
        // Do nothing
    }
}
