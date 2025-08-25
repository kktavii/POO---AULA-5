package com.java.sga.model;
import com.java.sga.util.Validacoes;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String matricula;
    private List<Double> notas;
    
    public Aluno(String nome, String matricula) {
        super(nome);
        setMatricula(matricula);
        this.notas = new ArrayList<>();
    }

    
    public void adicionarNota(double nota) {
        if (Validacoes.isNotaValida(nota)) {
            notas.add(nota);
        }
    }
    
    public double calcularMedia() {
        return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }
}
