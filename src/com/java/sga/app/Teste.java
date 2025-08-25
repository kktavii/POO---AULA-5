package com.java.sga.app;
import com.java.sga.model.*;

public class Teste {
    public static void main(String[] args) {
        // Teste 1: Criar e testar Aluno
        System.out.println("=== Teste Aluno ===");
        Aluno aluno = new Aluno("João Silva", "2024001");
        aluno.adicionarNota(8.5);
        aluno.adicionarNota(7.0);
        aluno.adicionarNota(9.0);
        System.out.println("Média: " + aluno.calcularMedia());
        
        // Teste 2: Criar e testar Professor
        System.out.println("=== Teste Professor ===");
        Professor prof = new Professor("Dr. Maria", "POO", "Turma A");
        System.out.println("Professor criado: " + prof.getNome());
    }
}