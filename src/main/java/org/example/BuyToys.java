package main.java.org.example;

import java.util.Arrays;

public class BuyToys {
    public static void main(String[] args) {
        int currentMoney = 50000;
        int[] prices = {20000, 3000, 10000, 40000, 5000, 50000};
        System.out.println("Able to buy : " + totalToys(currentMoney, prices));
    }

    private static int totalToys (int currentMoney, int[] prices) {
        Arrays.sort(prices);
        int total = 0;
        for (int price : prices) {
            if (currentMoney >= price) {
                total++;
                currentMoney = currentMoney - price;
            }
        }

        return total;
    }
}
