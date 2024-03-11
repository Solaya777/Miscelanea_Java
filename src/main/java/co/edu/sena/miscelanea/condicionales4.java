package co.edu.sena.miscelanea;

import java.util.Scanner;

public class condicionales4 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = src.nextInt();
        System.out.println("Ingrese un número: ");
        int num2 = src.nextInt();

        if (num<num2) {
            int res = src.nextInt();
            res = num + num2;
        }else {
            int res = src.nextInt();
            res = num-num2;
        }
    }

}
