package practice_8v.generic_task1;

public class Main {
    public static void main(String[] args) {
        Box<String> boxString = new Box<>();
        boxString.setElement("Element");
        Box<Integer> boxInteger = new Box<>();
        boxInteger.setElement(5);
        System.out.println(boxString.getElement());
        System.out.println(boxInteger.getElement());

        Box<Book> boxBook = new Box<>();
        boxBook.setElement(new Book("Book"));
        System.out.println(boxBook.getElement());
    }
}
