import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = (scanner.nextLine().split("\\s+"));
        Map<String, Integer> countsOfWords = new LinkedHashMap<>();

        for (String word : words) {
            String wordInLowerCase = word.toLowerCase();
            if (countsOfWords.containsKey(wordInLowerCase)) {
                countsOfWords.put(wordInLowerCase, countsOfWords.get(wordInLowerCase) + 1);

            } else {
                countsOfWords.put(wordInLowerCase, 1);
            }
        }

        List<String> oddsCountWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : countsOfWords.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                oddsCountWords.add(entry.getKey());
            }
        }
        for (int i = 0; i < oddsCountWords.size(); i++) {
            System.out.print(oddsCountWords.get(i));
            if (i < oddsCountWords.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
