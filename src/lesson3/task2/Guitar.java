package lesson3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Guitar implements Instrument {

    private String numberOfStrings;
    private String name;
    public String greeting () {
      return "Plays a" + " " + name + " with the following number Of Strings";
    }

    @Override
    public void play() {
        System.out.println(this.greeting() + " " + "-" + " " + numberOfStrings);
    }
}
