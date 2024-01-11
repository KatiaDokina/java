package lesson3.task1;

import java.util.ArrayList;
//        а) Оприділити інтерфейс Printable, який містить метод void print().
//        б) Оприділити клас Book, що реалізує інтерфейс Printable.
//        в) Оприділити клас Magazine, що реалізує інтерфейс Printable.
//        г) Створити масив типу Printable, який буде містити книги та журнали.
public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book());
        printables.add(new Magazine());
    }
}
