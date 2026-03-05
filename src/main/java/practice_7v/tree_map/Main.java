package practice_7v.tree_map;

public class Main {
    public static void main(String[] args) {
        Task2 treeMap2 = new Task2();
        treeMap2.addElement(1, "Оля");
        treeMap2.addElement(6, "Коля");
        treeMap2.addElement(9, "Петя");
        treeMap2.addElement(6, "Толя");
        treeMap2.addElement(6, "Воля");
        treeMap2.printMap();
        System.out.println(treeMap2.maxKey());
        System.out.println(treeMap2.minKey());;
    }
}
