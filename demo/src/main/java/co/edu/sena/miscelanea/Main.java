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
                    mostrarSubMenu2("Condicionales", scanner);
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
            System.out.println("9. Salir del submenú");
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
                    double numero = scanner.nextDouble();

                    Ejercicios.Ejercicio3_op(numero);

                    break;

                case 4:

                    System.out.println("Ingrese la cantidad de Euros: ");
                    double euros = scanner.nextDouble();

                    Ejercicios.Ejercicio4_op(euros);
                    break;
                case 5:
                    System.out.println("Ingrese el lado de un cuadrado: ");

                    double lado = scanner.nextDouble();

                    Ejercicios.Ejercicio5_op(lado);

                    break;

                case 6:

                    System.out.print("Ingrese el radio del cilindro: ");
                    double radio = scanner.nextDouble();

                    System.out.print("Ingrese la altura del cilindro: ");
                    double altura2 = scanner.nextDouble();

                    Ejercicios.Ejercicio6_op(radio, altura2);

                    break;

                case 7:

                    System.out.print("Ingrese el radio de la circunferencia: ");
                    double radio2 = scanner.nextDouble();

                    Ejercicios.Ejercicio7_op(radio2);

                    break;

                case 8:

                    System.out.println("Ingrese tres números para saber su promedio: ");
                    double numero1 = scanner.nextDouble();
                    double numero2 = scanner.nextDouble();
                    double numero3 = scanner.nextDouble();

                    Ejercicios.Ejercicio8_op(numero1, numero2, numero3);

                    break;

                case 9:
                    salirSubmenu = true;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }

    public static void mostrarSubMenu2(String opcion, Scanner scanner) {
        boolean salirSubmenu = false;

        while (!salirSubmenu) {
            System.out.println("\n--- Submenú de " + opcion + " ---");
            System.out.println("1. Saber si el número ingresado es positivo o negativo");
            System.out.println("2. Saber el mayor y el menor de dos números");
            System.out.println("3. Ingresar tres números y calcular el mayor y el menor de los tres");
            System.out.println("4. Dados dos números A y B, sumarlos si A es menor que B o sino restarlos");
            System.out.println(
                    "5.  Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero\r\n"
                            + //
                            "no está definida");
            System.out.println(
                    "6.  Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario\r\n"
                            + //
                            "multiplicarlos.\r");
            System.out.println("7. Año bisiesto");
            System.out.println("8. Salir del submenú");
            System.out.print("Ingrese su opción: ");
            int subopcion = scanner.nextInt();

            switch (subopcion) {
                case 1:
                    System.out.print("Ingrese un número: ");
                    double num4 = scanner.nextDouble();

                    Ejercicios.Ejercicio9_op(num4);

                    break;
                case 2:
                    System.out.println("Ingrese un número: ");
                    double num5 = scanner.nextDouble();
                    System.out.println("Ingrese un número: ");
                    double num6 = scanner.nextDouble();

                    Ejercicios.Ejercicio10_op(num5, num6);

                    break;
                case 3:

                    System.out.println("Ingrese un número: ");
                    double num7 = scanner.nextDouble();
                    System.out.println("Ingrese un número: ");
                    double num8 = scanner.nextDouble();
                    System.out.println("Ingrese un número: ");
                    double num9 = scanner.nextDouble();

                    Ejercicios.Ejercicio11_op(num7, num8, num9);

                    break;

                case 4:
                    System.out.println("Ingrese un número: ");
                    int num10 = scanner.nextInt();
                    System.out.println("Ingrese un número: ");
                    int num11 = scanner.nextInt();

                    Ejercicios.Ejercicio12_op(num10,num11);
                    break;
                case 5:
                    System.out.println("Ingrese dos números para dividir: ");
                    double num12 = scanner.nextDouble();
                    System.out.println("Ingrese el siguiente número");
                    double num13 = scanner.nextDouble();

                    Ejercicios.Ejercicio13_op(num12,num13);

                    break;

                case 6:

                    System.out.print("Ingrese el primer número: ");
                    double num14 = scanner.nextDouble();

                    System.out.print("Ingrese el segundo número: ");
                    double num15 = scanner.nextDouble();

                    Ejercicios.Ejercicio14_op(num14,num15);

                    break;

                case 7:

                    System.out.print("Ingrese el año: ");
                    double año = scanner.nextDouble();

                    Ejercicios.Ejercicio15_op(año);

                    break;
                case 8:
                    salirSubmenu = true;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}