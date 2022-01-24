import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {


        User user = new User();
        User user1 = new User("lopata","987654321");
        User user2 = new User("grabli","123456789");

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        User.findUsers("pivo","12",userList);
        User.findUsers("lopata","987654321",userList);
        User.findUsers("grabli","123456789",userList);
        User.findUsers("vidro","99999999",userList);


    }
}
