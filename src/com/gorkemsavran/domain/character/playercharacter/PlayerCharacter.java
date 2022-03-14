package com.gorkemsavran.domain.character.playercharacter;

import com.gorkemsavran.domain.character.Character;
import com.gorkemsavran.domain.character.IBuyer;
import com.gorkemsavran.domain.item.Item;
import com.gorkemsavran.domain.item.armor.Armor;
import com.gorkemsavran.domain.item.gun.Gun;

import java.util.ArrayList;
import java.util.List;

public abstract class PlayerCharacter extends Character implements IBuyer {

    private List<Item> items;

    protected PlayerCharacter(final int id, final int damage, final int health, final int money) {
        super(id, damage, health, money);
        items = new ArrayList<>();
    }

    @Override
    public boolean buy(final Item item) {
        if (getMoney() < item.getPrice()) {
            System.out.println("Bu eşyayı almak için yeterli paran yok!");
            return false;
        }
        setMoney(getMoney() - item.getPrice());
        addItem(item);
        if (item instanceof Armor) {
            setArmor((Armor) item);
        } else if (item instanceof Gun) {
            setGun((Gun) item);
        }
        System.out.println(this);
        return true;
    }

    public void addItem(final Item item) {
        items.add(item);
    }
}
