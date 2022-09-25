package com.aaroen.algorithm.medium.zigzag_connversion;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRI", 4));
    }


    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        String[] strings = new String[s.length()];
        Arrays.fill(strings, "");

        int row = 0;
        boolean flag = true;

        for (int i = 0; i < s.length(); i++) {

            if (flag) {
                strings[row++] += s.charAt(i);
                if (row == numRows - 1) {
                    flag = false;
                }
            } else {
                strings[row--] += s.charAt(i);
                if (row == 0) {
                    flag = true;
                }
            }
        }

        String response = "";

        for (int i = 0; i < strings.length; i++) {
            response += strings[i];
        }

        return response;
    }
}
