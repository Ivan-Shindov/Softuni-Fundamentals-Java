package ArticleProblem;

public class Articles {

    private String title;
    private String content;
    private String author;

    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String content) {
        this.content = content;
    }

    public void changeAuthor(String author) {
        this.author = author;
    }

    public void renameTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        String result = String.format("%s - %s: %s", this.title, this.content, this.author);
        return result;
    }
}
