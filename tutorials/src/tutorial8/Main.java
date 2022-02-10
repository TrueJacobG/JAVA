package tutorial8;

public class Main {
    public static void main(String[] args) {
        Car test = new Car();
        test.speedUp(50);
        test.display();

        // use of static interface method
        Vehicle.theStatic(7);

        // Enums
        Level level = Level.FIRST;
        System.out.println(level);
        String en = level.toString();
        System.out.println(en);

        Level[] levels = Level.values();

        for (Level l : levels) {
            System.out.println(l);
        }

    }

}
