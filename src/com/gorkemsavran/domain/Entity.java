package com.gorkemsavran.domain;

public abstract class Entity {

    private final int id;

    protected Entity(final int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
