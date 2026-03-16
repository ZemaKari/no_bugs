package practice_8v.user;

public class Main {
    public static void main(String[] args) {
        try {
            User anton = new User("Anton", 25);
            System.out.println(anton);
        } catch (InvalidAgeException e) {
            System.out.println("Поймали исключение" + e);
        }

        try {
            User igor = new User("Igor", 17);
            System.out.println(igor);
        } catch (InvalidAgeException e) {
            System.out.println("Поймали исключение " + e);

        }
    }
}
