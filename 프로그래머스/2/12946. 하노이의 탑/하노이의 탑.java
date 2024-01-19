import java.util.ArrayList;
class Solution {
    public static ArrayList<int[]> list = new ArrayList<>();

    public static int[][] solution(int n) {
        int[][] answer = {};
        hanoi(1, 2, 3, n);
        return list.toArray(new int[0][]);
    }

    public static void hanoi(int start, int via, int end, int n) {
        if (n == 1) {
            list.add(new int[]{start, end});
            return;
        }
        hanoi(start, end, via, n - 1);
        list.add(new int[]{start, end});
        hanoi(via, start, end, n - 1);
    }
}