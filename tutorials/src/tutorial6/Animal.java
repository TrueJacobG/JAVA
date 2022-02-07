package tutorial6;

public class Animal {
    private String name;
    private int age;
    private String type;

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sound() {
        if (type.equals("dog")) {
            System.out.println("Bark!");
        } else {
            System.out.println("Miau!");
        }
    }
}
