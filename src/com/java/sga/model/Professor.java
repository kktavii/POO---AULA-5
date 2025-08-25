package com.java.sga.model;

public class Professor extends Pessoa {
    private String disciplina;
    private String turma;

    // Construtor
    public Professor(String nome, String disciplina, String turma) {
        super(nome);
        this.disciplina = disciplina;
        this.turma = turma;
    }

    // Getters e Setters
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Professor {" + super.toString() + 
               ", Disciplina: " + disciplina + 
               ", Turma: " + turma + "}";
    }
}
