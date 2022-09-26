package com.aaroen.algorithm.easy.find_smallest_letter;

public class Solution {

    public static void main(String[] args) {
       char[] letters = new char[] {'c','f','j'};
       char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int begin = 0;
        int end = letters.length -1;

        while (begin <= end) {
            int mid = begin + (end - begin) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }
        return letters[begin % letters.length];
    }
}