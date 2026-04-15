package practice_9v.stream_api_base_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumber {
    //Напишите программу, которая принимает список чисел и преобразует его в новый список,
    // где каждое число заменено на его квадрат, используя Stream API.

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(4,6,8,1,2,45);
        List<Integer> squareList = numList.stream()
                .map(n->n*n)
                .collect(Collectors.toList());
        System.out.println(squareList);
    }
}
