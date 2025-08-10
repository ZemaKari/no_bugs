package practice_4v.solver;

import java.util.Scanner;

public class If_elsesolver {
    public static void main(String[] args) {
        // проверка метода зака числа
//        System.out.println(compareNum());
//        проверка метода максимального числа
//        System.out.println("Максимальное число "+ maxDigital());
// проверка метода вывода значения оценки
//        System.out.println(grade());
// проверка метода четности числа
//        System.out.println(parity());;
        // проверка метода скидки по возрасту
//        System.out.println(discount());
        // проверка метода вывода оценки по баллам
        System.out.println(grade2());
    }

    /**
     * метод проверяет знак числа
     * @return
     */
    public static String compareNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        String answer = "Число отрицательное";
        if(num > 0){
            answer = "Число положительное";
        } else if (num== 0) {
            answer = "Число равно 0";
        }
        return answer;

    }

    /**
     * метод возвращающий максимально число из двух
     * @return
     */
    public static int maxDigital(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите число: ");
        int num2 = scanner.nextInt();
        int max = num2;
        if(num1> num2){
            max = num1;
        }return max;
    }

    /**
     * метод выводит значение оценки  по числу
     * @return
     */
    public static String grade(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        String answer = "";
        if(num == 5){
            answer = "Олично!";
        } else if (num == 4) {
            answer = "Хорошо.";
        } else if (num == 3) {
            answer = "Удовлетворительно";
        } else if (num ==1 || num == 2) {
           answer = "Неудовлетворительно";
        }else {
            answer = "Такой оценки нет.";
        }

        return answer;
    }

    /**
     * метод проверки четности числа
     * @return
     */
    public static String parity(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        String answer = "Нечетное";
        if(num%2 == 0){
           answer = "Четное";
        }
        return answer;

    }

    /**
     * метод проверяющий скидку по возрасту
     * @return
     */
    public static String discount(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Ваш возраст: ");
        int age = scanner.nextInt();
        String discount = "Скидка не предоставляется";
        if(age<18){
            discount = "Скидка 25%";
        } else if (age >= 65) {
            discount = "Скидка 30%";
        }
        return discount;
    }

    public static String grade2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        String answer = "Неудовлетворительно";
        if(num>= 90){
            answer = "Отлично";
        } else if (num >=75 && num <= 89) {
            answer = "Хорошо";
        } else if (num >= 60 && num <= 74) {
            answer = "Удовлетворительно";
        }return answer;
    }


}
