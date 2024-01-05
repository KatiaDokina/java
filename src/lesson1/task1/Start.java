package lesson1.task1;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Atlas Shrugged", 550, "Ayn Rand", "novel"));
        books.add(new Book("Me Before You",550,"Jojo Moyes","novel"));
        books.add(new Book("The Girl You Left Behind",450,"Jojo Moyes","novel"));
        books.add(new Book("After You ",550,"Jojo Moyes","novel"));
        books.add(new Book("Still Me",500,"Jojo Moyes","novel"));
        for (Book book: books
             ) {
            System.out.println(book);
        }
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW X5",347,4.6,"V8"));
        cars.add(new Car("Audi Q5",180,2.0,"TFSI"));
        cars.add(new Car("Škoda Scout ",200,2.0,"TDI"));
        cars.add(new Car("Hyundai Sonata",204,2.4,"GDI"));
        cars.add(new Car("Volkswagen CC",170,2.0,"TDI"));
        for (Car car: cars
             ) {
            System.out.println(car);
        }
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Charlie",5,"bouledogue français"));
        dogs.add(new Dog("Zoom",3,"jack russell terrier"));
        dogs.add(new Dog("Maki",1,"staffordshire bull terrier"));
        dogs.add(new Dog("Mickey",1,"pomeranian spitz"));
        dogs.add(new Dog("Bella",2,"bouledogue français"));
        for (Dog dog: dogs
             ) {
            System.out.println(dog);
        }
    }
}

