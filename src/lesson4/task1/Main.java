package lesson4.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Створити List Юзерів


public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("vasya", 31));
        users.add(new User("petya", 30));
        users.add(new User("mukola", 31));
        users.add(new User("anna", 33));
        users.add(new User("diana", 28));
        users.add(new User("olga", 32));
        users.add(new User("andrey", 29));
        users.add(new User("max", 30));

//        - відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)

        users.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(users);
        users.sort((o1, o2) -> o2.getAge() - o1.getAge());
        System.out.println(users);
//        - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)

        users.sort((o1, o2) -> o1.getName().length() - o2.getName().length());
        System.out.println(users);
        users.sort((o1, o2) -> o2.getName().length() - o1.getName().length());
        System.out.println(users);
    }
}
