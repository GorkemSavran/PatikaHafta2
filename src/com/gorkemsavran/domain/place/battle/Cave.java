package com.gorkemsavran.domain.place.battle;

import com.gorkemsavran.domain.character.enemycharacter.characters.Zombie;
import com.gorkemsavran.domain.item.general.Food;

public class Cave extends BattlePlace {

    public Cave() {
        super(new Food());
        addEnemy(new Zombie());
        addEnemy(new Zombie());
        addEnemy(new Zombie());
    }
}
