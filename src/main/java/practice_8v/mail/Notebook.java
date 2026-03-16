package practice_8v.mail;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Notebook {
    private List<String> notebook;

    public Notebook() {
        this.notebook = new ArrayList<>();
    }

    public void addMail(String mail){
        String valid = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (!Pattern.matches(valid, mail)){
            throw new CheckMailException("Адрес электронной почты не валидный");
        }else notebook.add(mail);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "notebook=" + notebook +
                '}';
    }
}
