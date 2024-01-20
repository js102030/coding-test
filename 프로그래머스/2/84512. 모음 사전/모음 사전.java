import java.util.ArrayList;

class Solution {
    private static final char[] chars = "AEIOU".toCharArray();

    private static void generate(String s, ArrayList<String> words) {
        words.add(s);

        if (s.length() == 5) {
            return;
        }
        for (char c : chars) {
            generate(s + c, words);
        }
    }

    public static int solution(String word) {
        ArrayList<String> words = new ArrayList<>();
        generate("", words);
        return words.indexOf(word);
    }
}