package com.rgls;

public class Main {
    public static void main(String[] args) {
        // Intanciando uma nova fila de tamanho 5
        SimpleQueue queue = new SimpleQueue(5);

        // Adicionando elementos
        for (int i = 0; i < queue.getSize(); i++) {
            queue.addElm(i+10);
        }

        // Listando elementos
        queue.showElm();

        System.out.println("=====================================");

        // Removendo um elemento
        queue.rmvFirst();

        // Listando elementos após a remoção
        queue.showElm();

        System.out.println("=====================================");

        // Removendo mais dois elementos
        queue.rmvFirst();
        queue.rmvFirst();

        // Adicionando três elementos
        queue.addElm(19);
        queue.addElm(13);
        queue.addElm(14);

        // Listando os novos elementos
        queue.showElm();

        System.out.println("=====================================");

        // Removendo todas as ocorrências de um elemento
        queue.rmvAllOccurencies(13);

        // Listando elementos após a remoção de todas as ocorrências
        queue.showElm();

        System.out.println("=====================================");

        // Buscando um elemento que não existe
        queue.searchElm(12);

        System.out.println("=====================================");

        // Buscando um elemento que existe
        queue.searchElm(14);

        System.out.println("=====================================");

        // Adicionando um número menor do que o já existente
        queue.addElm(5);

        // Listando elementos após adicionar um número menor
        queue.showElm();

        System.out.println("=====================================");

        // Encontrando o maior elemento
        System.out.println("Maior elemento: " + queue.max());

        System.out.println("=====================================");

        // Encontrando o menor elemento
        System.out.println("Menor elemento: " + queue.min());

        System.out.println("=====================================");

        // Calculando a média dos elementos
        System.out.println("Média: " + queue.average());

        System.out.println("=====================================");

        // Obtendo a quantidade de elementos
        System.out.println("Quantidade de elementos: " + queue.count());

        System.out.println("=====================================");

        // Aumentando a capacidade da fila em 10
        queue.increaseCapacity(10);

        // Adicionando mais elementos após aumentar a capacidade
        for (int i = 0; i < 10; i++) {
            queue.addElm(i+20);
        }

        // Listando elementos após aumentar a capacidade
        queue.showElm();
    }
}