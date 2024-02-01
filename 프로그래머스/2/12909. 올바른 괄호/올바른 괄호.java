import java.util.Stack;
class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                if (st.isEmpty()) {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        return st.empty();
    }
}