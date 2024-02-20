class Solution {
    public static String solution(String s, int n) {
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (65 <= c && c <= 90) {
                c += (char) n;
                if (90 < c) {
                    c = (char) (c % 90 + 64);
                }
            } else if (97 <= c && c <= 122) {
                c += (char) n;
                if (122 < c) {
                    c = (char) (c % 122 + 96);
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}