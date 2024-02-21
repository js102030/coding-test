import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int solution(String s) {

        int min = Integer.MAX_VALUE;

        for (int length = 1; length <= s.length(); length++) {

            List<String> tokens = new ArrayList<>();
            for (int startIndex = 0; startIndex < s.length(); startIndex += length) {

                int endIndex = startIndex + length;
                if (s.length() < endIndex) {
                    endIndex = s.length();
                }
                tokens.add(s.substring(startIndex, endIndex));
            }

            int compressed = compress(tokens);

            if (compressed < min) {
                min = compressed;
            }
        }
        return min;
    }

    private static int compress(List<String> tokens) {
        StringBuilder sb = new StringBuilder();
        String last = "";
        int count = 0;

        for (String token : tokens) {
            if (token.equals(last)) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(count);
                }
                sb.append(last);
                last = token;
                count = 1;
            }
        }
        if (count > 1) {
            sb.append(count);
        }
        sb.append(last);

        return sb.length();
    }
}