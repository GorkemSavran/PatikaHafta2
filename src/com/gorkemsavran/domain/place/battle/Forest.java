package com.gorkemsavran.domain.place.battle;

import com.gorkemsavran.domain.character.enemycharacter.characters.Vampire;
import com.gorkemsavran.domain.item.general.Firewood;

public class Forest extends BattlePlace {

    public Forest() {
        super(new Firewood());
        addEnemy(new Vampire());
        addEnemy(new Vampire());
        addEnemy(new Vampire());
    }
}
