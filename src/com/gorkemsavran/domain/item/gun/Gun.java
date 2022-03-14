package com.gorkemsavran.domain.item.gun;

import com.gorkemsavran.domain.item.Item;

public abstract class Gun extends Item {

    private int damage;

    protected Gun(final int id, final int price, final int damage) {
        super(id, price);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "damage=" + damage +
                '}';
    }
}
