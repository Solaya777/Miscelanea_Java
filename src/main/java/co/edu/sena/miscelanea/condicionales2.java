package co.edu.sena.miscelanea;

import java.util.Scanner;

public class condicionales2 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        double num = src.nextDouble();
        System.out.println("Ingrese un número: ");
        double num2 = src.nextDouble();

        if (num > num2) {
            System.out.println(num + " Es mayor que " + num2);
        } else if (num < num2) {
            System.out.println(num2 + " Es mayor que " + num);
        } else {
            System.out.println("Ambos números son iguales");
        }
    }
}
