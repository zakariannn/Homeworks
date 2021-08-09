package com.aca.homework2.task1;

import java.util.Arrays;

public class UserGroup implements Cloneable{
    private User[] userArr = new User[10];
    public static int count = 0;

    public User[] getUserArr() {
        return userArr;
    }

    public void addUser(User user) {

        if(count < userArr.length)
        {
            userArr[count] = user;
            ++count;
        }else{
            throw new RuntimeException("No place available");
        }
    }

    @Override
    protected UserGroup clone() throws CloneNotSupportedException {
       final UserGroup clonned = (UserGroup) super.clone();
       for(int i = 0; i < clonned.getUserArr().length; ++i)
       {
           if(clonned.getUserArr()[i] != null)
           {
               clonned.getUserArr()[i].clone();
           }
       }
       return clonned;
    }


}
