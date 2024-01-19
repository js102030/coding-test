class Solution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            char[] charArray = s.toCharArray();
            for (char c : charArray) {
                if (Character.isAlphabetic(c)) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}