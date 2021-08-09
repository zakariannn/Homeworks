package com.aca.homework2.task1;

public class User implements Cloneable{
    public String firstName;
    public String lastName;
    public String username;
    public String email;

    public User() {
        super();
    }

    public User(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    public User(User user) {
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.username = user.username;
        this.email = user.email;
    }

    public User copy(){
        User copyUser = new User();
        copyUser.firstName = this.firstName;
        copyUser.lastName = this.lastName;
        copyUser.username = this.username;
        copyUser.email = this.email;
        return copyUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        final User clonned = (User) super.clone();
        return clonned;
    }
}
