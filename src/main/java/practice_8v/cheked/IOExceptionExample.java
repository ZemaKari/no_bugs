package practice_8v.cheked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//проверяемоу исключение -> расширяемое Exception
public class IOExceptionExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("exemple.txt"));
            String line = null;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Ошибка чтения файла " + e);
        }finally {
            try {
                if(reader != null){
                    reader.close();
                }
            }catch (IOException e){
                System.out.println("Ошибка закрытия файла" + e);
            }
        }
    }
}
