package com.gorkemsavran.domain.character.enemycharacter;

import com.gorkemsavran.domain.character.Character;

public abstract class EnemyCharacter extends Character {

    protected EnemyCharacter(final int id, final int damage, final int health, final int money) {
        super(id, damage, health, money);
    }
}
