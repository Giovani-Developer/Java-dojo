package com.curso.dominio.Construtores.test;


import com.curso.dominio.Construtores.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Anime", "Anime", 10, "Genero anime", "Production ID");
        anime.imprime();

    }
}
