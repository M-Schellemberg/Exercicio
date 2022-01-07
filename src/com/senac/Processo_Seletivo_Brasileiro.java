package com.senac;

public class Processo_Seletivo_Brasileiro {

    public static void main(String[] args) {


        //Construa um cadastro de usuário, considerando os seguintes critérios
        //Precisa ter idade entre 18 e 60 anos
        //Precisa ser brasileiro
        //Precisa ter disponibilidade no período da tarde

        //Caso 1 dos critérios não seja válido, o sistema deve parar a verificação e mostrar que o usuário não pode se cadastrar pelo motivo específico


        int idade = 22;
        boolean brasileiro = true;
        boolean temdisponibilidadeAtarde = true;
        boolean aprovado = false;

        if (brasileiro) {
            System.out.println("É brasileiro");

            if (temdisponibilidadeAtarde) {
                System.out.println("tem disponibilidade Atarde");

                if (idade >= 18 && idade <= 65) {
                    System.out.println("tem idade adequada");

                    aprovado = true;
                }
            }
        } else System.out.println();


    }
}
