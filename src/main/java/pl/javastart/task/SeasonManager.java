package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        printOptions();
        Season seasonFromUser = takeSeasonFromUser(scanner);
        printMonths(seasonFromUser);
    }

    private void printMonths(Season seasonFromUser) {
        System.out.println("W tej porze roku są następujące miesiące:");
        System.out.println(Arrays.toString(seasonFromUser.getMonths()));
    }

    private Season takeSeasonFromUser(Scanner scanner) {
        String seasonStringFromUser = scanner.nextLine();
        scanner.close();
        return Season.changeStringToSeason(seasonStringFromUser);
    }

    private void printOptions() {
        System.out.println("Podaj porę roku:");
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
    }

}
