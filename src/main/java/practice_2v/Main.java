package practice_2v;




public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2025);
        car1.print();
        car1.setYear(2026);
        car1.print();
        System.out.println("***Класс Rectangle***");
        Rectangle rec = new Rectangle(100, 200);
        rec.setWidth(300);
        System.out.println("Площадь прямоугольника " + rec.calculateArea());
        System.out.println("***Класс Book***");
        Book book1 = new Book("Метель", "А. С. Пушкин");
        book1.printInfo();
        book1.setAuthor("Петров");
        book1.printInfo();
        System.out.println("***Класс BankAccount***");
        BankAccount owner1 = new BankAccount("Иванов");
        owner1.printBalance();
        owner1.deposit(200);
        owner1.printBalance();
        owner1.withdraw(50);
        owner1.printBalance();
        System.out.println("***Класс Point***");
        Point point1 = new Point(6);
        point1.print();
        point1.setX(5);
        point1.print();
        point1.y = 9;
        point1.print();
        System.out.println("***Класс StudentGroup***");
        StudentGroup studentgroup1 = new StudentGroup("Програмисты", 15);
        studentgroup1.printInfo();
        studentgroup1.setGroupName("Джависты");
        studentgroup1.setStudentCount(20);
        studentgroup1.printInfo();
        System.out.println("***Класс Circle***");
        Circle circle1 = new Circle(15);
        System.out.println(circle1.radius);
        circle1.setRadius(26);
        System.out.println(circle1.radius);
        System.out.println("Окружность = "+ circle1.calculateCircumference()+ "площадь = "+ circle1.calculateArea());
        System.out.println("***Класс Teacher***");
        Teacher teacher1 = new Teacher("Anna", "math");
        teacher1.printInfo();
        teacher1.setSubject("biology");
        teacher1.printInfo();
        System.out.println("***Класс Product***");
        Product prod1  = new Product(300);
        prod1.name = "Apple";
        prod1.printInfo();
        prod1.applyDiscount(30);
        prod1.printInfo();
        System.out.println("***Класс Laptop***");
        Laptop laptop1  = new Laptop("Asus", 500);
        laptop1.printInfo();
        laptop1.price = 1000;
        laptop1.printInfo();



    }


    }

