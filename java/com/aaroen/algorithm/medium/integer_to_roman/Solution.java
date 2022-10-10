package com.aaroen.algorithm.medium.integer_to_roman;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int num = 1994;
        System.out.println(intToRoman(num));
    }

    public static String intToRoman(int num) {
        LinkedHashMap<String, Integer> characterIntegerMap = new LinkedHashMap<>();
        characterIntegerMap.put("M", 1000);
        characterIntegerMap.put("CM", 900);
        characterIntegerMap.put("D", 500);
        characterIntegerMap.put("CD", 400);
        characterIntegerMap.put("C", 100);
        characterIntegerMap.put("XC", 90);
        characterIntegerMap.put("L", 50);
        characterIntegerMap.put("XL", 40);
        characterIntegerMap.put("X", 10);
        characterIntegerMap.put("IX", 9);
        characterIntegerMap.put("V", 5);
        characterIntegerMap.put("IV", 4);
        characterIntegerMap.put("I", 1);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : characterIntegerMap.entrySet()) {
            while (num >= entry.getValue()) {
                num -= entry.getValue();
                sb.append(entry.getKey());
            }
        }

        return sb.toString();
    }
}


