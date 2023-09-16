package JAVA.Conceitos.Arrays;

import java.util.Scanner;

public class array2 {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Informe a quantidade de alunos: ");
        int qtd = s.nextInt();
        Double notas[] = new Double[qtd];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a " + (i + i) + "nota: ");
            notas[i] = s.nextDouble();
        }
        double soma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }
        System.out.printf("A média é %.1f\n", soma / notas.length);
    }
}