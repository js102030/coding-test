class Solution {
   public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                int offset = Character.isUpperCase(c) ? 'A' : 'a';
                int position = c - offset;
                position = (position + n) % (26);
                sb.append((char) (offset + position));
            } else {
                sb.append(c);
            }

        }
        return sb.toString();
    }
}