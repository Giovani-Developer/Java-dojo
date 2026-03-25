package com.curso.dominio.BlocosDeInicialização.test;

import com.curso.dominio.BlocosDeInicialização.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");

        }
    }
}
