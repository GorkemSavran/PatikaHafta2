package com.gorkemsavran.domain.place.factory;

import com.gorkemsavran.domain.Player;
import com.gorkemsavran.domain.place.battle.BattlePlace;
import com.gorkemsavran.domain.place.battle.Cave;
import com.gorkemsavran.domain.place.battle.Forest;
import com.gorkemsavran.domain.place.battle.River;
import com.gorkemsavran.domain.place.gamescreen.BattleChoose;
import com.gorkemsavran.domain.place.gamescreen.Lobby;
import com.gorkemsavran.domain.place.gamescreen.SelectCharacter;
import com.gorkemsavran.domain.place.normal.SafePlace;
import com.gorkemsavran.domain.place.normal.Store;

public class PlaceFactory implements IPlaceFactory {

    @Override
    public Lobby createLobby() {
        return new Lobby();
    }

    @Override
    public BattleChoose createBattleChoose() {
        return new BattleChoose();
    }

    @Override
    public SelectCharacter createSelectCharacter() {
        return new SelectCharacter();
    }

    @Override
    public SafePlace createSafePlace() {
        return new SafePlace();
    }

    @Override
    public Store createStore() {
        return new Store();
    }

    @Override
    public BattlePlace createCave() {
        return new Cave();
    }

    @Override
    public BattlePlace createForest() {
        return new Forest();
    }

    @Override
    public BattlePlace createRiver() {
        return new River();
    }
}
