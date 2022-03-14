package com.gorkemsavran.domain.place.option;

import com.gorkemsavran.domain.Player;

import java.util.function.Consumer;

public class OptionWithPlayer extends AbstractOption {

    private final Player player;
    private final Consumer<Player> action;

    public OptionWithPlayer(final Integer id, final String message, final Player player, final Consumer<Player> action) {
        super(id, message);
        this.player = player;
        this.action = action;
    }

    @Override
    public void doAction() {
        action.accept(player);
    }
}
