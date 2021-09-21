package Arrays.MoreExerciseSolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Encrypt_SortAndPrint_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
            int[] outputArray = new int[n];

            for (int i = 0; i < n; i++) {
                String input = scanner.nextLine();
                int length = input.length();
                int sum = 0;

                for (int j = 0; j < input.length(); j++) {
                    char symbol = input.charAt(j);

                  if (isVowel(symbol)) {
                      sum += symbol * length;
                  } else if (isConsonant(symbol)) {
                      sum += symbol / length;
                  } else {
                      sum += symbol / length;
                  }

                }
                outputArray[i] = sum;
            }
//        Arrays.sort(outputArray);
//          does same -->
            int min = Integer.MAX_VALUE;
            int temp = 0;
            for (int i = 0; i < outputArray.length; i++) {
                for (int j = i + 1; j < outputArray.length; j++) {
                    if (outputArray[i] > outputArray[j]) {
                        temp = outputArray[i];
                        outputArray[i] = outputArray[j];
                        outputArray[j] = temp;

                    }
                }
            }
            for (int i : outputArray) {
                System.out.println(i);
            }
        }

    private static boolean isConsonant(char symbol) {
        boolean flag = false;
        String consonant = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for (int i = 0; i < consonant.length(); i++) {
            if (symbol == consonant.charAt(i)) {
                flag = true;
            }
        }
        return flag;
    }

    private static boolean isVowel(char symbol) {
        boolean flag = false;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < vowels.length(); i++) {
            if (symbol == vowels.charAt(i)) {
                flag = true;
            }
        }
        return flag;
    }
}

