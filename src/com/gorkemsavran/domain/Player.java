package com.gorkemsavran.domain;

import com.gorkemsavran.domain.character.playercharacter.PlayerCharacter;

public class Player {

    private final String name;
    private final PlayerCharacter playerCharacter;

    public Player(final String name, final PlayerCharacter playerCharacter) {
        this.name = name;
        this.playerCharacter = playerCharacter;
    }

    public String getName() {
        return name;
    }

    public PlayerCharacter getPlayerCharacter() {
        return playerCharacter;
    }
}
