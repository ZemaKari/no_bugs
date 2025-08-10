package practice_4v.solver;

import java.util.Scanner;

public class WhileSolver {
    public static void main(String[] args) {
        // проверка метода factorial()
//        System.out.println(factorial());
        // проверка метода evenNum()
//        evenNum();
        // проверка метода countDoun()
        countDoun();

    }

    /**
     * метод выводит факториал заданного числа
     * @return
     */
    public static  int factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        int  result = 1;
        int i = 1;
        while (i<= num){
            result *= i;
            i +=1;
        }return result;
    }

    /**
     * метод вывода все четных чисел до задонного
     */
    public static void evenNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        int i = 1;
        while (i <= num){
            if (i % 2 == 0){
                System.out.println("число " + i + " четное");
            }i +=1;
        }
    }

    /**
     * метод обратного отсчёта  от введённого числа до 1
     */
    public static void countDoun(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        int i = 1;
        while (num >= i){
            System.out.print(num + " ");
            num--;
        }
    }


}
