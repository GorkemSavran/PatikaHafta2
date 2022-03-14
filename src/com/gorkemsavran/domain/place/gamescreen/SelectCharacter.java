package com.gorkemsavran.domain.place.gamescreen;

import com.gorkemsavran.domain.Player;
import com.gorkemsavran.domain.character.playercharacter.characters.Archer;
import com.gorkemsavran.domain.character.playercharacter.characters.Knight;
import com.gorkemsavran.domain.character.playercharacter.characters.Samurai;
import com.gorkemsavran.domain.place.IPlace;

public class SelectCharacter implements IPlace {

    private Player player;

    public Player getPlayer() {
        return player;
    }

    @Override
    public void onPlace() {
        System.out.print("Karakterine bir isim ver: ");
        String playerName = scanner.next();
        System.out.println("Bir karakter seç");
        System.out.println("1-Samuray");
        System.out.println("2-Okçu");
        System.out.println("3-Şovalye");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                player = new Player(playerName, new Samurai());
                break;
            case 2:
                player = new Player(playerName, new Archer());
                break;
            case 3:
                player = new Player(playerName, new Knight());
                break;
            default:
                System.out.println("Lütfen geçerli bir seçim yapın!");
                break;
        }
    }
}
