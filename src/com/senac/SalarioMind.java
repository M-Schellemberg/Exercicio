package com.senac;

public class SalarioMind {

    public static void main(String[] args) {


        //EM uma empresa, é necessário calcular o salarios dos empregados
        //Escreva uma aplicação que calcule o salario dos empregados
        //baseado nos seguintes critérios

        //01- A cada 3 anos de trabalho o salário recebe um acrescimo de 300 R$
        //02- A cada curso feito, o salario recebe um acrescimo de 500 R$
        //03- Acima de 5 anos tem direito a plano de saude de 400 R$
        //04- A cada 10 anos o salario recebe um desconto de 100 R$
        //05- Considere o salario base 2000 R$
        //06- Funcionarios acima de 40 anos tem acrescimo de 1000R$
        //07- Funcionarios não podem ter idade <18 ou >60;


        int anosDeTrabalho = 23;
        double salarioTotal = 0;
        double salarioBase = 2000;
        int quantidadeDeCursosFeitos = 8;
        int idade = 40;


        if (idade >= 18 && idade <= 60) {
            salarioTotal = salarioBase + anosDeTrabalho / 3 * 300;
            salarioTotal = salarioTotal + quantidadeDeCursosFeitos * 500;
            if (anosDeTrabalho > 5) {
                salarioTotal = salarioTotal + 400;
            }

            salarioTotal = salarioTotal - (anosDeTrabalho / 10) * 100;

            if (idade > 40) {
                salarioTotal = salarioTotal + 1000;
            }

            System.out.println("o funcionario tem salario de: " + salarioTotal);

        } else {
            System.out.println("esse funcionario nao pode pertencer a essa empresa");
        }

        System.out.println();


    }
}
