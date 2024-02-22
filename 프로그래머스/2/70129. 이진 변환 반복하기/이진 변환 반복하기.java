class Solution {
    public int[] solution(String s) {
        int countDeletedZero = 0;
        int changeCount = 0;
        while (!s.equals("1")) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    sb.append(c);
                } else {
                    countDeletedZero++;
                }
            }
            int length = sb.length();
            s = Integer.toString(length, 2);
            changeCount++;
        }
        return new int[]{changeCount, countDeletedZero};
    }
}