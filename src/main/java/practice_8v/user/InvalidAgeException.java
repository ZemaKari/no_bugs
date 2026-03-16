package practice_8v.user;


// проверяемое исключение -> Exception
public class InvalidAgeException extends Exception{
    public InvalidAgeException(String massage){
        super(massage);
    }
}
