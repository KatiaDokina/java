package lesson2.task2;

public class Ultrabook extends Laptop{
    private String weight;

    public Ultrabook(String processor, String memory, String screen, boolean battery, String weight) {
        super(processor, memory, screen, battery);
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "weight='" + weight + '\'' +
                "} " + super.toString();
    }
}
