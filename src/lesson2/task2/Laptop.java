package lesson2.task2;

public class Laptop extends PC{
    private boolean battery;

    public Laptop(String processor, String memory, String screen, boolean battery) {
        super(processor, memory, screen);
        this.battery = battery;
    }

    public boolean isBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery=" + battery +
                "} " + super.toString();
    }
}
