package com.gorkemsavran.domain.character;

import com.gorkemsavran.domain.Entity;
import com.gorkemsavran.domain.item.armor.Armor;
import com.gorkemsavran.domain.item.gun.Gun;

public abstract class Character extends Entity {

    private int damage;
    private int health;
    private int money;
    private int defence;

    private Gun gun;
    private Armor armor;

    protected Character(final int id, final int damage, final int health, final int money) {
        super(id);
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.defence = 0;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void attack(final Character character) {
        character.health -= getDamage();
    }

    @Override
    public String toString() {
        return "Character{" +
                "damage=" + damage +
                ", health=" + health +
                ", money=" + money +
                ", defence=" + defence +
                ", gun=" + gun +
                ", armor=" + armor +
                '}';
    }

    public int getDamage() {
        if (gun != null) {
            return damage + gun.getDamage();
        }
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

    public int getDefence() {
        if (armor != null) {
            return defence + armor.getDefence();
        }
        return defence;
    }

    public void setDefence(final int defence) {
        this.defence = defence;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(final Gun gun) {
        this.gun = gun;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(final Armor armor) {
        this.armor = armor;
    }
}
