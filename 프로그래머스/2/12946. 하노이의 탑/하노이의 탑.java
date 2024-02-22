import java.util.ArrayList;
import java.util.List;
class Solution {
    public static int[][] solution(int n) {
        List<int[]> array = new ArrayList<>();
        hanoi(1, 2, 3, n, array);
        return array.toArray(new int[0][]);
    }

    public static void hanoi(int start, int via, int end, int n, List<int[]> arr) {
        if (n == 1) {
            arr.add(new int[]{start, end});
            return;
        }

        hanoi(start, end, via, n - 1, arr);
        arr.add(new int[]{start, end});
        hanoi(via, start, end, n - 1, arr);
    }
}