package Homework.HomeWork_5.HW;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args){
        UserService userService = new UserService();
        List<User> users = new ArrayList<>();
        users.add(userService.create(new Student()));
        users.add(userService.create(new Teacher()));
        userService.read(users);
    }

}
