package com.senac;

import javax.swing.*;

public class Loratadina {


    public static void main(String[] args) {


        boolean coceiraNasal = false;
        boolean coriza = false;
        boolean espirros = false;
        boolean coceiraNosOlhos = false;
        boolean urticaria = false;
        boolean alergiaNaPele = false;
        boolean indicavel = false;
        boolean temAlergiaAosComponentesDaFormula = false;

        if (temAlergiaAosComponentesDaFormula) {
            indicavel = false;
            System.out.println("medicamento não indicavel");

        } else if (coceiraNasal || coriza || espirros || coceiraNosOlhos || urticaria || alergiaNaPele) {
            indicavel = true;
            System.out.println("Medicamentos indicavel");
        }


    }
}
