package practice_8v.mail;

import java.util.Objects;

public class Mail {
    private String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mail mail1 = (Mail) o;
        return Objects.equals(mail, mail1.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mail);
    }
}
