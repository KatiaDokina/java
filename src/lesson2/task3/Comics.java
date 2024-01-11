package lesson2.task3;

public class Comics extends Book{
    private String genre;

    public Comics() {}

    public Comics(String material, String name, String genre) {
        super(material, name);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public Comics setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "genre='" + genre + '\'' +
                "} " + super.toString();
    }
}

