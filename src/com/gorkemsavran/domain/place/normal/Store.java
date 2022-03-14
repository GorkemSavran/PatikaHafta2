package com.gorkemsavran.domain.place.normal;

import com.gorkemsavran.domain.Game;
import com.gorkemsavran.domain.Player;
import com.gorkemsavran.domain.character.playercharacter.PlayerCharacter;
import com.gorkemsavran.domain.item.Item;
import com.gorkemsavran.domain.item.armor.HeavyArmor;
import com.gorkemsavran.domain.item.armor.LightArmor;
import com.gorkemsavran.domain.item.armor.MediumArmor;
import com.gorkemsavran.domain.item.general.Firewood;
import com.gorkemsavran.domain.item.general.Food;
import com.gorkemsavran.domain.item.general.Water;
import com.gorkemsavran.domain.item.gun.Pistol;
import com.gorkemsavran.domain.item.gun.Rifle;
import com.gorkemsavran.domain.item.gun.Sword;
import com.gorkemsavran.domain.place.AbstractPlace;
import com.gorkemsavran.domain.place.option.OnlyMessageOption;
import com.gorkemsavran.domain.place.option.Option;

public class Store extends AbstractPlace {

    @Override
    protected void prepareOptions() {
        addOption(new OnlyMessageOption("Şu an Mağazadasın"));
        addOption(new Option(0, "Geri git", () -> {
        }));
        addOption(new Option(1, "Yemek al " + new Food().getPrice(), playerBuys(new Food())));
        addOption(new Option(2, "Odun al " + new Firewood().getPrice(), playerBuys(new Firewood())));
        addOption(new Option(3, "Su al " + new Water().getPrice(), playerBuys(new Water())));
        addOption(new Option(4, "Tabanca al " + new Pistol().getPrice(), playerBuys(new Pistol())));
        addOption(new Option(5, "Kılıç al " + new Sword().getPrice(), playerBuys(new Sword())));
        addOption(new Option(6, "Tüfek al " + new Rifle().getPrice(), playerBuys(new Rifle())));
        addOption(new Option(7, "Hafif Zırh al " + new LightArmor().getPrice(), playerBuys(new LightArmor())));
        addOption(new Option(8, "Orta Zırh al " + new MediumArmor().getPrice(), playerBuys(new MediumArmor())));
        addOption(new Option(9, "Ağır Zırh al " + new HeavyArmor().getPrice(), playerBuys(new HeavyArmor())));
    }

    private Runnable playerBuys(final Item item) {
        Player player = Game.getPlayer();
        PlayerCharacter playerCharacter = player.getPlayerCharacter();
        return () -> playerCharacter.buy(item);
    }
}
