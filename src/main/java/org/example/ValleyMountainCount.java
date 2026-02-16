package org.example;

public class ValleyMountainCount {
    public static void main(String[] args) {
        String input = "UDDDUDUU";
        System.out.println("Mountain: " + countMountain(input));
        System.out.println("Valley: " + countValley(input));
        countMountainAndValley(input);
    }

    private static int countValley(String input) {
        int level = 0;
        int valley = 0;
        for (char c : input.toCharArray()) {
            if (c == 'U') {
                level++;
            } else {
                level--;
            }

            if (level == 0 && c == 'U') {
                valley++;
            }
        }

        return valley;
    }

    private static int countMountain(String input) {
        int level = 0;
        int mountain = 0;
        for (char c : input.toCharArray()) {
            if (c == 'U') {
                level++;
            } else {
                level--;
            }

            if (level == 0 && c == 'D') {
                mountain++;
            }
        }

        return mountain;
    }

    private static void countMountainAndValley(String input) {
        int level = 0;
        int mountain = 0;
        int valley = 0;

        for (char step : input.toCharArray()) {
            if (step == 'U') {
                level++;
            } else {
                level--;
            }

            if (level == 0 && step == 'U') {
                valley++;
            }

            if (level == 0 && step == 'D') {
                mountain++;
            }
        }

        System.out.println("Mountain: " + mountain + "\nValley: " + valley);
    }
}
