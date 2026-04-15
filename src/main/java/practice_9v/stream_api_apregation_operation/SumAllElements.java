package practice_9v.stream_api_apregation_operation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumAllElements {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(12, 99, 45, 3, 12, 4, 555);
        int sumList = numList.stream()
                .mapToInt(n->n)
                .sum();
        System.out.println(sumList);
    }
}


