package com.gorkemsavran.domain.place.option;

public class Option extends AbstractOption {

    private final Runnable action;

    public Option(final Integer id, final String message, final Runnable action) {
        super(id, message);
        this.action = action;
    }

    @Override
    public void doAction() {
        action.run();
    }
}
