import java.util.Arrays;
class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int c1 = commands[i][0];
            int c2 = commands[i][1];

            int[] newArr = new int[c2 - c1 + 1];
            int aI = c1 - 1;
            for (int k = 0; k < c2 - c1 + 1; k++) {
                newArr[k] = array[aI++];
            }

            int[] sortedArr = Arrays.stream(newArr).sorted().toArray();

            int xTh = commands[i][2];
            result[i] = sortedArr[xTh - 1];
        }
        return result;
    }
}