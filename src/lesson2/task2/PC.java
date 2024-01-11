package lesson2.task2;
//Створити та описати наступну їєрархію
//        PC-Laptop-Ultrabook
//        PC-Laptop- Workstation
//        Загальна кількість вкористаних класів - 4!

public class PC {
    private String processor;
    private String memory;
    private String screen;

    public PC(String processor, String memory, String screen) {
        this.processor = processor;
        this.memory = memory;
        this.screen = screen;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "PC{" +
                "processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
}
