package JAVA.POO.Teste;

import java.util.Scanner;

public class teste {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        aluno aluno1 = new aluno();
        System.out.println("Informe o nome do aluno:");
        aluno1.nome = s.nextLine();

        System.out.println("Informe a idade do aluno:");
         aluno1.idade = Integer.parseInt(s.nextLine());
    }
} 
