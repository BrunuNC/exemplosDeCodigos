package Atividade8;

public class Vetor1 {
    public static void main(String[] args) {
        //declarando e iniciando o array unidimencional com 7 posições
        int n[] = {9, 2000, 8, 1008, 45, 578, 708};

        System.out.println("Total de casas de N é 7.");
        //laço para percorrer o array
        for (int i = 0; i < 7; i++) {
            //imprime oas posições e seus respectivos valores
            System.out.println("Na posição " + i + " temos " + n[i]);
        }
    }
}
