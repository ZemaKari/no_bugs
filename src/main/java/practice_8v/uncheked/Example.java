package practice_8v.uncheked;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        try {
            int result = num1/num2;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("На 0 делить нельзя. Ошибка" + e.getMessage());
        }
    }
}
