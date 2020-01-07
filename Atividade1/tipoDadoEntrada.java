package Atividade1;

import java.util.Scanner;

public class tipoDadoEntrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Estancia objeto Scanner, para receber entrada de dados
        float valor; //declaração de variável
        System.out.println("Quanto custa algo em uma loja de R$ 1,99? "); //Imprime String
        valor = entrada.nextFloat(); //Armazena na variável "valor" o número digitado pelo usuário
        System.out.println("Este é o valor nesta loja " + valor + " RS."); //Imprime a concatenação da String com o valor digitado
    }
}
