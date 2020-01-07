package Atividade16;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List list = new ArrayList();    //Instanciamento da lista.
        list.add(0, "Elemento1");   //Insere o elemento especificado na posição especificada nesta lista.
        list.add("Elemento2");  //Anexa o elemento especificado ao final desta lista.
        list.clear();   //Remove todos os elementos desta lista.
        list.add("Elemento3");  //Anexa o elemento especificado ao final desta lista.
        list.add("Elemento4");  //Anexa o elemento especificado ao final desta lista.
        list.add("Elemento5");  //Anexa o elemento especificado ao final desta lista.
        list.add("Elemento6");  //Anexa o elemento especificado ao final desta lista.
        System.out.println(list.contains("Elemento3")); //Retornará true se esta lista contiver o elemento especificado.
        System.out.println(list.equals("Elemento4"));   //Compara o objeto especificado com esta lista para igualdade.
        System.out.println(list.get(0));    //Retorna o elemento na posição especificada nesta lista.
        System.out.println(list.indexOf("Elemento4"));  //Retorna o índice da primeira ocorrência do elemento especificado nesta lista, ou -1 se essa lista não contiver o elemento.
        System.out.println(list.isEmpty()); //Retornará true se esta lista não contiver elementos.
        System.out.println(list.lastIndexOf("Elemento5"));  //Retorna o índice da última ocorrência do elemento especificado nesta lista ou -1 se essa lista não contiver o elemento.
        System.out.println(list.remove(0)); //Remove o elemento na posição especificada nesta lista.
        System.out.println(list.remove("Elemento4"));   //Remove a primeira ocorrência do elemento especificado desta lista, se estiver presente.
        list.set(1, "Elemento7");   //Substitui o elemento na posição especificada nesta lista pelo elemento especificado.
        System.out.println(list.size());    //Retorna o número de elementos nesta lista.
        String[] array = new String[list.size()];   //Vetor que receberá os elementos de list.
        list.toArray(array);    //Retorna uma matriz que contém todos os elementos nesta lista na sequência apropriada, do primeiro ao último elemento.
        for (String s : array) {    //for each para impressão dos elementos de array.
            System.out.println(s);  //Encerra a linha atual, escrevendo a sequência de string.
        }
        System.out.println(list);   //Encerra a linha atual, escrevendo a sequência de string.
    }
}

/***
 * Lista é um tipo de estrutura de dados, que representa uma sequência de dados.
 * Ela pode se comportar tanto como FIFO quanto como LIFO.
 * Nesta estrutura ocorre o armazenamento dos dados através de uma sequência dinâmica.
 * Por ser uma estrutura dinâmica, a lista trabalha com muitos métodos, muitos deles utilizando o auxílio do index de seus elementos.
 */