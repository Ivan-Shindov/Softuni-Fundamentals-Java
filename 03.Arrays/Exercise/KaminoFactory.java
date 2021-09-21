import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lengthOfSequence = Integer.parseInt(scanner.nextLine());

        int countRows = 0;
        int bestCountRows = 0;
        int bestCountOnes = 0;
        int countSequence = 0;
        int firstIndex = 0;
        int bestIndex = Integer.MAX_VALUE;
        int bestSequence = 0;

        String[] bestArray = new String[lengthOfSequence];

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Clone them!")) {
                break;
            }

            countRows++;
            int countOnes = 0;
            String[] DNA = input.split("!+");

            for (int i = 0; i < DNA.length; i++) {

                int currentCountSequence = 0;
                int currentFirstIndex = -1;
                int currentCountOnes = 0;

                if (DNA[i].equals("1")) {
                    currentCountOnes++;
                }


                for (int j = i + 1; j < DNA.length; j++) {
                    if (DNA[i].equals("1") && DNA[j].equals("1") && currentFirstIndex == -1) {
                        currentFirstIndex = i;
                    }
                    if (DNA[i].equals("1") && DNA[j].equals("1")) {
                        currentCountSequence++;

                    } else {
                        break;
                    }
                }
                if (currentCountSequence > countSequence) {
                    firstIndex = currentFirstIndex;
                    countSequence = currentCountSequence;
                    bestCountRows = countRows;

                }
                if (currentCountSequence == countSequence && firstIndex > currentFirstIndex){
                    firstIndex = currentFirstIndex;
                    countSequence = currentCountSequence;
                    bestCountRows = countRows;
                }
                countOnes += currentCountOnes;
            }


            if (countSequence > bestSequence) {
                bestIndex = firstIndex;
                bestSequence = countSequence;
                bestArray = Arrays.copyOf(DNA, DNA.length);
                bestCountOnes = countOnes;



            }
            if (countSequence == bestSequence && firstIndex < bestIndex) {
                bestIndex = firstIndex;
                bestArray = Arrays.copyOf(DNA, DNA.length);
                bestCountOnes = countOnes;

            }
            if (countSequence == bestSequence && firstIndex == bestIndex && countOnes > bestCountOnes) {
                bestCountRows = countRows;
                bestIndex = firstIndex;
                bestArray = Arrays.copyOf(DNA, DNA.length);
                bestCountOnes = countOnes;

            }
        }
        System.out.println(String.format("Best DNA sample %d with sum: %d.", bestCountRows, bestCountOnes));
        System.out.println(String.join(" ", bestArray));
    }
}
