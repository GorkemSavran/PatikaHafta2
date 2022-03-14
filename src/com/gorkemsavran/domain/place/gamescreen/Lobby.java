package com.gorkemsavran.domain.place.gamescreen;

import com.gorkemsavran.domain.place.IPlace;

public class Lobby implements IPlace {

    @Override
    public void onPlace() {
        System.out.println("1-Güvenli yere git");
        System.out.println("2-Mağazaya git");
        System.out.println("3-Savaşa git");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                placeFactory.createSafePlace().onPlace();
                break;
            case 2:
                placeFactory.createStore().onPlace();
                break;
            case 3:
                placeFactory.createBattleChoose().onPlace();
                break;
            default:
                System.out.println("Lütfen geçerli bir seçim yapın!");
                break;
        }
    }
}
