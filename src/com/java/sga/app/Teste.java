package com.java.sga.app;

import com.java.sga.model.Aluno;
import com.java.sga.util.Validacoes;

public class Teste {
    public static void main(String[] args) {
        // Testando validações
        System.out.println("Validação de matrícula (12345): " + 
            Validacoes.validarMatricula("12345"));

        // Testando criação de aluno
        Aluno a = new Aluno("Igor Rocha", "987654");
        System.out.println(a);
    }
}
