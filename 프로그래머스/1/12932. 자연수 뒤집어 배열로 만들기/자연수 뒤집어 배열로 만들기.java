import java.util.Arrays;
class Solution {
    public static int[] solution(long n) {
        StringBuilder reverse = new StringBuilder(n + "").reverse();
        char[] charArray = reverse.toString().toCharArray();
        int[] result = new int[charArray.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = charArray[i] - '0';
        }
        return result;
    }
}