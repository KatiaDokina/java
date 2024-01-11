package lesson3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Drum implements Instrument{
    private int size;

    @Override
    public void play() {

    }
}
