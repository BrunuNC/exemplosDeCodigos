package Atividade9;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double altura, comprimento, largura, volume;
        System.out.println("Digite o valor da altura: ");
        altura = entrada.nextDouble();

        System.out.println ("Digite o valor do comprimento: ");
        comprimento = entrada.nextDouble();

        System.out.println("Digite o valor da largura: ");
        largura = entrada.nextDouble();

        volume = (comprimento * altura * largura);

        System.out.println("O volume da caixa é = " + volume);
    }
}
