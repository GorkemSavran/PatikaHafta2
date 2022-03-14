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

public interface IPlaceFactory {
    Lobby createLobby();

    BattleChoose createBattleChoose();

    SelectCharacter createSelectCharacter();

    SafePlace createSafePlace();

    Store createStore();

    Cave createCave();

    Forest createForest();

    River createRiver();
}
