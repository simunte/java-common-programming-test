package main.java.org.example;

import java.util.HashMap;
import java.util.Map;

public class MatchingSocks {
    public static void main(String[] args) {
        int[] input = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5};
        System.out.println("Total : " + totalMatch1(input) + " Match");
        System.out.println("Total : " + totalMatch2(input) + " Match");
    }

    private static int totalMatch1 (int[] input) {
        Map<Integer, Integer> temp = new HashMap<>();
        int totalMatch = 0;

        for (Integer key : input) {
            if (temp.containsKey(key) && temp.get(key) < 2) {
                temp.put(key, temp.get(key) + 1);
                totalMatch++;
            } else {
                temp.put(key, 1);
            }
        }

        return totalMatch;
    }

    private static int totalMatch2(int[] input) {
        Map<Integer,Integer> temp = new HashMap<>();
        int totalMatch = 0;

        for (Integer key : input) {
            int counter = temp.getOrDefault(key, 0) + 1;
            temp.put(key, counter);

            if (counter % 2 == 0) {
                totalMatch++;
            }
        }

        return totalMatch;
    }
}
