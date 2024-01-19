class Solution {
    public int[] solution(long n) {
       StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 10);
            n /= 10;
        }
        char[] charArray = sb.toString().toCharArray();
        int[] result = new int[charArray.length];
        int idx = 0;
        for (char c : charArray) {
            result[idx++] = Character.getNumericValue(c);
        }
        return result;
    }
}