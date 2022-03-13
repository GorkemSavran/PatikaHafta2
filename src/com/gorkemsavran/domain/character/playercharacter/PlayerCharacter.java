package com.gorkemsavran.domain.character.playercharacter;

import com.gorkemsavran.domain.character.Character;

public abstract class PlayerCharacter extends Character {

    protected PlayerCharacter(final int id, final int damage, final int health, final int money) {
        super(id, damage, health, money);
    }
}
