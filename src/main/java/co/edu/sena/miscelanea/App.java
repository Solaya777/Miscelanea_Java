package co.edu.sena.miscelanea;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Ingrese un número: ");
        Scanner src = new Scanner(System.in);
        double num = src.nextDouble();

        if (num == 0) {
            System.out.println("El número ingresado es neutro");
        } else if (num > 0) {
            System.out.println("El número ingresado es positivo");
        } else {
            System.out.println("El número ingresado es negativo");
        }
    }
}
