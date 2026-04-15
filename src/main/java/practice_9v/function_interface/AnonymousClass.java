package practice_9v.function_interface;

public class AnonymousClass {
    public static void main(String[] args) {
        //Создайте анонимный класс, реализующий интерфейс Runnable,
        // который выводит сообщение "Hello from anonymous class!".

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        runnable.run();

    }
}
