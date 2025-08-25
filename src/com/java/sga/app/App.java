package com.java.sga.app;

import com.java.sga.model.Aluno;
import com.java.sga.model.Professor;

public class App {
    public static void main(String[] args) {
        // Criando um aluno
        Aluno aluno = new Aluno("João Silva", "123456");
        System.out.println(aluno);

        // Criando um professor
        Professor professor = new Professor("Maria Oliveira", "Matemática", "3A");
        System.out.println(professor);
    }
}

