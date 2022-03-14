package com.gorkemsavran.domain.place;

import com.gorkemsavran.domain.place.factory.IPlaceFactory;
import com.gorkemsavran.domain.place.factory.PlaceFactory;

import java.util.Scanner;

public interface IPlace {
    IPlaceFactory placeFactory = new PlaceFactory();
    Scanner scanner = new Scanner(System.in);

    void onPlace();
}
