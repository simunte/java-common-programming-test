package main.java.org.example;

public class BirthdayCake {
    public static void main(String[] args) {
        int[] input = {3, 2, 5, 1, 7, 3, 4, 5, 7, 7, 8};
        System.out.println("Total Candle : "+ totalCandle(input));
    }

    private static int totalCandle (int[] candles) {
        int highest = 0;
        int total = 0;

        for (int candle : candles) {
            if (candle > highest) {
                highest = candle;
                total = 1;
            } else if (candle == highest) {
                total++;
            }
        }

        System.out.println("Highest : " + highest);
        return total;
    }
}
