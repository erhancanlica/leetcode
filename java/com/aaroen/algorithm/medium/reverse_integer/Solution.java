package com.aaroen.algorithm.medium.reverse_integer;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
        System.out.println(reverse(-214));

    }

    public static int reverse(int x) {
        int reverseNumber = 0;

        while (x != 0) {
            int modeNumber = x % 10;
            x = x / 10;

            if (reverseNumber > Integer.MAX_VALUE/10 || (reverseNumber == Integer.MAX_VALUE / 10 && modeNumber > 7)) return 0;
            if (reverseNumber < Integer.MIN_VALUE/10 || (reverseNumber == Integer.MIN_VALUE / 10 && modeNumber < -8)) return 0;

            reverseNumber = reverseNumber * 10 +  modeNumber;
        }

        return reverseNumber;
    }
}