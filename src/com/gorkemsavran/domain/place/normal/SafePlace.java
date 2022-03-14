package com.gorkemsavran.domain.place.normal;

import com.gorkemsavran.domain.Game;
import com.gorkemsavran.domain.Player;
import com.gorkemsavran.domain.character.playercharacter.PlayerCharacter;
import com.gorkemsavran.domain.exception.GameException;
import com.gorkemsavran.domain.place.AbstractPlace;
import com.gorkemsavran.domain.place.option.OnlyMessageOption;
import com.gorkemsavran.domain.place.option.Option;

public class SafePlace extends AbstractPlace {

    @Override
    protected void prepareOptions() {
        try {
            refillHealth();
        } catch (InstantiationException | IllegalAccessException ignored) {
        }
        addOption(new OnlyMessageOption("Şu an Güvenli evdesin"));
        addOption(new OnlyMessageOption("Canın yenilendi"));
        addOption(new Option(0, "Geri git", () -> {
        }));
    }

    private void refillHealth() throws InstantiationException, IllegalAccessException {
        Player player = Game.getPlayer();
        PlayerCharacter playerCharacter = player.getPlayerCharacter();
        Class<? extends PlayerCharacter> playerCharacterClass = playerCharacter.getClass();
        playerCharacter.setHealth(playerCharacterClass.newInstance().getHealth());
        System.out.println(playerCharacter);
    }
}
