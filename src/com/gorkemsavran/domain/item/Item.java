package com.gorkemsavran.domain.item;

import com.gorkemsavran.domain.Entity;

public abstract class Item extends Entity {

    private final int price;

    protected Item(final int id, final int price) {
        super(id);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
