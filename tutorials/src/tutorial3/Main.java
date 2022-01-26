package tutorial3;

public class Main {
    public static void main(String[] args) {
        loops();
    }

    public static void loops() {
        int[] arr = { 1, 7, 34, 8, 3, 8 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

        String[] names = { "h", "not l", "not l", "e", "o" };
        for (String name : names) {
            if (name.equals("o")) {
                break;
            } else if (name.equals("e")) {
                continue;
            }
            System.out.println(name);
        }

        int x = 10;
        while (x >= 1) {
            System.out.println(x);
            x--;
        }

    }

}
