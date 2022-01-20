package length_of_last_word;

public class Solution {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int result = lengthOfLastWorld(s);
        System.out.println(result);
    }

    public static int lengthOfLastWorld(String s) {
        StringBuilder sb = new StringBuilder();
        int r = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
           if (s.charAt(i) != ' ' ) {
                r++;
                sb.append(s.charAt(i));
            } else if (s.charAt(i) == ' ' && r > 0) {
                break;
            }
        }

        return sb.length();
    }
}
