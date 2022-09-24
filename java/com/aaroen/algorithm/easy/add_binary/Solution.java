package com.aaroen.algorithm.easy.add_binary;

public class Solution {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String result = addBinary(a, b);
        System.out.println(result);
    }

    public static String addBinary (String a, String b){
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        int x = a.length() - 1;
        int y = b.length() - 1;

        while (x >= 0 || y >= 0) {
            int sum = carry;

            if (x >= 0) {
                sum += a.charAt(x--) - '0';
            }
            if (y >= 0) {
                sum += b.charAt(y--) - '0';
            }
            carry = sum > 1 ? 1 : 0;
            sb.append(sum % 2);
        }

        if (carry > 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
