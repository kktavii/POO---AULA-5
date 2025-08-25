package com.java.sga.util;

public class Validacoes {
    
    // Construtor privado para evitar instanciação
    private Validacoes() {}

    // Validação básica para nome (não pode ser nulo ou vazio)
    public static boolean validarNome(String nome) {
        return nome != null && !nome.trim().isEmpty();
    }

    // Validação para matrícula (não pode ser nula ou vazia)
    public static boolean validarMatricula(String matricula) {
        return matricula != null && !matricula.trim().isEmpty();
    }

    // Validação para disciplina (não pode ser nula ou vazia)
    public static boolean validarDisciplina(String disciplina) {
        return disciplina != null && !disciplina.trim().isEmpty();
    }

    // Validação para turma (não pode ser nula ou vazia)
    public static boolean validarTurma(String turma) {
        return turma != null && !turma.trim().isEmpty();
    }

    // Validação para notas (deve estar entre 0 e 10)
    public static boolean validarNota(double nota) {
        return nota >= 0.0 && nota <= 10.0;
    }

    // Validação para objetos não nulos (genérica)
    public static boolean validarObjeto(Object obj) {
        return obj != null;
    }
}
