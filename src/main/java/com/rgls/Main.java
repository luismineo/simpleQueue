package com.rgls;

public class Main {
    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue(5);

        // Adicionar elementos
        for (int i = 0; i < queue.getSize(); i++) {
            queue.addElm(i+10);
        }

        // Listar elementos
        queue.showElm();

        System.out.println("=====================================");

        // Remover um elemento
        queue.rmvFirst();

        // Listar elementos após a remoção
        queue.showElm();

        System.out.println("=====================================");

        // Remover mais dois elementos
        queue.rmvFirst();
        queue.rmvFirst();

        // Adicionar três elementos
        queue.addElm(19);
        queue.addElm(13);
        queue.addElm(14);

        // Listando os novos elementos
        queue.showElm();

        System.out.println("=====================================");

        // Remover todas as ocorrências de um elemento
        queue.rmvAllOccurencies(13);

        // Listar elementos após a remoção de todas as ocorrências
        queue.showElm();

        System.out.println("=====================================");

        // Buscar um elemento que não existe
        queue.searchElm(12);

        System.out.println("=====================================");

        // Buscar um elemento que existe
        queue.searchElm(14);

        System.out.println("=====================================");

        // Adicionando um número menor do que o já existente
        queue.addElm(5);

        // Listar elementos após adicionar um número menor
        queue.showElm();

        System.out.println("=====================================");

        // Encontrar o maior elemento
        System.out.println("Maior elemento: " + queue.max());

        System.out.println("=====================================");

        // Encontrar o menor elemento
        System.out.println("Menor elemento: " + queue.min());

        System.out.println("=====================================");

        // Calcular a média dos elementos
        System.out.println("Média: " + queue.average());

        System.out.println("=====================================");

        // Obter a quantidade de elementos
        System.out.println("Quantidade de elementos: " + queue.count());

        System.out.println("=====================================");

        // Aumentar a capacidade da fila
        queue.increaseCapacity(10);

        // Adicionar mais elementos após aumentar a capacidade
        for (int i = 0; i < 10; i++) {
            queue.addElm(i+20);
        }

        // Listar elementos após aumentar a capacidade
        queue.showElm();
    }
}