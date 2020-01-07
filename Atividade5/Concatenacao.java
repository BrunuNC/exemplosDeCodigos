package Atividade5;

public class Concatenacao {
    public static void main(String[] args) {
        //declarando variáveis
        String palavra1 =  "Computação - Sistema de informação ";
        String palavra2 = "é para os fortes - positivo e continuo!";

        String ConcatenarCodigo = palavra1 + palavra2; //concatenando as variáveis

        System.out.println (ConcatenarCodigo); //Imprime a concatenação das variaveis "palavra1" + "palavra2"

        String resultado4com4 = "Resultado concatenacao com parentese = " + (4+4); //resulta em "8" pois executa uma soma dos valores
        System.out.println (resultado4com4);

        String resultado4com4_ = "Resultado concatenacao sem parênteses " + 4 + 4 + "\n"; //resulta em 44 pois executa uma concatenação dos valores
        System.out.println (resultado4com4_);

        String concatenacao = ("ESTABELECA A CONCATENACAO DE ATITUDES POSITIVAS NA SUA VIDA. \n"
                + "ORGANIZAÇÃO DE METAS COMO EM ORDENACAO DE DADOS. \n"
                + "ESTABELECE COmO UM SWITCH COM VARIAS CASES DE SUCESSO. \n"
                + "case 1: DETERMINE OBJETIVOS E METAS COM PRAZO. \n"
                + "cage 2: COMO O VALOR DE CADA VARIAVEL, ESTABELECE O VALOR DO SEU POTENCIAL DE MUDANÇA. \n"
                + "REALIZA UM (IF) e (ELSE) NAS SUAS ESCOLHAS, SE A OPÇÂO FOR BOA EXECUTO. \n"
                + "SENAO EXECUTO OUTRA CONDICAO MELHOR. \n"
                + "COMO BASE NA ORGANIZAÇÃO ORIENTADA A OBJETO, ORGANIZE SEUS OBJETIVOS. \n"
                + "HERANÇA, HERDAR VALOR AGREGADO PARA O CRESCIMENTO ");
        System.out.println (concatenacao);
    }
}
