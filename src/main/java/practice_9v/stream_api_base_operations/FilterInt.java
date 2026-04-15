package practice_9v.stream_api_base_operations;

import java.util.Arrays;
import java.util.List;

public class FilterInt {
    //Напишите программу, которая принимает список чисел и отбирает только те,
    // которые делятся на 5 без остатка, используя Stream API.
    public static void main(String[] args) {
        List<Integer> listNum = Arrays.asList(1,5,6,7,12,56,0,6,78,1,3,15,20);
        List<Integer> filterList = listNum.stream()
                .filter(n->n%5==0).toList();
        System.out.println(filterList);
    }

}
