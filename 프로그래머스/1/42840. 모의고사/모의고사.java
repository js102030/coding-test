import java.util.ArrayList;
class Solution {
    private static final int[][] SUPOS = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5},
    };
    private static final int[] counts = new int[3];

    public static int[] solution(int[] answers) {

        int index;
        int idx = 0;
        for (int answer : answers) {
            for (int k = 0; k < SUPOS.length; k++) {
                index = idx % SUPOS[k].length;
                if (answer == SUPOS[k][index]) {
                    ++counts[k];
                }
            }
            ++idx;
        }
        int max = Math.max(Math.max(counts[0], counts[1]), counts[2]);

        ArrayList<Integer> result = new ArrayList<>();
        for (int j = 0; j < counts.length; j++) {
            if (max == counts[j]) {
                result.add(j + 1);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
    
}