package com.java.sga.model;

public class Aluno extends Pessoa {
    private String matricula;

    // Construtor
    public Aluno(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno {" + super.toString() + ", Matrícula: " + matricula + "}";
    }
}
