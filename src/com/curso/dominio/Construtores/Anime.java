package com.curso.dominio.Construtores;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String generos;
    private String estudio;

    // Sintaxe para criar um construtor é primeiro o modificador de acesso. ex: public, seguido do nome da classe

    public Anime(String nome, String tipo, int episodios, String generos){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.generos = generos;
    }

    public Anime(String nome, String tipo, int episodios, String generos, String estudio){
        this(nome, tipo, episodios, generos);
        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.generos);
        System.out.println(this.estudio);
    }
}
