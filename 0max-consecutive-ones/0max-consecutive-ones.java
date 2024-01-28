class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                ++count;
                if (max < count) {
                    max = count;
                }
                continue;
            }

            
            count = 0;
        }
        return max;
    }
}