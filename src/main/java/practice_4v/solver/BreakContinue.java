package practice_4v.solver;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        // проверка метода firstNegative()
//        System.out.println(firstNegative());;
        // проверка метода scip3()
//        scip3();
        // проверка метода pozitivNum()
//        pozitivNum();
        // проверка метода  сommadStop()
        сommadStop();


    }

    /**
     * сумма чисел до первого отрицательного
     * @return
     */
    public static int firstNegative() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Введи число");
            int num = scanner.nextInt();
            sum += num;
            if( num < 0 ){

                break;
            }
        }return sum;
    }

    /**
     * метод пропускает числа делящиеся на 3
     */
    public static void scip3(){
        for ( int i = 1; i <= 20; i++){
            if (i % 3 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }

    /**
     * вывод только положительного числа
     */
    public static void pozitivNum(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count<5){
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            count++;
            if(num<0){
                continue;
            }
            System.out.println("Положительное число "+ num);

        }

    }

    /**
     * метод ввода строк до команды "stop"
     */
    public static void сommadStop(){
        while (true){
            System.out.println("Введите слово: ");
            Scanner scanner = new Scanner(System.in);
            String world  = scanner.nextLine().toLowerCase().trim();
            if (world.equals("exit")){
                break;
            }
        }
        System.out.println("Программа завершена ");
    }
}
