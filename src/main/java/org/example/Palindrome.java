package main.java.org.example;

public class Palindrome {
    /*
        A palindrome is a word, number, phrase, or sequence that reads the same forward and backward.
     */
    public static void main(String[] args) {
        String palindrome = "Madam";
        System.out.println(palindrome + " : " + isPalindrome(palindrome));
    }

    private static boolean isPalindrome(String s) {
        String stringToCheck = s.toLowerCase()
                .replaceAll(" ", "");

        int sIdx = stringToCheck.length() - 1;
        int halfLength = stringToCheck.length() / 2;

        for (int idx = 0; idx < halfLength; idx++) {
            if (stringToCheck.charAt(sIdx - idx) != stringToCheck.charAt(idx)) {
                return false;
            }
        }

        return true;
    }
}
