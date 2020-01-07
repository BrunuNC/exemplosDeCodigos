package Atividade11;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    static Stack tarefas = new Stack(); //Intancia da classse para a pilha.
    static Scanner scanner = new Scanner(System.in);    //Um scanner de texto simples que pode analisar tipos e cadeias primitivas usando o fluxo de entrada "padrão", correspondente à entrada do teclado.
    //iniciando variaveis para os loops
    static String i;
    static String j;

    public static void menu() {
        System.out.println("*=======================*");
        System.out.println("  Gerenciador de Tarefas ");
        System.out.println("*=======================*");
        System.out.println("          Menu           ");
        System.out.println("*=======================*");
        System.out.println("   1 - Adicionar Tarefa  ");
        System.out.println("*=======================*");
        System.out.println("2 - Exibir Próxima Tarefa");
        System.out.println("*=======================*");
    }   //Método para exibição do menu principal.

    public static void menuSaida() {
        System.out.println("*=======================*");
        System.out.println("      1 - Continuar      ");
        System.out.println("*=======================*");
        System.out.println("        0 - Sair         ");
        System.out.println("*=======================*");
    }   //Método para exibição do menu de saída.

    public static void opcoes() {
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

    public static void adicionarTarefa() {
        System.out.println("Digite a tarefa a ser adicionada:");
        String tarefa = scanner.next();
        tarefas.push(tarefa);
    }   //Método para adicionar uma tarefa na pilha.

    public static void proximaTarefa() {
        if (tarefas.isEmpty()) {
            System.out.println("Não há nenhuma tarefa para ser executada.");
        } else {
            System.out.println(tarefas.peek());
        }
    }   //Método para exibir a tarefa a ser cumprida.

    public static void main(String[] args) {
        do {
            menu();
            j = scanner.next(); //Digitaliza a próxima entrada como uma String. j recebe uma String.
            opcoes();
            switch (j) {    //O switch irá usar como parâmetro de verificação a variável j.
                case "1":
                    adicionarTarefa();
                    break;
                case "2":
                    proximaTarefa();
                    break;
                default:
                    System.out.println("Opção inválida, por favor selecione uma opção disponível.");
                    break;
            }
            menuSaida();
            i = scanner.next(); //Pega a próxima entrada como uma String.
            verificarSaida();
        } while (i.equals("1"));    //Loop que permite a aplicação continuar rodando enquanto o usuário digitar 1.
    }
}