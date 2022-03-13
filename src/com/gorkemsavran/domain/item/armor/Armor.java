package com.gorkemsavran.domain.item.armor;

import com.gorkemsavran.domain.item.Item;

public abstract class Armor extends Item {

    private int defence;

    protected Armor(final int id, final int price, final int defence) {
        super(id, price);
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }
}
