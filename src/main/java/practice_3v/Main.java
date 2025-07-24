package practice_3v;

public class Main {
    public static void main(String[] args) {
        Company ivan = new Company(1, "Ivan");
        Company vanya = new Company(2, "Vanya");
        System.out.println(ivan.getCompanyName());
        System.out.println(vanya.getCompanyName());
        Company.setCompanyName("Samsung");
        System.out.println(ivan.getCompanyName());
        System.out.println(vanya.getCompanyName());
        System.out.println("Номер пропуска: " + ivan.employeeID + ". Имя: " + ivan.employeeName);
        System.out.println("****Class MathConstants***");
        System.out.println(MathConstants.calculateCircleArea(5.2));
        System.out.println(MathConstants.calculateCircumference(5.2));
        System.out.println(MathConstants.calculateCircleArea(3.5));
        System.out.println(MathConstants.calculateCircumference(3.5));
        System.out.println("****Class University***");
        University st1 = new University("Ivan", 100);
        University st2 = new University("Oleg", 200);
        University st3 = new University("Anna", 300);
        st1.printStudentInfo();
        University.changeUniversityName("Garvard");
        st1.printStudentInfo();
        st2.printStudentInfo();
        System.out.println("****Class GameSettings***");
        GameSettings game1 = new GameSettings(19, "Волейбол");
        GameSettings game2 = new GameSettings(19, "Вышибалы");
        System.out.println(GameSettings.maxPlayers);
        GameSettings.maxPlayers = 20;
        System.out.println(GameSettings.maxPlayers);
        game2.add();
        System.out.println(game2.currentPlayers);
        game2.add();
        System.out.println(game2.currentPlayers);
        game1.printGameStatus();
        game2.printGameStatus();
        System.out.println("****Class Person***");
        Person person1 = new Person("Ivan", "Ivanov",  "123-45-6789" );
        Person person2 = new Person("Oleg", "Olegov", "123-45-6799" );
        Person person3 = new Person("Anna", "Sedakova", "123-45-6730" );
//        person2.setFirstName("Vasay");  проверили доступность метода. Он не доступен т.к. privet
        person2.setLastName("Ivanov");
        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();











    }
}
