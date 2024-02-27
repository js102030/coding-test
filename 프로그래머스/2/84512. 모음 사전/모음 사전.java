import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final char[] chars = "AEIOU".toCharArray();

    public int solution(String word) {

        List<String> arr = new ArrayList<>();

        addChars("", arr);

        return arr.indexOf(word);
        
    }

    private void addChars(String s, List<String> arr) {
        arr.add(s);

        if (s.length() == 5) {
            return;
        }

        for (char c : chars) {
            addChars(s + c, arr);
        }
    }
    
    
    
    
}