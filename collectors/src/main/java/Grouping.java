import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void run(){
        List<String> list = new ArrayList<>();
        list.add("Germany");
        list.add("France");
        list.add("Sweden");

        //group by length
        Map<Integer, List<String>> map = list
                .stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(map);

    }
}
