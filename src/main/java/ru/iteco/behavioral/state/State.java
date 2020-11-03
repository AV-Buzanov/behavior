package ru.iteco.behavioral.state;

/**
 * State.
 *
 * @author Ilya_Sukhachev
 */
public interface State {

    void connect(ConnectionContext context);

    byte[] read(ConnectionContext context);

    void close(ConnectionContext context);
}
