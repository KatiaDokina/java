package lesson2.task4;

import java.util.ArrayList;

import static lesson2.task4.Gender.MALE;

//Створити клас котрий відповідає наступній моделі
//        {
//        id: 1,
//        name: 'vasya',
//        surname: 'pupkin',
//        email: 'asd@asd.com',
//        age: 31,
//        gender: 'MALE',
//        skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//        car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.
public class Main {
    public static void main(String[] args) {
        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill("java", 10));
        skills.add(new Skill("js", 10));
        skills.add(new Skill("c++", 10));
        Gender gender = MALE;
        Car car = new Car("toyota", 2021,250);

    User user = new User (1,"vasya","pupkin","asd@asd.com",31,gender,skills,car);
        System.out.println(user);

}
}
