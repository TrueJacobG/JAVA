import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    public static void run(){
        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("Johnny");
        names.add("Jonathan");

        String joined = names.stream().collect(Collectors.joining(" ", "Names: ", "!"));

        System.out.println(joined);

    }
}
