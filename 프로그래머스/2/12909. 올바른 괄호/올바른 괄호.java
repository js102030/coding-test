import java.util.Stack;
class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            try {
                switch (c) {
                    case '(' -> st.push(c);
                    case ')' -> st.pop();
                }
            } catch (Exception e) {
                return false;
            }
        }
        return st.empty();
    }
}