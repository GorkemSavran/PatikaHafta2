package com.gorkemsavran.domain.place.battle;

import com.gorkemsavran.domain.character.enemycharacter.characters.Bear;
import com.gorkemsavran.domain.item.general.Water;

public class River extends BattlePlace {

    public River() {
        super(new Water());
        addEnemy(new Bear());
        addEnemy(new Bear());
        addEnemy(new Bear());
    }
}
