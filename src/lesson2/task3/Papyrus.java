package lesson2.task3;

public class Papyrus {
    private String material;

    public Papyrus() {}

    public Papyrus(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public Papyrus setMaterial(String material) {
        this.material = material;
        return this;
    }


    @Override
    public String toString() {
        return "Papyrus{" +
                "material='" + material + '\'' +
                '}';
    }
}
