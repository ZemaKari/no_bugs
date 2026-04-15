package practice_9v.stream_api_base_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterLength {
    //Напишите программу, которая принимает список строк
    // и удаляет из него все строки длиной 5 символов и менее, используя Stream API.

    public static void main(String[] args) {
        List<String> listOfSrting = Arrays.asList("дерево", "мебель","молоко","диван","хлопушка","велосипед","мёд");
        List<String> stringLessThan5CharactersLong = listOfSrting.stream()
                .filter(s->s.length()>5)
                .collect(Collectors.toList());
        System.out.println(stringLessThan5CharactersLong);
    }
}
