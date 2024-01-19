class Solution {
    boolean solution(String s) {
        char[] charArray = s.toCharArray();
        int countP = 0;
        int countY = 0;
        for (char c : charArray) {
            switch (c){
                case 'p' -> ++countP;
                case 'P' -> ++countP;
                case 'y' -> ++countY;
                case 'Y' -> ++countY;
            }
        }

        return countP == countY;
    }
}