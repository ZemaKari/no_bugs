package practice_8v.user;

import practice_8v.user.InvalidAgeException;

public class User {
    private String name;
    private int age;

    public User(String name, int age) throws InvalidAgeException {
        this.name = name;
        if (age < 18 || age > 150){
            throw  new InvalidAgeException("Возраст пользователя " + getName() + " меньше 18 лет или больше 150 лет.");
        }
        this.age = age;
    }



    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
