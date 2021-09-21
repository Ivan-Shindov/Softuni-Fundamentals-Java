package ObjectAndClasses.ExerciseSolutions.ArticleProblem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        String title = input[0];
        String content = input[1];
        String author = input[2];

        Articles article = new Articles(title,content,author);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            input = scanner.nextLine().split(": ");
            String command = input[0];

            switch (command) {
                case "Edit":
                    article.edit(input[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(input[1]);
                    break;
                case "Rename":
                    article.renameTitle(input[1]);
                    break;
            }
        }
        System.out.println(article);
    }
}
