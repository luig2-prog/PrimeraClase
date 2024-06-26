package one.java.fundamentals.clases.and.object.interfaces;

public class Animal {

    String name;

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    void hacerSonido() {
        System.out.println("Sonido animal!");
    }

}
