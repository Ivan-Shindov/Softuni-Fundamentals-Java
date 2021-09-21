import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomizeWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        Random random = new Random();

        for (int i = 0; i < input.length; i++) {
           int swapIndex = random.nextInt(input.length);

           String temp = input[i];
           input[i] = input[swapIndex];
           input[swapIndex] = temp;

        }

        for (String word : input) {
            System.out.println(word);
        }
    }
}
