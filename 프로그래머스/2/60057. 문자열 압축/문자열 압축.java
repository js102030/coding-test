import java.util.ArrayList;
import java.util.List;

class Solution {
   public static int solution(String s) {
        int minLength = Integer.MAX_VALUE;
       if (s.length() == 1) {
            return 1;
        }
        for (int length = 1; length < s.length(); length++) {
            List<String> tokens = new ArrayList<>();

            for (int startIndex = 0; startIndex < s.length(); startIndex += length) {

                int endIndex = Math.min(startIndex + length, s.length());
                tokens.add(s.substring(startIndex, endIndex));
            }

            if (compress(tokens).length() < minLength) {
                minLength = compress(tokens).length();
            }
        }
        return minLength;
    }

    private static String compress(List<String> tokens) {
        StringBuilder sb = new StringBuilder();
        String lastInput = "";
        int repeat = 1;
        for (String token : tokens) {
            if (token.equals(lastInput)) {
                repeat++;
                continue;
            }

            if (repeat == 1) {
                sb.append(lastInput);
            } else {
                sb.append(repeat);
                sb.append(lastInput);
                repeat = 1;
            }

            lastInput = token;

        }
        if (repeat != 1) {
            sb.append(repeat);
        }
        sb.append(lastInput);

        return sb.toString();
    }
}