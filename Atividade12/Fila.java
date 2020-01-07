package Atividade12;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Fila {
    static Queue contatos = new ArrayDeque();   //Fila para o armazenamento dos contatos.
    static Scanner scanner = new Scanner(System.in);    //Um scanner de texto simples que pode analisar tipos e cadeias primitivas usando o fluxo de entrada "padrão", correspondente à entrada do teclado.
    //iniciando variaveis para os loops
    static String i;
    static String j;

    public static void exibirMenu() {
        System.out.println("*=======================*");
        System.out.println("  Cadastro de Contados ");
        System.out.println("*=======================*");
        System.out.println("          Menu           ");
        System.out.println("*=======================*");
        System.out.println("   1 - Adicionar Contato  ");
        System.out.println("*=======================*");
        System.out.println("2 - Exibir Próximo Contato");
        System.out.println("*=======================*");
    }   //Método para exibição do menu principal.

    public static void menuSaida() {
        System.out.println("*=======================*");
        System.out.println("      1 - Continuar      ");
        System.out.println("*=======================*");
        System.out.println("        0 - Sair         ");
        System.out.println("*=======================*");
    }   //Método para exibição do menu de saída.

    public static void verificar() {
        if (j.equals("1")) {
            j = "1";
        } else if (j.equals("2")) {
            j = "2";
        } else {
            j = "0";
        }
    }   //Método para verificar se a opção é válida.

    public static void verificarSaida() {
        if (i.equals("1")) {
            i = "1";
        } else if (i.equals("0")) {
            i = "0";
        } else {
            i = "2";
        }
    }   //Método para verificar se a opção é válida.

    public static void adicionarContato() {
        System.out.println("Digite o nome do contato a ser adicionado:");
        String nome = scanner.next();
        System.out.println("Digite o número do contato a ser adicionado:");
        String numero = scanner.next();
        String contato = nome + " - " + numero;
        contatos.offer(contato);
    }   //Método para adicionar um contato na fila.

    public static void exibirProximoContato() {
        if (contatos.isEmpty()) { //Se a fila estiver vazia
            System.out.println("Não existem contatos cadastrados.");
        } else {
            System.out.println(contatos.peek());
            contatos.poll();
        }
    }   //Método para exibir o contato a ser efetuado.

    public static void main(String[] args) {
        do {
            exibirMenu();
            j = scanner.next(); //Digitaliza a próxima entrada como uma String. j recebe uma String.
            verificar();
            switch (j) {    //O switch irá usar como parâmetro de verificação a variável j.
                case "1":
                    adicionarContato();
                    break;
                case "2":
                    exibirProximoContato();
                    break;
                default:
                    System.out.println("Opção inválida, por favor selecione uma opção disponível.");
                    break;
            }
            menuSaida();
            i = scanner.next(); //Digitaliza a próxima entrada como uma String.
            verificarSaida();
        } while (i.equals("1"));    //Loop que permite que a aplicação continue rodando enquanto o usuário digitar 1.
    }
}