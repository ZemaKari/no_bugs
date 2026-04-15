package practice_9v.stream_api_group_reduse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageNumber {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(5, 9, 7, 8, 4, 6, 1, 1, 2, 399, 854);
        double avenNum = numList.stream()
                .collect(Collectors.averagingInt(n ->  n));
        System.out.println(avenNum);
    }

}
