package com.curso;

public class ProfessorTest01 {
    public static void main(String[] args) {


        Professor professor = new Professor();

        professor.nome = "Mestre Kami";
        professor.idade = 1000;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}