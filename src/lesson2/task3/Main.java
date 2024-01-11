package lesson2.task3;

import java.util.ArrayList;

//Cтворити клас ланцюг наслідування:
//Папірус-Кинга-Журнал
//Папірус-Книга-Комікс
//Кількість полів довільна.
public class Main {
    public static void main(String[] args) {
        Magazine magazine = new Magazine("plants","Anna","500");
        System.out.println(magazine);
    }
}
