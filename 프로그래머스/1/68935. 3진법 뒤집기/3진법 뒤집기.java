class Solution {
    public int solution(int n) {
        String radix3 = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(radix3);
        StringBuilder reverse = sb.reverse();
        return Integer.parseInt(reverse.toString(),3);
    }
}