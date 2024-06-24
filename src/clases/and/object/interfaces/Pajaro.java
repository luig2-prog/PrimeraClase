package clases.and.object.interfaces;

public class Pajaro extends Animal implements Volador {

    @Override
    public void volar() {
        System.out.println("Pajaro volando!");
    }

}
