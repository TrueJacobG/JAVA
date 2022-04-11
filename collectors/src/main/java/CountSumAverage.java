import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CountSumAverage {
    public static void run(){
        Country country1 = new Country("Germany", "Berlin", 80);
        Country country2 = new Country("France", "Paris", 60);
        Country country3 = new Country("France", "notParis", 60);

        List<Country> list = new ArrayList<>();
        list.add(country1);
        list.add(country2);
        list.add(country3);


        Long count = list
                .stream()
                .collect(Collectors.counting());

        System.out.println(count);

        System.out.println(list.stream().collect(Collectors.summingInt(Country::getSize)));
        System.out.println(list.stream().collect(Collectors.averagingInt(Country::getSize)));

        Optional<Integer> max = list
                .stream()
                .map(Country::getSize)
                .collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println(max.get());

    }
}
