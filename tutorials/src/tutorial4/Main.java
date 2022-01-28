package tutorial4;

import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        CLS();
        setsAndLists();
        CLS();
        maps();
    }

    static void CLS() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void setsAndLists() {
        // Only unique values
        // random order
        Set<Integer> s = new HashSet<Integer>();

        // sorted values (in tree type)
        // Set<Integer> s = new TreeSet<Integer>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(5);
        s.add((int) Math.sqrt(25));
        System.out.println(s);

        if (s.contains(2)) {
            System.out.println("yes");
        }

        // if it isn't in set it doesn't raise error
        s.remove(10);

        s.remove(2);

        if (s.contains(2)) {
            System.out.println("yes");
        }

        s.clear();
        if (s.isEmpty()) {
            System.out.println("it is empty");
        }

        s.add(1);
        System.out.println(s.size());

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(4);

        // what is on index 0
        System.out.println(list.get(0));

        list.set(0, 5);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.subList(1, 3));

    }

    static void maps() {
        // dictionary, random order
        Map<String, Integer> m = new HashMap<String, Integer>();

        // sorted order
        // Map<String, Integer> m = new TreeMap<String, Integer>();

        // order in which we add things
        // Map<String, Integer> m = new LinkedHashMap<String, Integer>();

        m.put("first", 1);
        m.put("second", 2);
        System.out.println(m);
        // if it doesn't exist then gives null
        System.out.println(m.get("third"));
        System.out.println(m.get("second"));

        System.out.println(m.containsValue(2));
        System.out.println(m.containsKey("first"));
        System.out.println(m.values());

    }
}
