package lesson4.task3;
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



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Skill [] skills = {new Skill("java",10),new Skill("js",10),new Skill("c++",10)};
        Skill [] skills1 = {new Skill("java",10)};
        Skill [] skills2 = {new Skill("java",10),new Skill("js",10)};;
        Skill [] skills3 = {new Skill("java",10),new Skill("js",10),new Skill("c++",10),new Skill("css",10)};

        //        Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
        HashSet<User> users = new HashSet<>();

        users.add(new User(1, "vasya", "pukin", "asd@asd.com", 31, Gender.MALE,skills, new Car("toyota", 2022, 250)));
        users.add(new User(2, "pavlo", "moroz", "asd@asd.com", 28, Gender.MALE, skills1, new Car("bmw", 2023, 240)));
        users.add(new User(3, "ruslana", "solod", "asd@asd.com", 30, Gender.FEMALE, skills2, new Car("audi", 2022, 240)));
        users.add(new User(4, "oleg", "pukin", "asd@asd.com", 27, Gender.MALE, skills3, new Car("skoda", 2019, 190)));
        users.add(new User(5, "olga", "pugach", "asd@asd.com", 25, Gender.FEMALE, skills, new Car("toyota", 2020, 260)));
        users.add(new User(6, "andrey", "kishak", "asd@asd.com", 20, Gender.MALE, skills1, new Car("bmw", 2022, 250)));
        users.add(new User(7, "mukola", "fito", "asd@asd.com", 35, Gender.MALE, skills2, new Car("aydi", 2021, 240)));
        users.add(new User(8, "diana", "pukin", "asd@asd.com", 32, Gender.FEMALE, skills3, new Car("toyota", 2020, 230)));
        users.add(new User(9, "anna", "moroz", "asd@asd.com", 30, Gender.FEMALE, skills1, new Car("skoda", 2018, 260)));
        users.add(new User(10, "olga", "solod", "asd@asd.com", 29, Gender.FEMALE, skills, new Car("toyota", 2021, 250)));

        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (next.getGender() == Gender.MALE) {
                iterator.remove();
            }
        }
        System.out.println(users);

//        Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого
        Set<User> users1 = new TreeSet<>();
        users1.add(new User(1, "vasya", "pukin", "asd@asd.com", 31, Gender.MALE,skills, new Car("toyota", 2022, 250)));
        users1.add(new User(2, "pavlo", "moroz", "asd@asd.com", 28, Gender.MALE, skills1, new Car("bmw", 2023, 240)));
        users1.add(new User(3, "ruslana", "solod", "asd@asd.com", 30, Gender.FEMALE, skills2, new Car("audi", 2022, 240)));
        users1.add(new User(4, "oleg", "pukin", "asd@asd.com", 27, Gender.MALE, skills3, new Car("skoda", 2019, 190)));
        users1.add(new User(5, "olga", "pugach", "asd@asd.com", 25, Gender.FEMALE, skills, new Car("toyota", 2020, 260)));
        users1.add(new User(6, "andrey", "kishak", "asd@asd.com", 20, Gender.MALE, skills1, new Car("bmw", 2022, 250)));
        users1.add(new User(7, "mukola", "fito", "asd@asd.com", 35, Gender.MALE, skills2, new Car("aydi", 2021, 240)));
        users1.add(new User(8, "diana", "pukin", "asd@asd.com", 32, Gender.FEMALE, skills3, new Car("toyota", 2020, 230)));
        users1.add(new User(9, "anna", "moroz", "asd@asd.com", 30, Gender.FEMALE, skills1, new Car("skoda", 2018, 260)));
        users1.add(new User(10, "olga", "solod", "asd@asd.com", 29, Gender.FEMALE, skills, new Car("toyota", 2021, 250)));




    }
}


