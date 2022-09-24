package com.aaroen.algorithm.easy.merge_sorted_array;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];

        int i = 0, j = 0;
        int idx = 0;
        while(i < m && j < n) {
            if (nums1[i] <= nums2[j])
                result[idx++] = nums1[i++];
            else
                result[idx++] = nums2[j++];
        }

        if (i == m) {
            System.arraycopy(nums2, j, result, idx, n - j);
        } else {
            System.arraycopy(nums1, i, result, idx, m - i);
        }

        System.arraycopy(result, 0, nums1, 0, m + n);
        System.out.println(Arrays.toString(result));
    }
}
