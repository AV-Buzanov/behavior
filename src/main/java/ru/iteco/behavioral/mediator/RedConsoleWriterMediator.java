package ru.iteco.behavioral.mediator;

/**
 * RedConsoleWriterMediator.
 *
 * @author Ilya_Sukhachev
 */
public class RedConsoleWriterMediator implements IWriterMediator {

    private RedConsoleWriter consoleWriter;

    public RedConsoleWriterMediator(GoodDataGenerator dataGenerator, RedConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
        dataGenerator.setWriterMediator(this);
    }

    @Override
    public void updateData(String data) {
        consoleWriter.write(data);
    }
}
