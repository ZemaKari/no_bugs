package practice_4v.solver;

import java.util.Scanner;

public class ForSolver {
    public static void main(String[] args) {
        // проверка метода Вывода чисела от 1 до 100, делящихся на 3
//        numDivisible3();
        // проверка метода summAllNum()
//        System.out.println(summAllNum());
        // проверка метода multiplyTable()
//        multiplyTable();
        // проверка метода simpleNum()
//        System.out.println(simpleNum());;
        // проверка метода printNum()
        printNum();


    }

    /**
     * метод Вывод чисел от 1 до 100, делящихся на 3
     */
    public static   void  numDivisible3(){
        int num = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                num = i;
                System.out.print(num + " ");
            }
        }
    }

    /**
     * метод вычасляет сумму чисел от 1 до n
     * @return
     */
    public static int summAllNum(){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num  = scanner.nextInt();
        int summ = 0;
        for (int i = 1; i <= num; i++){
            summ += i;

        }return summ;
    }

    /**
     * метод Таблица умножения для числа введенного пользователем
     */
    public static void multiplyTable(){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num  = scanner.nextInt();
        for (int i = 1; i <=10; i++){
            System.out.println(i + " * " + num + " = "+ i * num);
        }
    }

    /**
     * метод проверяет является ли число введенное пользователем простым
     * @return
     */
    public static  boolean  simpleNum(){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num  = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= num-1; i++){
            if( num % i == 0){
                isPrime = false;
                break;
            }
        }return isPrime;
    }

    public static void  printNum(){
        for (int i = 1; i <=10 ; i++){
            System.out.print(" " +  i);
        }
    }
}
