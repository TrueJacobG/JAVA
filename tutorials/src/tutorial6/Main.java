package tutorial6;

public class Main {
    public static void main(String[] args) {
        String mess = Second.fromSecond("Hi");
        System.out.println(mess);

        Animal dog = new Animal("Harry", 8, "dog");
        Animal cat = new Animal("Garry", 7, "cat");

        dog.getName();
        dog.sound();

        cat.getName();
        cat.sound();

        dog.setName("Barry");
        dog.getName();

        Human human = new Human("Fi", 11, "human", false);

        human.setName("iF");
        human.sound();
        human.getHair();

    }

}
