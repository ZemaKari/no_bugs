package practice_4v.solver;

import java.util.Scanner;

public class Switch {
   public static void main(String[] args) {
//        // проверка метода  получения дня недели по числу
//        System.out.println(dayOfWeek());
//      System.out.println(ticket("апоппдра"));
//        System.out.println(grade(Grade.NO_GOOD));
//       System.out.println(grade1(70));
            // проверка метода обработки текстовых комманд
//       System.out.println(command(Command.RESTART));
       // проверка метода калькулятор
       System.out.println(calc(7,0,"("));



  }

    /**
     * метод для вывода дня недели по числу
     *
     * @return
     */
    public static String dayOfWeek() {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int dayWeek = scanner.nextInt();
        String day = "";
        switch (dayWeek) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "There is not such day";

        }
        return day;
    }

    /**
     * метод вывода скидки по дню недели
     *
     * @param day
     * @return
     */
    public static String ticket(String day) {
        String discount1 = "300 рублей";
        String discount2 = "450 рублей";
        String incorrect = " неверное значение дня ";
        if (day.toLowerCase().equals("понедельник")
                || day.toLowerCase().equals("вторник")
                || day.toLowerCase().equals("среда")
                || day.toLowerCase().equals("четверг")
                || day.toLowerCase().equals("пятница")) {
            return discount1 = "300";

        } else if (!day.toLowerCase().equals("понедельник")
                && !day.toLowerCase().equals("вторник")
                && !day.toLowerCase().equals("среда")
                && !day.toLowerCase().equals("четверг")
                && !day.toLowerCase().equals("пятница")
                && !day.toLowerCase().equals("суббота")
                && !day.toLowerCase().equals("воскресенье")) { return incorrect;

        }
        return discount2;
    }

    /**
     * метод возвращает скидку по дню недели
     * @param day
     * @return
     */
    public static String ticket1(String day){
         return switch (day.toLowerCase()){
            case "понедельник", "вторник","среда","четверг","пятница" -> "300 руб";
            case "суббота","воскресенье" -> "450 руб";
            default -> "Ошибка: введен некорректный день недели ";

        };
    }

    /**
     * метод возвращает описание оценки
     * @param grade
     * @return
     */
    public static String grade(Grade grade){
        String discription = "";
        switch (grade){
            case EXELANT -> discription = "отличная работа";
            case GOOD -> discription = "хорошая работа";
            case NO_GOOD -> discription = " нужно больше стараться";
            case BAD -> discription = " плохая работа";
        }return discription;
    }

    /**
     * метод переводит числовые оценки в буквенные
     * @param grade
     * @return
     */
    public static String grade1(int grade){
        if(grade <0 || grade> 100){
            return "Ошибка надо ввести число от 0 до 100";
        }
        String letter = switch (grade/10){
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 ->"C";
            case 6 -> "D";
            default ->"F";
        };
        return letter;
    }

    /**
     * метод обрабатывает текстовые команды
     * @param command
     * @return
     */
    public static String command(Command command){
        String discription = "";
        switch (command){
            case START -> discription="Система запущена";
            case STOP -> discription="Система остановлена";
            case RESTART -> discription= " Система перезапущена";
            case STATUS -> discription= "Система работет : ";
        }return discription;
    }

    /**
     * метод  простого калькулятора
      * @param num1
     * @param num2
     * @param operation
     * @return
     */
    public static Double calc(int num1, int num2, String operation){
        double answer;
        switch (operation.trim()){
            case "+" -> answer  = num1 + num2;
            case "-" -> answer = num1 - num2;
            case "*"-> answer = num1 * num2;
            case "/" -> {
                if( num2 ==0) throw new ArithmeticException("На ноль делить нельзя");
                answer = (double) num1/num2;
            }
            default -> throw new ArithmeticException("неизвестная операция " + operation);
        }return answer;
    }
}
