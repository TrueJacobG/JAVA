package tutorial1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        types();
        division();
        takingInput();
    }

    public static void types() {
        int x = 0;
        double y = 1.5;
        boolean z = true;
        char c = 'a';
        String s = "hello";

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(c);
        System.out.println(s);
    }

    public static void division() {
        int x, y;
        x = 3;
        y = 2;
        // Rounded down, int
        int result;
        result = x / y;

        // Rounded down, double
        double result1;
        result1 = x / y;

        // one of the numbers have to be double
        double result2 = x / (double) y;

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }

    public static void takingInput() {
        Scanner sc = new Scanner(System.in);
        String firstWord = sc.next();
        System.out.println(firstWord);

        int firstInt = sc.nextInt();
        System.out.println(firstInt);

        // Better practice is to take String and convert it
        String secondInt = sc.next();
        int theInt = Integer.parseInt(secondInt);
        System.out.println(theInt);
    }
}
