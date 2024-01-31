import java.util.HashMap;

class Solution {
    public static int solution(int n) {
        int[] table = new int[n + 1];
        table[0] = 0;
        table[1] = 1;

        for (int i = 2; i <= n; i++) {
            table[i] = (table[i - 2] + table[i - 1]) % 1234567;
        }

        return table[n];
    }
}