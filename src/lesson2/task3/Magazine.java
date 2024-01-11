package lesson2.task3;

public class Magazine extends Book {
    private String page;

    public Magazine() {
    }

    public Magazine(String material, String name, String page) {
        super(material, name);
        this.page = page;
    }

    public String getPage() {
        return page;
    }

    public Magazine setPage(String page) {
        this.page = page;
        return this;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "page=" + page +
                "} " + super.toString();
    }
}
