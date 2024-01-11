package lesson2.task2;

public class Workstation extends Laptop{
private String videoCard;

    public Workstation(String processor, String memory, String screen, boolean battery, String videoCard) {
        super(processor, memory, screen, battery);
        this.videoCard = videoCard;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "videoCard='" + videoCard + '\'' +
                "} " + super.toString();
    }
}
