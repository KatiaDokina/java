package lesson1.task2;


import java.util.ArrayList;

public class Start {
    public static void main (String [] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,1,"sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"));
        users.add(new User(1,2,"qui est esse","est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\\nqui aperiam non debitis possimus qui neque nisi nulla"));
        users.add(new User(1,3,"ea molestias quasi exercitationem repellat qui ipsa sit aut","et iusto sed quo iure\\nvoluptatem occaecati omnis eligendi aut ad\\nvoluptatem doloribus vel accusantium quis pariatur\\nmolestiae porro eius odio et labore et velit aut"));
        users.add(new User(1,4,"eum et est occaecati","ullam et saepe reiciendis voluptatem adipisci\\nsit amet autem assumenda provident rerum culpa\\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\\nquis sunt voluptatem rerum illo velit"));
        users.add(new User(1,5,"nesciunt quas odio","repudiandae veniam quaerat sunt sed\\nalias aut fugiat sit autem sed est\\nvoluptatem omnis possimus esse voluptatibus quis\\nest aut tenetur dolor neque"));

        for (User user: users
             ) {
            System.out.println(user);
        }
    }
}
