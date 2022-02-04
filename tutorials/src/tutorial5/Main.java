package tutorial5;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        mapExample();

        sort();
    }

    static void mapExample() {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        String text = "hello its me the pp";

        for (char c : text.toCharArray()) {
            if (map.containsKey(c)) {
                int old = map.get(c);

                map.put(c, old + 1);
            } else {
                map.put(c, 1);
            }
        }

        map.remove(' ');

        System.out.println(map);

    }

    static void sort() {
        int[] arr = { 1, 7, 4, 3, 7, 3, -23, 0 };

        Arrays.sort(arr);

        // you cant print array like that
        // System.out.println(arr);

        for (int x : arr) {
            System.out.print(x);
            System.out.print(" ");
        }

        System.out.println("");

        int[] arr1 = { 1, 7, 4, 3, 7, 3, -23, 0 };

        // from 2 index to 5 (without 5) index will be sorted
        Arrays.sort(arr1, 2, 5);

        for (int x : arr1) {
            System.out.print(x);
            System.out.print(" ");
        }

    }
}
