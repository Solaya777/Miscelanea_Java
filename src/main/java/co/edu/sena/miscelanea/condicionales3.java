package co.edu.sena.miscelanea;

import java.util.Scanner;

public class condicionales3 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        double num = src.nextDouble();
        System.out.println("Ingrese un número: ");
        double num2 = src.nextDouble();
        System.out.println("Ingrese un número: ");
        double num3 = src.nextDouble();

        if (num > num2 && (num > num3)) {
            System.out.println(num + " Es mayor que " + num2 + " y " + num3 + " es menor que todos ");
        } else if (num2 > num && (num2 > num3)) {
            System.out.println(num2 + " Es mayor que " + num + " y " + num3 + " es menor que todos ");
        } else if (num3 > num && (num3 > num2)) {
            System.out.println(num3 + " Es mayor que " + num2 + " y " + num + " es menor que todos ");
        }
    }
}
