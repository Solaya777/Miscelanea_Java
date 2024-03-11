package co.edu.sena.miscelanea;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Ejercicios {
    public static void main(String[] args) {

    }

    public static void Ejercicio1_op(double base, double altura) {
        Scanner scanner = new Scanner(System.in);
        double area = (base * altura) / 2;

        System.out.println("El área del triángulo es:" + area);

    }

    public static void Ejercicio2_op(double num1, double num2) {
        Scanner scanner = new Scanner(System.in);
        double suma = num1 + num2;

        System.out.println("La suma de los dos números es: " + suma);

    }

    public static void Ejercicio3_op(double numero) {
        Scanner scanner = new Scanner(System.in);
        double cuadrado = numero * numero;

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);

    }

    public static void Ejercicio4_op(double euro) {
        Scanner scanner = new Scanner(System.in);

        double tasaConversion = 1.08;
        double dolares = euro * tasaConversion;

        System.out.println("A día de hoy " + euro + " euros equivalen a " + dolares + " dólares");

    }

    public static void Ejercicio5_op(double lado) {
        Scanner scanner = new Scanner(System.in);

        double area2 = lado * lado;
        double perímetro = 4 * lado;

        System.out.println("El área del cuadrado es: " + area2);
        System.out.println("El perímetro del cuadrado es: " + perímetro);

    }

    public static void Ejercicio6_op(double radio, double altura2) {
        Scanner scanner = new Scanner(System.in);

        double areaCilindro = 2 * Math.PI * radio * (radio + altura2);
        // La fórmula para el área del cilindro es:2πr(r+h), y en Java se puede usar
        // "Math.PI", para representar el número pi

        double volumen = Math.PI * radio * radio * altura2;
        // La fórmula para el volumen es: πr^2h.

        System.out.println("El área del cilindro es: " + areaCilindro);
        System.out.println("El volumen del cilindro es: " + volumen);

    }

    public static void Ejercicio7_op(double radio2) {
        Scanner scanner = new Scanner(System.in);

        double longitud = 2 * Math.PI * radio2;

        // Para calcular el radio usaremos dos veces PI por el radio .

        double area = Math.PI * Math.pow(radio2, 2);

        // Para calcular el área usaremos la función de java "Math.pow" que nos permite
        // potenciar, agregado a eso le damos el valor a la potencia, en este caso es 2
        // para que la formula pueda funcionar correctamente

        // La fomrula es dos veces el radio por PI.

        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo es: " + area);

    }

    public static void Ejercicio8_op(double numero1, double numero2, double numero3) {
        Scanner scanner = new Scanner(System.in);
        double promedio = (numero1 + numero2 + numero3) / 3;

        System.out.println("El promedio de los 3 números ingresados es de :" + promedio);

    }

    public static void Ejercicio9_op(double num4) {
        Scanner scanner = new Scanner(System.in);

        if (num4 == 0) {
            System.out.println("El número ingresado es neutro");
        } else if (num4 > 0) {
            System.out.println("El número ingresado es positivo");
        } else {
            System.out.println("El número ingresado es negativo");
        }

    }

    public static void Ejercicio10_op(double num5, double num6) {
        Scanner scanner = new Scanner(System.in);

        if (num5 > num6) {
            System.out.println(num5 + " Es mayor que " + num6);
        } else if (num5 < num6) {
            System.out.println(num5 + " Es mayor que " + num6);
        } else {
            System.out.println("Ambos números son iguales");
        }
    }

    public static void Ejercicio11_op(double num7, double num8, double num9) {
        Scanner scanner = new Scanner(System.in);

        
    if (num7 > num8 && (num8 > num9)) {
        System.out.println(num7 + " Es mayor que " + num8 + " y " + num9 + " es menor que todos ");
    } else if (num8 > num7 && (num7 > num9)) {
        System.out.println(num8 + " Es mayor que " + num7 + " y " + num9 + " es menor que todos ");
    } else if (num9 > num7 && (num7 > num8)) {
        System.out.println(num9 + " Es mayor que " + num7 + " y " + num8 + " es menor que todos ");
    }
    }

    public static void Ejercicio12_op(double num10, double num11) {
        Scanner scanner = new Scanner(System.in);

        if (num10<num11) {
            double res = num10 + num11;
            System.out.println("El resultado es: " + res);
        }else if(num10>num11) {
            double res = num10-num11;
            System.out.println("El resultado es: " + res);
        }
    }

    public static void Ejercicio13_op(double num12, double num13) {
        Scanner scanner = new Scanner(System.in);

        if (num13 == 0) {
            System.out.println("La división por cero no es valida ");
        }else {
            double res2 = num12/num13;
            System.out.println("El resultado de la división es " + res2 );
        }
    }

    public static void Ejercicio14_op(double num14, double num15) {
        Scanner scanner = new Scanner(System.in);

        if (num14 < 0 || num15< 0) {
            double res3 = num14 + num15;
            System.out.println("El resultado de la suma es: " + res3);
        } else {
            double res3 = num14 * num15;
            System.out.println("El resultado de la multiplicación es:  " + res3);
        }

    }
    public static void Ejercicio15_op(double año) {
        Scanner scanner = new Scanner(System.in);

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }

    }

}
