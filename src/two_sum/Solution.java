package two_sum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        int[] response = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.print(Objects.requireNonNull(response)[0]);
        System.out.print(" ");
        System.out.print(response[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int findValue = target - nums[i];
            if (map.containsKey(findValue) && map.get(findValue) != i) {
                return new int[]{i, map.get(findValue)};
            }
        }
        return new int[0];
    }
}
