package lesson3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Guitar implements Instrument{
    private String numberOfStrings;

    @Override
    public void play(){

    }
}
