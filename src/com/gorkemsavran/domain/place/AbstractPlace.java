package com.gorkemsavran.domain.place;

import com.gorkemsavran.domain.Player;
import com.gorkemsavran.domain.exception.GameException;
import com.gorkemsavran.domain.place.factory.IPlaceFactory;
import com.gorkemsavran.domain.place.factory.PlaceFactory;
import com.gorkemsavran.domain.place.gamescreen.SelectCharacter;
import com.gorkemsavran.domain.place.option.IOption;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public abstract class AbstractPlace {

    protected final static IPlaceFactory placeFactory = new PlaceFactory();
    protected final static Scanner scanner = new Scanner(System.in);

    private final List<IOption> options = new ArrayList<>();

    public final void onPlace() {
        prepareOptions();
        for (IOption option : options) {
            System.out.println(option.getMessage());
        }
        int choice = scanner.nextInt();
        Optional<IOption> option = findById(choice);
        option.ifPresent(IOption::doAction);
        clearOptions();
        if (!(this instanceof SelectCharacter) && !option.get().getId().equals(0)) {
            onPlace();
        }
    }

    private void clearOptions() {
        options.clear();
    }

    private Optional<IOption> findById(final int id) {
        for (IOption option : options) {
            if (option.getId() != null && option.getId().equals(id)) {
                return Optional.of(option);
            }
        }
        return Optional.empty();
    }

    protected void addOption(IOption option) {
        options.add(option);
    }

    protected abstract void prepareOptions();
}
