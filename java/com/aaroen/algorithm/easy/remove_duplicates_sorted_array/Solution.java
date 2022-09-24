package com.aaroen.algorithm.easy.remove_duplicates_sorted_array;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5, 6};
        int size = removeDuplicates(nums);
        System.out.println(size);
    }

    public static int removeDuplicates(int[] nums) {
        int index = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }
        }
        return index;
    }
}
