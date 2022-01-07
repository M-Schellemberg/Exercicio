package com.senac;

public class Metodo {

    public static void main(String[] args) {


        double numero1 = 1;
        double numero2 = 2;
        double resultadoSoma;

        resultadoSoma();
        soma(numero1, numero2);
        double resultado = somarComRetorno(numero1, numero2);


    }


    private static void resultadoSoma() {

        System.out.println("ihkjgiuhgkuku");
    }

    private static void soma(double numero1, double numero2) {

        System.out.println(numero1 + numero2);
    }

    private static double somarComRetorno(double numero1, double numero2) {

        return numero1 + numero2;
    }


}
