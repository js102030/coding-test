class Solution {
    boolean solution(String s) {
        char[] charArray = s.toCharArray();
        int pCount = 0;
        int yCount = 0;
        for (char c : charArray) {
            switch (Character.toUpperCase(c)) {
                case 'P' -> pCount++;
                case 'Y' -> yCount++;
            }
        }
        return pCount == yCount;
    }
}