package practice_9v.stream_api_group_reduse;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.stream.Collectors;

public class GroupByEven {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(5,9,7,8,4,6,1,1,2,399,854);
        Map<Boolean, List<Integer>> groupByEven = numList.stream()
                .collect(Collectors.groupingBy(n->n%2 ==0));
        System.out.println(groupByEven);
    }
}
