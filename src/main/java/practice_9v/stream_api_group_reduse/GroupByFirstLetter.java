package practice_9v.stream_api_group_reduse;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstLetter {
    public static void main(String[] args) {
        List<String> listStr = Arrays.asList("дорога", "колбаса", "молоко", "пыль", "мед", "цветы");
        Map<Character, List<String>> groupByLetter = listStr.stream()
                .collect(Collectors.groupingBy(s->s.charAt(0)));
        System.out.println(groupByLetter);;

    }
}
