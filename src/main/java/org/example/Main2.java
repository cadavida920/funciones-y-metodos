package org.example;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("la ganancia de la semana fue " + gananciasSemana(45, 15000));

        double ganancia = gananciasSemana(500, 10000);
        System.out.println("gaancias " + ganancia);

    }

    public static double gananciasSemana(int pizzasVendidas, double valorPizza) {
        double gananciasSemana = pizzasVendidas * valorPizza;
        return gananciasSemana;
    }

}




