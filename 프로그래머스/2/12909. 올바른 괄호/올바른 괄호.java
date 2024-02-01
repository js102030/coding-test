import java.util.Stack;
class Solution {
    boolean solution(String s) {
       Stack<Character> st = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            st.push(c);
        }
        int count = 0;
        for (Character c : st) {
            switch (c) {
                case '(' -> ++count;
                case ')' -> --count;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
}