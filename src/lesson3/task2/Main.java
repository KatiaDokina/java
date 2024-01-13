package lesson3.task2;

import java.util.ArrayList;

//        Створити інтерфейс Instrument та реалізовуючі його класи "Гітара", "Барабан"  та "Труба" .
//        Інтерфейс Instrument  містить метод play().
//        Клас "Гітара" містить змінну класу "кількістьСтрун",
//        клас "Барабан" - розмір, а клас "Труба" - діаметр.
//        Створити масив типу "Інструмент" (Instrument), що містить інструменти різних типів.
//        У циклі викликати метод play() для кожного інструменту,
//        який повинен виводити рядок "Грає такий-то інструмент з такими-то характеристиками".
public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Guitar("6", "Guitar"));
        instruments.add(new Drum(50, "Drum"));
        instruments.add(new Trumpet(20, "Trumpet"));
        for (Instrument instrument1: instruments
             ) { instrument1.play();
        }
    }
}
