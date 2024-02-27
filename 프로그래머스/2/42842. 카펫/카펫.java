class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};

        for (int width = 3; width <= 5000; width++) {
            for (int height = 1; height <= width; height++) {
                if (yellow == (width - 2) * (height - 2)) {
                    if (brown == (width * 2 + height * 2 - 4)) {
                        answer = new int[] {width,height};
                    }
                }
            }
        }
        return answer;
    }
}