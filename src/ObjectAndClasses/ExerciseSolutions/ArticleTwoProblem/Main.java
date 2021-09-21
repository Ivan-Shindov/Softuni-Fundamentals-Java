package ObjectAndClasses.ExerciseSolutions.ArticleTwoProblem;

import ArticleProblem.Articles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article> listOfArticles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            String title = tokens[0];
            String content = tokens[1];
            String author = tokens[2];

            Article articles = new Article(title,content,author);
            listOfArticles.add(articles);
        }
        String input = scanner.nextLine();
        if (input.equals("content")) {
            listOfArticles.stream()
                    .sorted((a1,a2) -> a1.getContent().compareTo(a2.getContent()))
                    .forEach(a -> System.out.println(a));
        } else if (input.equals("title")) {
            listOfArticles.stream()
                    .sorted((a1,a2) -> a1.getTitle().compareTo(a2.getTitle()))
                    .forEach(a -> System.out.println(a));
        } else if (input.equals("author")) {
            listOfArticles.stream()
                    .sorted((a1,a2) -> a1.getAuthor().compareTo(a2.getAuthor()))
                    .forEach(a -> System.out.println(a));
        }
    }
}
