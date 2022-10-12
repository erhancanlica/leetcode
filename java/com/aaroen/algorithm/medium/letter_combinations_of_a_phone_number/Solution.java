package com.aaroen.algorithm.medium.letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        ArrayList<String> response = new ArrayList<>();
        if (digits.equals("")) return response;
        HashMap<Character, String> characterStringHashMap = new HashMap<>();
        characterStringHashMap.put('2', "abc");
        characterStringHashMap.put('3', "def");
        characterStringHashMap.put('4', "ghi");
        characterStringHashMap.put('5', "jkl");
        characterStringHashMap.put('6', "mno");
        characterStringHashMap.put('7', "pqrs");
        characterStringHashMap.put('8', "tuv");
        characterStringHashMap.put('9', "wxyz");
        backtrack(digits, 0, characterStringHashMap, new StringBuilder(), response);
        return response;
    }

    public static void backtrack(String digits, int index, Map<Character, String> characterStringMap, StringBuilder sb, List<String> response) {
        if (index == digits.length()) {
            response.add(sb.toString());
            return;
        }
        String str = characterStringMap.get(digits.charAt(index));
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            backtrack(digits, index + 1, characterStringMap, sb, response);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
