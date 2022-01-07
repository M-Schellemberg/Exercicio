package com.senac;

public class Exercicio {

    public static void main(String[] args) {


        String nacionalidade = "brasileiro";
        String disponibilidadeDeHorario = "vespertino";
        int idade = 18;

        if (idade >= 18 && idade <= 65) {
            System.out.println("aprovadoNaIdade");
        } else {
            System.out.println("naoAprovado");
        }

        if (disponibilidadeDeHorario == "vespertino") {
            System.out.println("aprovadoNoHorario");
        }

        if (nacionalidade == "brasileiro") {
            System.out.println("aprovadoNaNacionalidade");
        }


    }
}


