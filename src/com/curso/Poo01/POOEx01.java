package com.curso.Poo01;

public class POOEx01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro2 carro2 = new Carro2();

        System.out.println(carro.nome);
        System.out.println(carro.ano);
        System.out.println(carro.modelo);
        System.out.println("-------- Outro modo abaixo: ---------------");
        System.out.println("Nome do carro: " + carro.nome + ", " + "Ano: " + carro.ano + ", " + "Modelo: " + carro.modelo);
        System.out.println("---------------Carro: Golf GTI abaixo: --------------");
        System.out.println("Nome do carro: " + carro2.nome + ", " + "Ano do golf: " + carro2.ano + ", " + "Modelo do golf: " + carro2.modelo);

    }
}
