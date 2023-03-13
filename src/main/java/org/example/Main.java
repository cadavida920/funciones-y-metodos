package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Crear una función que calcule el área de un triángulo.
        // Los parámetros son la base y la altura del triángulo.

        float area = calcularArea(5, 10);
        System.out.println("el area es " + area);

        determinarPar(5);
        determinarPar(10);
        determinarPar(15);


        saberPalindromo("juan cadavid");
        saberPalindromo("anitalavalatina");
        saberPalindromo("ana");

        float resultado = saberMultiplicacio(10, 5);
        System.out.println("la multiplicacion es:" + resultado);

        double resultado_divison = saberrDivision(10, 4);
        System.out.println("la divison es: " + resultado_divison);


        double radio = 5;
        double Area = calcularAreaCirculo(radio);
        System.out.println("el area del circulo es " + area);

        int numero = 5;
        int factorial = calcularFactoriar(numero);
        System.out.println("el factorial es " + factorial);


        int numero1 = 10;
        int numero2 = 8;
        int[] mi_arreglo = {1, 2, 4};
        int[] mi_arreglo1 = {1, 2, 5};
        int[] resultado2 = sumarArreglos(mi_arreglo, mi_arreglo1);
        System.out.print("la suma es [");
        for (int i = 0; i < resultado2.length; i++) {
            int valorActual = resultado2[i];
            System.out.print(" " + valorActual + " ");

        }

        System.out.print(" ]");

    }

    // Calcular el area de un triangulo
    public static float calcularArea(float base, float altura) {
        float area = base * altura / 2;
        return area;
    }

    //Escribir una función que reciba un número entero y determine si es par o impar.

    public static void determinarPar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("es par " + numero);
        } else {
            System.out.println("No es par " + numero);

        }
    }

    //Escribir una función que reciba una cadena de caracteres y determine si es un palíndromo (es decir,
    // si se lee igual de izquierda a derecha que de derecha a izquierda).

    public static void saberPalindromo(String cadena) {
        StringBuilder cadena1 = new StringBuilder();
        cadena1.append(cadena);
        cadena1.reverse();

        if (cadena1.toString().equals(cadena)) {
            System.out.println("Es palindroma " + cadena);
        } else {
            System.out.println("no es palindroma " + cadena);
        }
    }

    public static float saberMultiplicacio(float numero1, float numero2) {
        float resultado = numero1 * numero2;
        return resultado;
    }

    public static double saberrDivision(double div1, double div2) {
        double resultado = div1 / div2;
        return resultado;
    }

    public static double calcularAreaCirculo(double radio) {
        double pi = 3.1416;
        double Area = pi * radio * radio;
        return Area;
    }

    public static int calcularFactoriar(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactoriar(n - 1);
        }
    }

    public static int[] sumarArreglos(int[] numero1, int[] numero2) {
        int[] resultado = new int[numero1.length];
        for (int i = 0; i < numero1.length; i++) {
            resultado[i] = numero1[i] + numero2[i];
        }
        return resultado;
    }

    //cree una funsion que le retorne el promedio de salario de la empreza "x" usted recibira un arreglo con el
    //salario de los empleados

    public static boolean[] promedioSalario(boolean[] perosnaX) {
        boolean[] salario = new boolean[perosnaX.length];
        return null;
    }

}



