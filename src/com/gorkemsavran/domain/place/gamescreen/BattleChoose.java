package com.gorkemsavran.domain.place.gamescreen;

import com.gorkemsavran.domain.Player;
import com.gorkemsavran.domain.place.AbstractPlace;
import com.gorkemsavran.domain.place.option.Option;

public class BattleChoose extends AbstractPlace {

    @Override
    protected void prepareOptions() {
        addOption(new Option(0, "Geri git", () -> {
        }));
        addOption(new Option(1, "Mağaraya git", () -> placeFactory.createCave().onPlace()));
        addOption(new Option(2, "Ormana git", () -> placeFactory.createForest().onPlace()));
        addOption(new Option(3, "Nehire git", () -> placeFactory.createRiver().onPlace()));
    }
}
