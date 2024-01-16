package lesson4.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//        створити ArrayList зі словами на 15-20 елементів.
//                - відсортувати його за алфавітом .
public class Main {
    public static void main(String[] args) {
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Incomprehensibilities"));
        words.add(new Word("Contemporaneousness"));
        words.add(new Word("Interchangeableness"));
        words.add(new Word("Semiautobiographical"));
        words.add(new Word("Nonrepresentational"));
        words.add(new Word("Adrenocorticotrophic"));
        words.add(new Word("Uncharacteristically"));
        words.add(new Word("Electrocardiographic"));
        words.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(words);
    }
}
