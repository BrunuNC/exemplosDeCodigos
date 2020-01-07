package Atividade6;

import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
        //Declarando variaveis
        double n1, n2, soma, divisao, multip, subt;
        int operacao;

        //Instanciando Objeto Scanner
        Scanner nomeObjtValor = new Scanner(System.in);

        System.out.println("Minha calculadora Java");

        System.out.println("Digite um número: ");

        //Atribuindo o valor da entrada de dados as variáveis
        n1 = nomeObjtValor.nextDouble();
        n2 = nomeObjtValor.nextDouble();

        //Imprimindo menu
        System.out.println("Que operação deseja realizar? ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");

        System.out.println("Digite o número da operação: ");

        //atribuindo entrada de dados com tipo da operação a ser efetuada
        operacao = nomeObjtValor.nextInt();

        if (operacao == 1) { // se for 1 Adição
            soma = n1 + n2;
            System.out.println("A soma é: " + soma);
        }
        if (operacao == 2) { // Se for 2 Subtração
            subt = n1 - n2;
            System.out.println("A Subtração é: " + subt);
        }
        if (operacao == 3) { //Se for 3 Divisão
            divisao = n1 / n2;
            System.out.println("A Divisão é: " + divisao);
        }
        if (operacao == 4) { //Se for 4 multiplicação
            multip = n1 * n2;
            System.out.println("A Multiplicação é: " + multip);
        }
    }
}
