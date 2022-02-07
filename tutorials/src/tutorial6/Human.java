package tutorial6;

public class Human extends Animal {

    private boolean hair;

    public Human(String name, int age, String type, boolean hair) {
        super(name, age, type);
        this.hair = hair;
    }

    public void sound() {
        System.out.println("I am human and my name is " + getName());
    }

    public void getHair() {
        if (hair) {
            System.out.println("I have hair!");
        } else {
            System.out.println("O_O");
        }
    }
}
