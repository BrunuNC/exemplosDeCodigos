package Atividade2;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) { //Método principal
        Scanner entrada = new Scanner(System.in); //Estancia objeto Scanner, para receber entrada de dados
        int idade; //declaração de variável
        System.out.println("Digite sua idade: "); //Imprime String
        idade = entrada.nextInt(); //Armazena na variável "valor" o número digitado pelo usuário
        System.out.printf("Sua idade é " + idade + "\n"); //Imprime a concatenação da String com o valor digitado
    }
}
