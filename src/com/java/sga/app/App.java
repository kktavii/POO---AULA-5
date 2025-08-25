package com.java.sga.app;
import com.java.sga.model.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Sistema de Gestão Acadêmica ===");
        
        // Exemplo de criação de aluno interativo
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        
        Aluno aluno = new Aluno(nome, matricula);
        System.out.println("Aluno criado com sucesso!");
        
        scanner.close();
    }
}
