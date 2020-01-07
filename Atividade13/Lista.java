package Atividade13;

import java.util.*;

public class Lista {
    static List alunos = new ArrayList();   //Lista para o armazenamento dos alunos.
    static List nomesAlunos = new ArrayList();  //Lista para o armazenamento dos nomes dos alunos, para a realização da pesquisa.
    static Scanner scanner = new Scanner(System.in);    //Um scanner de texto simples que pode analisar tipos e cadeias primitivas usando o fluxo de entrada "padrão", correspondente à entrada do teclado.
    //iniciando as variaves para os loops
    static String i;
    static String j;

    public static void exibirMenu() {
        System.out.println("*=======================*");
        System.out.println("    Cadastro de Alunos   ");
        System.out.println("*=======================*");
        System.out.println("       Menu        ");
        System.out.println("*=======================*");
        System.out.println("    1 - Cadastrar aluno  ");
        System.out.println("*=======================*");
        System.out.println("     2 - Listar Alunos   ");
        System.out.println("*=======================*");
        System.out.println("    3 - Pesquisar Aluno  ");
        System.out.println("*=======================*");
        System.out.println("     4 - Remover Aluno   ");
        System.out.println("*=======================*");
    }   //Método para exibição do menu principal.

    public static void exibirMenuSaida() {
        System.out.println("*========================*");
        System.out.println("      1 - Continuar       ");
        System.out.println("*========================*");
        System.out.println("         0 - Sair         ");
        System.out.println("*========================*");
    }   //Método para exibição do menu de saída.

    public static void verificar() {
        if (j.equals("1")) {
            j = "1";
        } else if (j.equals("2")) {
            j = "2";
        } else if (j.equals("3")) {
            j = "3";
        } else if (j.equals("4")) {
            j = "4";
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

    public static void cadastrarAluno() {
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.next();
        nomesAlunos.add(nome);
        System.out.println("Digite a matrícula do aluno:");
        String matricula = scanner.next();
        System.out.println("Digite a data de nascimento do aluno:");
        String dataNascimento = scanner.next();
        String aluno = "Nome: " + nome + "\n" + "Matrícula: " + matricula + "\n" + "Data de Nascimento: " + dataNascimento + "\n";
        alunos.add(aluno);
    }   //Método para adicionar um aluno na lista.

    public static void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Não há nenhum aluno cadastrado.");
        } else {
            for (Object aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }   //Método para exibir os alunos cadastrados.

    public static String pesquisar() {
        System.out.println("Digite o nome do aluno:");
        String nome1 = scanner.next();
        String nome2;
        if (nomesAlunos.contains(nome1)) {
            System.out.println(alunos.get(nomesAlunos.indexOf(nome1)));
            nome2 = nome1;
        } else {
            System.out.println("Aluno não encontrado.");
            nome2 = null;
        }
        return nome2;
    }   //Método para procurar pelo nome um aluno cadastrado.

    public static void removerAluno() {
        if (pesquisar().equals(null)) {
            System.out.print("");
        } else {
            System.out.println("Selecione 1 para remover este contato ou 0 para cancelar");
            String n = scanner.next();
            verificarSaida();
            switch (i) {
                case "1":
                    alunos.remove(alunos.get(nomesAlunos.indexOf(pesquisar())));
                    nomesAlunos.remove(pesquisar());
                    System.out.println("Aludo removido com sucesso!!!");
                    break;
                default:
                    System.out.println("Cancelado!");
                    break;
            }
        }
    }   //Método para apagar um aluno da lista.

    public static void main(String[] args) {
        do {
            exibirMenu();
            j = scanner.next(); //Digitaliza a próxima entrada como uma String. j recebe uma String.
            verificar();
            switch (j) {    //O switch irá usar como parâmetro de verificação a variável j.
                case "1":
                    cadastrarAluno();
                    break;
                case "2":
                    listarAlunos();
                    break;
                case "3":
                    pesquisar();
                    break;
                case "4":
                    removerAluno();
                    break;
                default:
                    System.out.println("Opção inválida, por favor selecione uma opção disponível.");
                    break;
            }
            exibirMenuSaida();
            i = scanner.next(); //Digitaliza a próxima entrada como uma String. i recebe uma String.
            verificarSaida();
        } while (i.equals("1"));    //Loop que permite que a aplicação continue rodando enquanto o usuário digitar 1.
    }
}