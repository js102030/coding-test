class Solution {
    public static int[][] arr = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

    public int[] solution(int[] answers) {

        int a = 0;
        int b = 0;
        int c = 0;

        int indexA = 0;
        int indexB = 0;
        int indexC = 0;
        for (int i : answers) {

            int[] arrA = arr[0];
            int[] arrB = arr[1];
            int[] arrC = arr[2];

            indexA %= arrA.length;
            indexB %= arrB.length;
            indexC %= arrC.length;

            if (arrA[indexA++] == i) {
                a++;
            }
            if (arrB[indexB++] == i) {
                b++;
            }
            if (arrC[indexC++] == i) {
                c++;
            }
        }

        int max = Math.max(Math.max(a, b), c);
        boolean[] isMax = {max == a, max == b, max == c};
        int count = 0;

        for (boolean value : isMax) {
            if (value) count++;
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < isMax.length; i++) {
            if (isMax[i]) {
                result[index++] = i + 1; // 1, 2, 3 중 어떤 것이 최대값인지를 나타냅니다.
            }
        }

        return result;
    }
}