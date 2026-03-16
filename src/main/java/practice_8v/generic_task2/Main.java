package practice_8v.generic_task2;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Anna", "Sem", "Kate"};

        Integer[] numberList  = {1,8,123};

        AnyClass<String> listOfString = new AnyClass(names);
        AnyClass<Integer> listOfInt = new AnyClass<>(numberList);

        listOfInt.printElement(numberList);
        listOfString.printElement(names);
    }
}
