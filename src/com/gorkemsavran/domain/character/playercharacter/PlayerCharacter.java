package com.gorkemsavran.domain.character.playercharacter;

import com.gorkemsavran.domain.character.Character;
import com.gorkemsavran.domain.character.IBuyer;
import com.gorkemsavran.domain.item.Item;

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
            return false;
        }
        setMoney(getMoney() - item.getPrice());
        items.add(item);
        return true;
    }
}
