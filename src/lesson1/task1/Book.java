package lesson1.task1;

public class Book {
    private String title;
    private int pages;
    private String author;
    private String genre;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Book(String title, int pages, String author, String genre) {
        this.title = title;
        this.pages = pages;
        Author = author;
        this.genre = genre;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", Author='" + Author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
