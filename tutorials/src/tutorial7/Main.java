package tutorial7;

public class Main {

    // static -> you don't have to create object of a class to use it
    // it's like @classmethod in python

    // nothing == public
    int a = 0;

    static int b = 1;

    public static void main(String[] args) {
        Animal dog = new Animal("Henry", 8);
        dog.info();

        Main o = new Main();
        System.out.println(o.a);
        // or
        System.out.println(b);
        // because we use static b

        Animal.howMany();

        Animal cat = new Animal("Henry", 10);
        if (cat.equals(dog)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        // different bitween dog age and cat age
        System.out.println(dog.compareTo(cat));

        System.out.println(dog);
    }
}
