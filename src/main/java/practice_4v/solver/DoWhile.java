package practice_4v.solver;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // проверка метода positiveNumber()
//        positiveNumber();
        //  проверка метода passwordCheck()
//        passwordCheck();
        // проверка метода printTen()
//        printTen();
        // проверка метода exit()
//        exit();
        // проверка метода countDigital()
        System.out.println(countDigital());;

    }

    /**
     * Запрос положительного числа
     */
    public static void positiveNumber(){
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Введите число: ");
            num = scanner.nextInt();

        }while (num >= 0);
        System.out.println("Вы ввели отрицательное число: " + num + " Прощайте!");
    }

    /**
     * метод Проверка пароля
     */
    public static void passwordCheck(){
        Scanner scanner = new Scanner(System.in);
        String password = "hgldjufh,djfhzkidnfc";
        String enterPassword;
        do {
            System.out.print("Введите пароль: ");
            enterPassword = scanner.nextLine();
        }while (!enterPassword.equals(password));
        System.out.println("Пароль верный. Проходите!");
    }

    /**
     * метод Вывода  чисела от 1 до 10
     */
    public static void printTen(){
        int i = 1;
        do {
            System.out.println( i);
            i++;
        }while (i<= 10);

    }

    /**
     * метод Завершение программы по команде "exit"
     */
    public  static  void  exit(){
        Scanner scanner = new Scanner(System.in);
        String enterWord;
        do {
            System.out.println("Введите слово: ");
            enterWord = scanner.nextLine().toLowerCase().trim();
        }while (!enterWord.equals("exit"));
        System.out.println("Вы ввели exit и вышли из программы.");
    }

    /**
     * Подсчёт количества цифр в числе
     * @return
     */
    public static int countDigital(){
        Scanner scanner = new Scanner(System.in);
        int cuont = 0;
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        do {
            num/=10;
            cuont++;

        }while (num> 0);
        return cuont;
    }



}
