package practice_7v.linked_hash_map;

public class Main {
    public static void main(String[] args) {
        Task2 map2 = new Task2();
        map2.addElement("Иван",133 );
        map2.addElement("Петя", 136);
        map2.addElement("Оля", 111);
        map2.addElement("Катя", 456);
        System.out.println(map2.getPhone("Катя"));;
    }
}
