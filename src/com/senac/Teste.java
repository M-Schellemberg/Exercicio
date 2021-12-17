package com.senac;

public class Teste {

    public static void main(String[] args) {

        int horas = 6;
        int dia = 22;
        double salarioJuniorHora = 25;
        double salarioPlenoHora = 45;
        double salarioseniorHora = 60;

        double juniorDia = horas * salarioJuniorHora;
        double plenoDia = horas * salarioPlenoHora;
        double seniorDia = horas * salarioseniorHora;

        double JuniorMes = horas * salarioJuniorHora * dia;
        double PlenoMes = horas * salarioPlenoHora * dia;
        double SeniorMes = horas * salarioseniorHora * dia;

        System.out.println(JuniorMes);


    }

}