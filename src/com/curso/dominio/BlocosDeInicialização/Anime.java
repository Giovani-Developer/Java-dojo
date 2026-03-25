package com.curso.dominio.BlocosDeInicialização;

import org.w3c.dom.ls.LSOutput;

public class Anime {

    private String nome;
    private int[] episodios;
    // 1 - alocado espaço em memoria pro objeto
    // 2 - cada atributo de classe é inicializado com valores default ou com o que for passado
    // 3 - Bloco de inicializacao é executado
    // 4 - Construtor é inicializado
    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }


    public Anime() {
        for (int episodio: this.episodios) {
            System.out.print(episodio + "  ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
