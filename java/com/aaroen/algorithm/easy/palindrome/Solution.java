package com.aaroen.algorithm.easy.palindrome;

public class Solution {
    public static void main(String[] args) {
        boolean isPal = isPalindrome(121);
        System.out.println(isPal);
    }

    public static boolean isPalindrome(int x) {
        String palindrome = String.valueOf(x);
        StringBuilder reverse = new StringBuilder();
        for (int i = palindrome.length() - 1; i >= 0; i--) {
            reverse.append(palindrome.charAt(i));
        }

        return palindrome.contentEquals(reverse);

    }
}

