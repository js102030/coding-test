import java.util.Arrays;
class Solution {
     public static int solution(int[] citations) {
        Arrays.sort(citations);
        for (int h = citations.length; 1 <= h; h--) {
            if (h <=citations[citations.length - h]) {
                return h;
            }
        }
        return 0;
    }
}