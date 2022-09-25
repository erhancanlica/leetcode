package com.aaroen.algorithm.medium.longest_palindormed_substring;

public class Solution {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbb"));
    }

    public static String longestPalindrome(String s) {

        String longestPalindrome = "";

        for (int i = 0; i < s.length(); i++) {

            String first = findPalindrome(s, i, i);
            String second = findPalindrome(s, i, i + 1);

            longestPalindrome = first.length() > longestPalindrome.length() ? first : longestPalindrome;
            longestPalindrome = second.length() > longestPalindrome.length() ? second : longestPalindrome;
        }

        return longestPalindrome;
    }

    private static String findPalindrome(String s, int one, int oneMore) {
        String response = "";

        while (one >= 0 && oneMore < s.length() && s.charAt(one) == s.charAt(oneMore)) {
            response = s.substring(one, oneMore + 1);
            one--;
            oneMore++;
        }

        return response;
    }
}

