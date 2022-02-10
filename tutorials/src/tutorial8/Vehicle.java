package tutorial8;

public interface Vehicle {

    // you can't create instances of interface (objects)

    // interfaces can be inherited by classes

    final int wheels = 4;

    void speedUp(int a);

    void speedDown(int a);

    void changeWheel(int a);

    // /\
    // these methods have to be in class

    // we can use default methods in classes that implements the interface
    default void theDefault() {
        System.out.println("Default method");
    }

    static void theStatic(int n) {
        int number = n + 10;
        System.out.println("Static method");
        System.out.println(number);
    }

}
