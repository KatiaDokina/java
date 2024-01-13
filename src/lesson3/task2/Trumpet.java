package lesson3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Trumpet implements Instrument {
    private int diameter;
    private String name;
    public String greeting () {
        return "Plays a" + " " + name + " " + "instrument with the following diameter";
    }


    @Override
    public void play() {
        System.out.println(this.greeting() + " " + "-" + " " + diameter);
    }
}
