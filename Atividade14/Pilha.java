package Atividade14;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack stack = new Stack();  //Instanciamento da pilha.
        System.out.println(stack.empty());  //Testa se esta pilha está vazia.
        stack.push("Elemento1");    //Empurra um item para o topo da pilha.
        stack.push("Elemento2");    //Empurra um item para o topo da pilha.
        stack.push("Elemento3");    //Empurra um item para o topo da pilha.
        System.out.println(stack.peek());   //Olha o objeto no topo desta pilha sem removê-lo da pilha.
        System.out.println(stack.pop());    //Remove o objeto no topo desta pilha e retorna esse objeto como o valor dessa função.
        System.out.println(stack.search("Elemento2"));  //Retorna a posição em que um objeto está nessa pilha.
        System.out.println(stack);  //Encerra a linha atual, escrevendo a sequência de string.
    }
}

/***
 * Pilha é um tipo de estrutura de dados, em que o ultimo elemento a entrar é o primeiro a sair (LIFO).
 * Nesta estrutura ocorre o empilhamento dos dados.
 * Os principais métodos da pilha são o push (empilhar) e o pop (desempilhar)
 */