package com.senac;

public class Remedio {

    public static void main(String[] args) {


        boolean dores = true;
        boolean coriza = true;
        boolean febre = true;
        boolean narizEntupido = true;
        boolean podeTomarRemedio = true;

        if (dores || coriza || febre || narizEntupido) {
            podeTomarRemedio = false;
            System.out.println("indicavel");
        }
        ;

        System.out.println();

    }

}
