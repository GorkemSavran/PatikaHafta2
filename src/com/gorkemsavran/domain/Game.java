package com.gorkemsavran.domain;

import com.gorkemsavran.domain.character.playercharacter.characters.Archer;
import com.gorkemsavran.domain.character.playercharacter.characters.Knight;
import com.gorkemsavran.domain.character.playercharacter.characters.Samurai;
import com.gorkemsavran.domain.exception.GameException;
import com.gorkemsavran.domain.place.factory.IPlaceFactory;
import com.gorkemsavran.domain.place.factory.PlaceFactory;
import com.gorkemsavran.domain.place.gamescreen.SelectCharacter;

import java.util.Scanner;

public class Game {

    private static Player player;
    private boolean isGameRunning;
    private IPlaceFactory placeFactory;

    private final Scanner scanner;

    public Game() {
        this.player = null;
        this.isGameRunning = false;
        scanner = new Scanner(System.in);
        placeFactory = new PlaceFactory();
    }

    public void startGame() {
        System.out.println("Hoşgeldin!!");
        System.out.println("Maceraya hazır ol!");
        selectCharacter();
        isGameRunning = true;
        gameLoop();
    }

    private void selectCharacter() {
        while (player == null) {
            SelectCharacter selectCharacterScreen = placeFactory.createSelectCharacter();
            selectCharacterScreen.onPlace();
            player = selectCharacterScreen.getPlayer();
        }
    }

    private void gameLoop() {
        while (isGameRunning) {
            try {
                placeFactory.createLobby().onPlace();
            } catch (final GameException gameException) {
                System.out.println(gameException.getMessage());
            }
        }
    }

    public static Player getPlayer() {
        return player;
    }
}
