package com.rgls;

import java.util.Objects;

public class SimpleQueue {
    private int size;
    private Integer[] vector;
    private int lastIndex = 0;

    public int getSize() {
        return size;
    }

    public SimpleQueue(int size) {
        this.size = size;
        this.vector = new Integer[this.size];
    }

    // Adiciona um elemento na fila, caso a fila esteja cheia, exibe uma mensagem
    public void addElm(Integer elm){
        // Essa condicional verifica de o index do ultimo elemento é igual ao tamanho
        // da fila, caso seja, a fila está cheia
        if(lastIndex == size){
            System.out.println("Fila cheia");
        } else{
            vector[lastIndex] = elm;
            lastIndex++;
        }
    }

    // Verifica se a fila está vazia comparando o ultimo index com zero
    private boolean isEmpty(){
        return lastIndex == 0;
    }

    // printa os elementos e seus indices
    public void showElm() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(i + ":");
            System.out.println(vector[i]);
        }
    }

    // Remove o primeiro elemento da fila, e diminui em um o index final
    public void rmvFirst() {
        for (int i = 0; i < lastIndex - 1; i++) {
            vector[i] = vector[i+1];
        }

        lastIndex--;
        vector[lastIndex] = null;
    }

    // Remove todas as ocorrencias de um elemento
    public void rmvAllOccurencies(Integer elm){
        // Enquanto o método search retornar true, remove o primeiro elemento
        // pois indica que este elemento ainda está na fila
        while(search(elm)){
            // Enquanto o primeiro elemento for diferente do elemento a ser removido
            // remove o primeiro elemento
            while(vector[0] != elm){
                rmvFirst();
            }
            // Sai do loop quando acha a ultima ocorrencia e a remove
            rmvFirst();
        }
    }

    // Usa o método abaixo para procurar o elemento, e caso não encontre, exibe uma mensagem
    public void searchElm(Integer elm){
        if(!search(elm)){
            System.out.println("Elemento não encontrado na fila");
        } else {
            System.out.println("Elemento encontrado na fila");
        }
    }

    // Procura um elemento pela fila, e retorna true caso encontre
    private boolean search(Integer elm){
        boolean elmExist = false;

        for (int i = 0; i < size; i++) {
            if (Objects.equals(vector[i], elm)){
                elmExist = true;
                break;
            }
        }
        return elmExist;
    }

    // Valor Máximo
    public Integer max(){
        Integer max = null;

        for (int i = 0; i < size; i++) {
            if (vector[i] != null) {
                if (max == null || vector[i] > max){
                    max = vector[i];
                }
            }
        }

        return max;
    }

    // Valor Mínimo
    public Integer min(){
        Integer min = null;

        for (int i = 0; i < size; i++) {
            if (vector[i] != null) {
                if (min == null || vector[i] < min){
                    min = vector[i];
                }
            }
        }

        return min;
    }

    // Retorna a média de todos os elementos
    public double average(){
        double sum = 0;
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (vector[i] != null){
                sum += vector[i];
                count++;
            }
        }

        if(count > 0){
            return sum / count;
        } else {
            System.out.println("Não foi possível calcular a média");
            return 0;
        }

    }

    // Conta a quantidade de elementos diferentes de nulo na lista
    public int count(){
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (vector[i] != null){
                count++;
            }
        }

        return count;
    }

    // Cria um novo vetor com o novo tamanho e copia os elementos do vetor antigo
    // depois substitui o antigo vetor pelo novo
    public void increaseCapacity(int n){
        Integer[] newVector = new Integer[size + n];

        for (int i = 0; i < size; i++) {
            newVector[i] = vector[i];
        }

        this.size += n;
        this.vector = newVector;
    }
}

