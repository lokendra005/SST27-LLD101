package com.example.notifications;

/**
 * Base decorator that delegates to the wrapped Notifier.
 */
public abstract class NotifierDecorator implements Notifier {
    protected final Notifier wrappee;

    protected NotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void notify(String text) {
        if (wrappee != null) {
            wrappee.notify(text);
        }
    }
}


