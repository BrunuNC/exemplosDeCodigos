package Atividade7;

public class Switch {
    public static void main(String[] args) {
        int diaDaSemana = 1; //A tribuindo valor correspondente ao dia da semana
        switch (diaDaSemana) { //Dependendo do valor, exibe o dia da semana correspondente
            case 1:
                System.out.println("Domingo");
                break;//fecha o programa apos executar sua condição
            case 2:
                System.out.println("Segunda - feira");
                break;
            case 3:
                System.out.println("Terça - feira");
                break;
            case 4:
                System.out.println("Quarta - feira");
                break;
            case 5:
                System.out.println("Quinta - feira");
                break;
            case 6:
                System.out.println("Sexta - feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
    }
}
