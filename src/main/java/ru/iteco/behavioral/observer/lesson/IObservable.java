package ru.iteco.behavioral.observer.lesson;

/**
 * IObservable.
 *
 * @author Ilya_Sukhachev
 */
public abstract class IObservable {

    protected IObserver observer;

    public abstract void hear(String message);

    public abstract void say(String message);


    public IObserver getObserver() {
        return observer;
    }

    public void setObserver(IObserver observer) {
        this.observer = observer;
    }
}
