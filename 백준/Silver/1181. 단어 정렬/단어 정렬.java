import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        Set<String> wordSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            wordSet.add(scanner.nextLine());
        }

        List<String> words = new ArrayList<>(wordSet);
        Collections.sort(words, (word1, word2) -> {
            if (word1.length() == word2.length()) {
                return word1.compareTo(word2);
            }
            return word1.length() - word2.length();
        });

        for (String word : words) {
            System.out.println(word);
        }
    }
}
