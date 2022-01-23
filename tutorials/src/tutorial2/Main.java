package tutorial2;

public class Main {
    public static void main(String[] args) {
        logic();
        arrays();
    }

    static void logic() {
        boolean is1 = false || true;
        boolean is2 = !false && true;
        System.out.println(is1);
        System.out.println(is2);

        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1.equals(s2));

        boolean x = true;
        boolean y = false;

        if (x == y) {
            System.out.println("if");
        } else if (x != y) {
            System.out.println("else if");
        } else {
            System.out.println("else");
        }

    }

    static void arrays() {
        // declared size
        int[] array = new int[5];
        for (int i = 0; i < 4; i++) {
            array[i] = i + 1;
        }

        // not declared value -> 0
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }

        String[] array2 = { "h", "e", "l", "l", "o" };

        for (int i = 0; i < 5; i++) {
            System.out.print(array2[i]);
        }
        System.out.println("\n");
    }
}
