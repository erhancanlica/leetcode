package roman_to_integer;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int result = romanToInt("MCMXCIV");
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        int sum = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum = sum - map.get(s.charAt(i));
            } else {
                sum = sum + map.get(s.charAt(i));
            }
        }

        sum = sum + map.get(s.charAt(s.length() - 1));
        return sum;
    }
}
