package creational.builder.design.pattern;

import creational.builder.design.pattern.User;

public class BuilderDemo {

    public static void main(String[] args) {
        User user = new User.UserBuilder("test", "test123@test.com").buildUserAge(25).buildUserSSN("1112223564").build();

        System.out.println("User Name: " + user.getUserName()+ "\n" +
                "User Email: " + user.getUserEmail() + "\n" +
                "User SSN: " + user.getUserSSN() + "\n" +
                "User Age: " + user.getUserAge());
    }
}
