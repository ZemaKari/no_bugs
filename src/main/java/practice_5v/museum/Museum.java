package practice_5v.museum;

public class Museum {
    public  void showExgibite(Exhibit exhibit){
        System.out.println(exhibit.getName() + ": ");
        exhibit.discribe();
        exhibit.preserve();
    }
}
