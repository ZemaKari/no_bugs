package practice_5v.museum;

public class Main {
    public static void main(String[] args) {
        Manuscript manuscript = new Manuscript("Манускрипт Древнего Египта");
        Sculpture sculpture = new Sculpture("Апполон");
        Museum museum = new Museum();
        museum.showExgibite(manuscript);
        museum.showExgibite(sculpture);
    }
}
