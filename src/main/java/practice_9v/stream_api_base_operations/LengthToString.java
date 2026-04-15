package practice_9v.stream_api_base_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthToString {
    //Напишите программу, которая принимает список строк и заменяет каждую строку на её длину, используя Stream API.
    public static void main(String[] args) {
        List<String> listString = Arrays.asList("дерево", "мебель","молоко","диван","хлопушка","велосипед","мёд");
        List<Integer> listLengthString = listString.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(listLengthString);
    }
}
