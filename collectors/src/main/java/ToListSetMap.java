import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListSetMap {
    public static void run(){
        List<String> list = new ArrayList<>();

        list.add("Sweden");
        list.add("Sweden");
        list.add("Norway");
        list.add("Denmark");

        list = list
                .stream()
                .filter(country -> country.startsWith("S"))
                .collect(Collectors.toUnmodifiableList());

        list.stream().forEach(country -> System.out.println(country));

        Set<String> set = list
                .stream()
                .filter(country -> country.startsWith("S"))
                .collect(Collectors.toSet());
        set.stream().forEach(country -> System.out.println("Set:" + country));


        Country country1 = new Country("Germany", "Berlin");
        Country country2 = new Country("France", "Paris");
        Country country3 = new Country("France", "notParis");

        List<Country> countries = new ArrayList<>();
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        // third thing in toMap is activated when two keys are the same
        Map<String, String> map = countries
                .stream()
                .collect(Collectors.toMap(Country::getName, Country::getCapital, (oldOne, newOne) -> oldOne+" "+newOne));
        System.out.println(map);


    }
}
