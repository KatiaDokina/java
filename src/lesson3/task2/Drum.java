package lesson3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Drum implements Instrument {
    private int size;
    private String name;
    public String greeting () {
        return "Plays a" + " " + name + " " +"with the following size";
    }


    @Override
    public void play() {
        System.out.println(this.greeting() + " " + "-" + " " + size);
    }
}
