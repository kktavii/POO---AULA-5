package com.java.sga.model;
import com.java.sga.util.Validacoes;
// Contrutores
public class Professor extends Pessoa {
    private String disciplina;
    private String turma;
    
    public Professor(String nome, String disciplina, String turma) {
        super(nome);
        setDisciplina(disciplina);
        setTurma(turma);
    }
    
    // Getters e Setters 
    public void setDisciplina(String disciplina) {
        if (Validacoes.isDisciplinaValida(disciplina)) {
            this.disciplina = disciplina;
        }
    }
}
