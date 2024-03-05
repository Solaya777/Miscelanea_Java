package co.edu.sena.miscelanea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ejercicios ejercicios = new Ejercicios();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("1. Operadores");
            System.out.println("2. Condicionales");
            System.out.println("3. Ciclos");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarSubMenu("Operadores", scanner);
                    break;
                case 2:
                    mostrarSubMenu("Condicionales", scanner);
                    break;
                case 3:
                    mostrarSubMenu("Ciclos", scanner);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }

        scanner.close();
        System.out.println("¡Hasta luego!");
    }

    public static void mostrarSubMenu(String opcion, Scanner scanner) {
        boolean salirSubmenu = false;

        while (!salirSubmenu) {
            System.out.println("\n--- Submenú de " + opcion + " ---");
            System.out.println("1. Calcular el área de un triángulo");
            System.out.println("2. Sumar dos números");
            System.out.println("3. Elevar al cuadraro un número");
            System.out.println("4. Euros a dólares");
            System.out.println("5. Área y perímetro de cuadrado");
            System.out.println("6. Área y volúmen del cilindro");
            System.out.println("7. Radio y longitud de una circunferencia");
            System.out.println("8. Promedio de tres números");
            System.out.println("9. Volver al menú principal");
            System.out.println("10. Salir del submenú");
            System.out.print("Ingrese su opción: ");
            int subopcion = scanner.nextInt();

            switch (subopcion) {
                case 1:
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();

                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();

                    Ejercicios.Ejercicio1_op(base, altura);

                    break;
                case 2:
                    System.out.println("Ingrese el primer número: ");
                    double num1 = scanner.nextDouble();

                    System.out.println("Ingrese el segundo número: ");
                    double num2 = scanner.nextDouble();

                    Ejercicios.Ejercicio2_op(num1, num2);

                    break;
                case 3:
                System.out.println("Ingrese un número: ");
                
                    break;

                case 4:

                    break;
                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9:

                    break;

                case 10:
                    salirSubmenu = true;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}