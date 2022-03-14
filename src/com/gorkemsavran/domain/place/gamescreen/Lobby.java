package com.gorkemsavran.domain.place.gamescreen;

import com.gorkemsavran.domain.Player;
import com.gorkemsavran.domain.place.AbstractPlace;
import com.gorkemsavran.domain.place.option.OnlyMessageOption;
import com.gorkemsavran.domain.place.option.Option;

public class Lobby extends AbstractPlace {

    @Override
    protected void prepareOptions() {
        addOption(new OnlyMessageOption("Şu anda lobidesin"));
        addOption(new Option(0, "Oyundan çık", () -> System.exit(0)));
        addOption(new Option(1, "Güvenli yere git", () -> placeFactory.createSafePlace().onPlace()));
        addOption(new Option(2, "Mağazaya git", () -> placeFactory.createStore().onPlace()));
        addOption(new Option(3, "Savaşa git", () -> placeFactory.createBattleChoose().onPlace()));
    }

//    @Override
//    public void onPlace() {
//        System.out.println("1-Güvenli yere git");
//        System.out.println("2-Mağazaya git");
//        System.out.println("3-Savaşa git");
//        int choice = scanner.nextInt();
//        switch (choice) {
//            case 1:
//                placeFactory.createSafePlace().onPlace();
//                break;
//            case 2:
//                placeFactory.createStore().onPlace();
//                break;
//            case 3:
//                placeFactory.createBattleChoose().onPlace();
//                break;
//            default:
//                System.out.println("Lütfen geçerli bir seçim yapın!");
//                break;
//        }
//    }
}
