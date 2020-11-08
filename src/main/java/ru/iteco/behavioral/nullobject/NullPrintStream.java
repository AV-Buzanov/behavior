package ru.iteco.behavioral.nullobject;

import java.io.PrintStream;

/**
 * NullPrintStream.
 *
 * @author Ilya_Sukhachev
 */
public class NullPrintStream extends PrintStream {

    public NullPrintStream() {
        super(new NullOutputStream());
    }
}