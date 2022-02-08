package tutorial7;

import java.lang.Math;

public class Animal implements Comparable<Animal> {

    // protected -> available in package
    // public -> everywhere
    // private -> only in this class

    protected String name;
    protected int age;

    protected static int count = 0;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        Animal.count++;
    }

    public void info() {
        System.out.println("Name: " + this.name + " Age: " + this.age);
    }

    public static void howMany() {
        System.out.println("How many objects of Animal class you have: " + count);
    }

    public boolean equals(Animal other) {
        return this.name == other.name && this.age == other.age;
    }

    public int compareTo(Animal other) {
        return Math.abs(this.age - other.age);
    }

    public String toString() {
        return "When you try to display object -> " + this.name;
    }
}
