package lesson1.task3;

import java.util.ArrayList;

public class Start {
    public static void main (String [] args) {
        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(new Comment(1,1,"id labore ex et quam laborum","Eliseo@gardner.biz","laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium"));
        comments.add(new Comment(1,2,"quo vero reiciendis velit similique earum","Jayne_Kuhic@sydney.com","est natus enim nihil est dolore omnis voluptatem numquam\\net omnis occaecati quod ullam at\\nvoluptatem error expedita pariatur\\nnihil sint nostrum voluptatem reiciendis et"));
        comments.add(new Comment(1,3,"odio adipisci rerum aut animi","Nikita@garfield.biz","quia molestiae reprehenderit quasi aspernatur\\naut expedita occaecati aliquam eveniet laudantium\\nomnis quibusdam delectus saepe quia accusamus maiores nam est\\ncum et ducimus et vero voluptates excepturi deleniti ratione"));
        comments.add(new Comment(1,4,"alias odio sit","Lew@alysha.tv","non et atque\\noccaecati deserunt quas accusantium unde odit nobis qui voluptatem\\nquia voluptas consequuntur itaque dolor\\net qui rerum deleniti ut occaecati"));
        comments.add(new Comment(1,5,"vero eaque aliquid doloribus et culpa","Hayden@althea.biz","harum non quasi et ratione\\ntempore iure ex voluptates in ratione\\nharum architecto fugit inventore cupiditate\\nvoluptates magni quo et"));

        for (Comment comment: comments
             ) {
            System.out.println(comment);
        }
    }
}
