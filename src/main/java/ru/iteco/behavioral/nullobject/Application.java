package ru.iteco.behavioral.nullobject;

import java.io.PrintStream;

/**
 * Application.
 *
 * @author Ilya_Sukhachev
 */
public class Application {

    private PrintStream printStream;

    public Application(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void doSomething() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            printStream.println("i = " + i);
        }
        System.out.println("sum = " + sum);
    }
}
