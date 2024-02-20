import java.util.Arrays;
class Solution {
    public int[] solution(long n) {
       StringBuilder reverse = new StringBuilder(n + "").reverse();
        char[] charArray = reverse.toString().toCharArray();
        int[] result = new int[charArray.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(String.valueOf(charArray[i]));
        }
        return result;
    }
}