package com.gorkemsavran.domain.place.battle;

import com.gorkemsavran.domain.Game;
import com.gorkemsavran.domain.Player;
import com.gorkemsavran.domain.character.enemycharacter.EnemyCharacter;
import com.gorkemsavran.domain.character.playercharacter.PlayerCharacter;
import com.gorkemsavran.domain.exception.GameException;
import com.gorkemsavran.domain.item.Item;
import com.gorkemsavran.domain.place.AbstractPlace;
import com.gorkemsavran.domain.place.option.OnlyMessageOption;
import com.gorkemsavran.domain.place.option.Option;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class BattlePlace extends AbstractPlace {

    private List<EnemyCharacter> enemies;

    private final Item reward;

    protected BattlePlace(final Item reward) {
        this.enemies = new ArrayList<>();
        this.reward = reward;
    }

    protected void addEnemy(final EnemyCharacter enemyCharacter) {
        enemies.add(enemyCharacter);
    }

    public void collectReward() {
        if (!enemies.isEmpty()) {
            System.out.println("Bütün düşmanlar öldürülmeden ödül toplanamaz!");
            return;
        } else {
            Player player = Game.getPlayer();
            PlayerCharacter playerCharacter = player.getPlayerCharacter();
            playerCharacter.addItem(reward);
        }
    }

    @Override
    protected void prepareOptions() {
        addOption(new OnlyMessageOption("Düşmanlar: " + Arrays.toString(enemies.stream().map((enemyCharacter -> enemyCharacter.getClass().getSimpleName())).toArray())));
        addOption(new Option(0, "Geri git", () -> {
        }));
        addOption(new Option(1, "Savaş", this::fight));
        addOption(new Option(2, "Ödülü topla", this::collectReward));
    }

    private void fight() {
        if (enemies.isEmpty()) {
            System.out.println("Düşman kalmamış. Ödülleri toplayabilirsin!");
            return;
        }
        final Player player = Game.getPlayer();
        PlayerCharacter playerCharacter = player.getPlayerCharacter();
        if (!playerCharacter.isAlive()) {
            System.out.println("Ölüsün! Güvenli odaya git ve canını yenile!");
            return;
        }
        System.out.println("Savaştasın");
        EnemyCharacter enemyCharacter = enemies.get(0);
        while (!isFightOver(playerCharacter, enemyCharacter)) {
            playerCharacter.attack(enemyCharacter);
            System.out.println("Biz vurduk");
            System.out.println("Karakterimiz: " + playerCharacter);
            System.out.println("Düşmanımız: " + enemyCharacter);
            if (isFightOver(playerCharacter, enemyCharacter)) {
                System.out.println("Yendik!!!");
                System.out.println(enemyCharacter.getMoney() + " para kazandın!");
                playerCharacter.setMoney(playerCharacter.getMoney() + enemyCharacter.getMoney());
                enemies.remove(0);
                break;
            }
            enemyCharacter.attack(playerCharacter);
            System.out.println("Düşman vurdu");
            System.out.println("Karakterimiz: " + playerCharacter);
            System.out.println("Düşmanımız: " + enemyCharacter);
            if (isFightOver(playerCharacter, enemyCharacter)) {
                System.out.println("Yenildik :(");
                break;
            }
        }
    }

    private boolean isFightOver(final PlayerCharacter playerCharacter, final EnemyCharacter enemyCharacter) {
        return !playerCharacter.isAlive() || !enemyCharacter.isAlive();
    }
}
