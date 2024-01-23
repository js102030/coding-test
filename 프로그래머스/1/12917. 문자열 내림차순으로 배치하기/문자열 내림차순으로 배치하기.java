import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String[] split = s.split("");
        Arrays.sort(split);
        StringBuilder sb = new StringBuilder();
        for (int i = split.length - 1; 0 <= i; i--) {
            sb.append(split[i]);
        }
        return sb.toString();
    }
}