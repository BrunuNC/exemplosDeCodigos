package Atividade8_1;

import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        String[] nomes = new String[5]; //declara a array de inteiros "nomes" com 5 posições
        double[] notas = new double[5]; //declara a array de decimais "notas" com 5 posições
        Scanner teclado = new Scanner(System.in);
        //laço para entrada dos nomes dos 5 alunos e suas notas
        for (int cont = 0; cont <= 4; cont++) {
            System.out.println("Entre com o nome do aluno nº " + (cont + 1));
            nomes[cont] = teclado.nextLine();
            System.out.println("Entre com a nota do aluno nº " + (cont + 1));
            notas[cont] = Double.parseDouble(teclado.nextLine());
        }
        //laço para somatoria das notas
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += notas[i];
        }
        //calcula a média de cada aluno e imprime os alunos com média maior
        double media = (soma / 5);
        System.out.println("Média " + media);
        for (int i = 0; i < 5; i++) {
            if (notas[i] >= media) {
                System.out.println("Aluno nº " + (i + 1) + " : " + nomes[i] + " Passou com nota " + notas[i]);
            }
        }
    }
}
