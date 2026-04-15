package practice_9v.stream_api_apregation_operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstB {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("дорога", "колбаса", "молоко", "пыль", "мед", "цветы","дорога",
                "колбаса", "молоко", "пыль", "мед", "цветок","бабушка");
        Optional<String> findFirstB = list.stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("Б"))
                .findFirst()
                .map(String::toLowerCase);
        System.out.println(findFirstB);
    }
}
