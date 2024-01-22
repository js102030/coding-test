import java.util.Arrays;
import java.util.HashSet;
class Solution {
   public static int[] solution(int[] numbers) {
        HashSet<Integer> resultSet = new HashSet<>();
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                resultSet.add(numbers[i] + numbers[j]);
            }
        }
        int[] array = resultSet.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(array);
        return array;
    }
}