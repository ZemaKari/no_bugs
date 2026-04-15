package practice_9v.stream_api_base_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesFree {
    //Напишите программу, которая принимает список элементов и удаляет из него все дубликаты, используя Stream API.
    public static void main(String[] args) {


        List<String> listOfString = Arrays.asList("дерево", "мебель", "молоко","дерево", "мебель", "молоко", "диван", "хлопушка", "велосипед", "мёд");
        List<String> listDuplicatesLess = listOfString.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listDuplicatesLess);

    }



}
