package com.aca.homework2.task1;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Name", "LastName", "Username","email");
        User user2 = user1.copy();
        User user3 = new User(user1);
       /* System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);*/
        UserGroup userGroup1 = new UserGroup();
        for(int i = 0; i < 10; ++i)
        {
            userGroup1.addUser(user1);
        }
        for(int i = 0; i < 10; ++i)
        {
            System.out.println(userGroup1.getUserArr()[i]);
        }

    }
}
