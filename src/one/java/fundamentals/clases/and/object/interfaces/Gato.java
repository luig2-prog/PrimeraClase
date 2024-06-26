package one.java.fundamentals.clases.and.object.interfaces;

public class Gato extends Animal {

    public Gato() {}
    public Gato(String name) {
        super(name);
    }

    @Override
    void hacerSonido() {
        System.out.println("Miau Miau!");
    }

}
