package practice_7v.linked_list;

public class Main {
    public static void main(String[] args) {
        //задача 1
        Task1 linkedList1 = new Task1();
        linkedList1.printElement();
        //задача 2
        Task2 lintedList2 = new Task2();
        lintedList2.addTask("первая задача");
        lintedList2.addTask("вторая задача");
        lintedList2.addTask("третья задача");
        lintedList2.taskManager();
        //задача4
        Task4 linkedList4 = new Task4();
        System.out.println(linkedList4.sunSolver());
    }
}
