package com.aaroen.algorithm.easy.plus_one;

public class Solution {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9, 9, 9};
        int[] result = plusOne(digits);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int res : result) {
            sb.append(res);
        }
        sb.append("]");
        System.out.println(sb);
    }

    public static int[] plusOne(int[] digits) {
        int carry = 0;

        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] += 1;
        } else {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (i == (digits.length - 1)) {
                    int nums = digits[digits.length - 1] + 1;
                    carry = nums / 10;
                    digits[i] = nums % 10;
                } else {
                    int num = digits[i] + carry;
                    carry = num / 10;
                    digits[i] = num % 10;
                }
                if (i == 0 && carry > 0) {
                    digits = new int[digits.length + 1];
                    digits[0] = 1;
                }
            }
        }
        return digits;
    }
}
