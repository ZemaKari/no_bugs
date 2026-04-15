package practice_9v.stream_api_apregation_operation;

import java.util.Arrays;
import java.util.List;

public class IsTrue {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(12, 99, 45, 3, 12, 4, 555);
        boolean isTrue = numList.stream()
                .anyMatch(n->n%2==0);
        System.out.println(isTrue);
    }
}
