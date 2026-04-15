package practice_9v.stream_api_apregation_operation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxElement {
    public static void main(String[] args) {
        List<Integer> numList = Collections.singletonList(Arrays.asList(12, 99, 45, 3, 12, 4, 555).stream() //сразу в стрим
                .max(Comparator.naturalOrder())
                .get());
        System.out.println(numList);

    }
}
