package com.gorkemsavran.domain.character;

import com.gorkemsavran.domain.Entity;

public abstract class Character extends Entity {

    private int damage;
    private int health;
    private int money;

    protected Character(final int id, final int damage, final int health, final int money) {
        super(id);
        this.damage = damage;
        this.health = health;
        this.money = money;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(final int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(final int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(final int money) {
        this.money = money;
    }
}
