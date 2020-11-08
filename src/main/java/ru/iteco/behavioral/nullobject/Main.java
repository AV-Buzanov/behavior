package ru.iteco.behavioral.nullobject;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        Application nullPrintStream = new Application(new NullPrintStream());
        nullPrintStream.doSomething();
    }
}
