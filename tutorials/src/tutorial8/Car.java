package tutorial8;

public class Car implements Vehicle {

    private int wheel = 4;

    private int speed = 0;

    public void speedUp(int s) {
        this.speed += s;
    }

    public void speedDown(int s) {
        this.speed -= s;
    }

    public void changeWheel(int n) {
        if (n == this.wheel) {
            System.out.println("Cool");
        } else {
            System.out.println("Wrong number of wheels!");
        }
    }

    public void display() {
        System.out.println("Speed: " + this.speed);
        theDefault();
    }

}
