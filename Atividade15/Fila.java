package Atividade15;

import java.util.ArrayDeque;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue queue = new ArrayDeque(); //Instanciamento da fila.
        queue.add("Elemento1"); //Insere o elemento especificado nessa fila, retornando true após o sucesso e lançando uma Exception se nenhum espaço estiver disponível no momento.
        queue.add("Elemento2"); //Insere o elemento especificado nessa fila, retornando true após o sucesso e lançando uma Exception se nenhum espaço estiver disponível no momento.
        queue.offer("Elemento3");   //Insere o elemento especificado nessa fila.
        queue.offer("Elemento4");   //Insere o elemento especificado nessa fila.
        System.out.println(queue.element());    //Recupera, mas não remove, a cabeça desta fila.
        System.out.println(queue.peek());   //Recupera, mas não remove, a cabeça desta fila ou retorna nulo se esta fila estiver vazia.
        System.out.println(queue.remove()); //Recupera e remove a cabeça desta fila.
        System.out.println(queue.poll());   //Recupera e remove a cabeça dessa fila ou retorna nulo se essa fila estiver vazia.
        System.out.println(queue);  //Encerra a linha atual, escrevendo a sequência de string.
    }
}

/***
 * Fila é um tipo de estrutura de dados, em que o primeiro elemento a entrar é o primeiro a sair (FIFO).
 * Nesta estrutura ocorre o enfileiramento dos dados.
 * Os principais métodos da pilha são o offer (enfileirar) e o poll (desenfileirar)
 */