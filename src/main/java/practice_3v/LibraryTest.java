package practice_3v;



public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();
//        System.out.println(library.autor);
        System.out.println(library.category);
        System.out.println(library.year);
        library.setAuthor("Петров");
        library.setCategory("Фантастика");
        library.setYear(1960);
        System.out.println(library.getAuthor());
        System.out.println(library.getCategory());
        System.out.println(library.getYear());

    }
}
