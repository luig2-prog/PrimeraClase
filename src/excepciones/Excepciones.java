package excepciones;

import javax.swing.*;
import java.util.Scanner;

public class Excepciones {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Ingresa su nombre: ");
//        String name = scanner.next(); // Obtener lo que ingresó el usuario y transformarlo a un String
//
//
//        System.out.println("Ingresa su edad: ");
//        int edad = scanner.nextInt(); // Obtener lo que ingresó el usuario y transformarlo a un entero
//
//        System.out.println("Tu nombre es: " + name);
//        System.out.println("Tienes : " + edad + " años");
////        System.out.println("Ingresa su salario: ");
////        float salario = scanner.nextFloat(); // Obtener lo que ingresó el usuario y transformarlo a un flotante


        String name = JOptionPane.showInputDialog(null, "Ingresa tu nombre");

        int opcion = 1;

        do {

//
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la opcion \n 1. Agregar nombre \n 2. Agregar edad \n 0. Salir"));
                if (opcion == 1) {
                    System.out.println("Elegiste la opcion 1");
                } else if (opcion == 2) {
                    System.out.println("Elegiste la opcion 2");
                } else if (opcion == 0) {
                    System.out.println("Chaooo!");
                }
            } catch (Exception e) {
                System.out.println("No haz seleccionado una opción valida");
            }




        } while (opcion != 0);


        System.out.println("Tu nombre es: " + name);



    }

}
