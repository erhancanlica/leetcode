package search_insert_position;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = searchInsert(nums, target);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        if (right + 1 == 0) return 0;

        while (left <= right) {
            int mid = left + (right -left) / 2;

            if (nums[mid] == target) return mid;

            if (left == right) {
                if (nums[left] < target) return left + 1;
                else return left;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            }

            if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return left;
    }
}
