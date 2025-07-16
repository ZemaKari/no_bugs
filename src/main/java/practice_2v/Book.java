package practice_2v;

public class Book {
    String title;
    String author;


    Book(String someTitle, String someAuthor){
        this.author = someAuthor;
        this.title = someTitle;
    }

    String getTitle(){
        return this.title;
    }
    String getAuthor(){
        return this.author;
    }

    void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    void setTitle(String newTitle){
        this.title = newTitle;

    }
    void printInfo(){
        System.out.println("Название кники: "+ this.title + " Автор книги : " + this.author);
    }
}
