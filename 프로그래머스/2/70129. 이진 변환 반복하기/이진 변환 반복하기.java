class Solution {
    public static int[] solution(String s) {
int changeCount = 0;
        int deletedZeroCount = 0;

        String changedString = s;

        do {
            if (changedString.contains("0")) {
                String replace = changedString.replace("0", "");
                deletedZeroCount += changedString.length() - replace.length();
                changedString = Integer.toString(replace.length(), 2);
            } else {
                changedString = Integer.toString(changedString.length(), 2);
            }
            ++changeCount;

        } while (!changedString.equals("1"));
        return new int[]{changeCount, deletedZeroCount};
    }
}