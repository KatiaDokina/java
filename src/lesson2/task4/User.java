package lesson2.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList<Skill> skills;
    private Car car;

    public User(int id, String name, String surname, String email, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }



    //    public User(int id, String name, String surname, String email, int age, Gender gender, ArrayList<Skills> skills, Car car) {
//        this.id = id;
//        this.name = name;
//        this.surname = surname;
//        this.email = email;
//        this.age = age;
//        this.gender = gender;
//        this.skills = ArrayList<Skills> skills = new ArrayList<>();
//        skills.add(new Skills("java", 10));
//        skills.add(new Skills("js", 10));
//        skills.add(new Skills("c++", 10));
//        this.car = car;
//
//
//    }
}


