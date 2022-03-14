package com.gorkemsavran.domain.place.battle;

import com.gorkemsavran.domain.character.enemycharacter.EnemyCharacter;
import com.gorkemsavran.domain.exception.GameException;
import com.gorkemsavran.domain.item.Item;
import com.gorkemsavran.domain.place.IPlace;

import java.util.ArrayList;
import java.util.List;

public abstract class BattlePlace implements IPlace {

    private List<EnemyCharacter> enemies;

    private Item reward;

    protected BattlePlace(final Item reward) {
        this.enemies = new ArrayList<>();
        this.reward = reward;
    }

    protected void addEnemy(final EnemyCharacter enemyCharacter) {
        enemies.add(enemyCharacter);
    }

    public Item collectReward() {
        if (!enemies.isEmpty()) throw new GameException("Bütün düşmanlar öldürülmeden ödül toplanamaz!");
        return reward;
    }

    @Override
    public void onPlace() {
        System.out.println("Sıradaki düşmanlar: " + enemies.toString());
        System.out.println("0-Kaç");
        System.out.println("1-Savaş");
        System.out.println("2-Ödülü topla");

    }
}
