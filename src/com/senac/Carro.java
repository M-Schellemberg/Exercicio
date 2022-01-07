package com.senac;

public class Carro {

    public static void main(String[] args) {


        //um aplicativo de carro, envia corrida para os motoristas
        //as corridas são pedidas  pelos usuários
        //Antes de enviar a corrida para o motorista, a empresa
        //precisa saber se o carro está em condições de viagem
        //sendo assim é necessário verificar;
        //O motorista é obrigado a informar q

        //01- O motorista está com os documentos em dia?
        //02- O ano do carro é maior que 2011?
        //02- O motorista está online na plaforma?
        //03- O motorista é o mais próximo do local?
        //04- O motorista só pode ter no máximo 50 corridas no dia


        boolean estaEmCondicoesDeViagemMotorista1 = false;
        boolean estaComDocumentosEmDiaMotorista1 = false;
        boolean estaOnlineMotorista1 = false;
        int anoDoCarroMotorista1 = 2020;
        int quantidadeCorridasNoDiaMotorista1 = 40;
        float distanciaLocalEmbarqueMotorista1 = 40;
        boolean aptoMotorista1 = true;

        boolean estaEmCondicoesDeViagemMotorista2 = false;
        boolean estaComDocumentosEmDiaMotorista2 = false;
        boolean estaOnlineMotorista2 = false;
        int anoDoCarroMotorista2 = 2021;
        int quantidadeCorridasNoDiaMotorista2 = 30;
        float distanciaLocalEmbarqueMotorista2 = 30;
        boolean aptoMotorista2 = false;

        if (estaComDocumentosEmDiaMotorista1 && estaEmCondicoesDeViagemMotorista1 && estaOnlineMotorista1 &&
                anoDoCarroMotorista1 > 2011 && quantidadeCorridasNoDiaMotorista1 < 50) {
            aptoMotorista1 = true;
        }

        if (estaComDocumentosEmDiaMotorista2 && estaEmCondicoesDeViagemMotorista2 && estaOnlineMotorista2 &&
                anoDoCarroMotorista2 > 2011 && quantidadeCorridasNoDiaMotorista2 < 50) {
            aptoMotorista2 = true;
        }

        if (aptoMotorista1 && aptoMotorista2) {

            if (distanciaLocalEmbarqueMotorista1 < distanciaLocalEmbarqueMotorista2) {
                System.out.println("motorista 1 foi selecionado");
            } else {
                System.out.println("motorista 2 foi selecionado");
            }
        }


    }
}



