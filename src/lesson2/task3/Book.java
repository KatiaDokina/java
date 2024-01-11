package lesson2.task3;

public class Book extends Papyrus{
    private String name;

   public Book () {}

    public Book(String material, String name) {
        super(material);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}

