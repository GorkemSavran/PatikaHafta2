package com.gorkemsavran.domain.place.gamescreen;

import com.gorkemsavran.domain.place.IPlace;

public class BattleChoose implements IPlace {

    @Override
    public void onPlace() {
        System.out.println("0-Geri git");
        System.out.println("1-Mağaraya git");
        System.out.println("2-Ormana git");
        System.out.println("3-Nehire git");
        int choice = scanner.nextInt();
        switch (choice) {
            case 0:
                break;
            case 1:
                placeFactory.createCave().onPlace();
                break;
            case 2:
                placeFactory.createForest().onPlace();
                break;
            case 3:
                placeFactory.createRiver().onPlace();
                break;
            default:
                System.out.println("Lütfen geçerli bir seçim yapın!");
                break;
        }
    }
}
