package practice_9v.function_interface;

import java.util.function.Function;

public class MainForLambdaWithFunction {
    public static void main(String[] args) {


    //Создайте лямбду, которая принимает строку и возвращает её длину.
    Function<String, Integer> getLength = n-> n.length();


    String string = "мама мыла раму";
    int length = getLength.apply(string);
        System.out.println("Длинна строки: " +length);


}

}

