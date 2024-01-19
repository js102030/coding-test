class Solution {
   public static int solution(int n) {
        String string = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.reverse();
        return Integer.parseInt(sb.toString(), 3);
    }
}