package com.gorkemsavran.domain.place.gamescreen;

import com.gorkemsavran.domain.Player;
import com.gorkemsavran.domain.character.playercharacter.characters.Archer;
import com.gorkemsavran.domain.character.playercharacter.characters.Knight;
import com.gorkemsavran.domain.character.playercharacter.characters.Samurai;
import com.gorkemsavran.domain.place.AbstractPlace;
import com.gorkemsavran.domain.place.option.OnlyMessageOption;
import com.gorkemsavran.domain.place.option.Option;

public class SelectCharacter extends AbstractPlace {

    private Player selectedPlayer;
    private String characterName;

    public Player getPlayer() {
        return selectedPlayer;
    }

    @Override
    protected void prepareOptions() {
        System.out.println("Karakterine bir isim ver: ");
        characterName = scanner.next();
        addOption(new OnlyMessageOption("Bir karakter seç"));
        addOption(new Option(0, "Oyundan çık", () -> System.exit(0)));
        addOption(new Option(1, "Samuray", () -> selectedPlayer = new Player(characterName, new Samurai())));
        addOption(new Option(2, "Archer", () -> selectedPlayer = new Player(characterName, new Archer())));
        addOption(new Option(3, "Knight", () -> selectedPlayer = new Player(characterName, new Knight())));
    }
}
