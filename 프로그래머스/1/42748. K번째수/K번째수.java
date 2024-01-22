import java.util.Arrays;
class Solution {
    public static int[] solution(int[] array, int[][] commands) {
       int[] result = new int[commands.length];
        int i = 0;
        for (int[] command : commands) {
            int first = command[0] - 1;
            int last = command[1];
            int index = command[2] - 1;

            int[] newArr = Arrays.copyOfRange(array, first, last);

            Arrays.sort(newArr);
            result[i++] = newArr[index];
        }
        return result;
    }
}