package br.com.dio.exercicios.loops;

import java.util.Scanner;

//Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
//        Ex.: 5! = 120
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroFatorial;

        System.out.println("Informe um número fatorial: ");
        numeroFatorial = scan.nextInt();

        int fatorial = 1;
        for (int i = numeroFatorial; i >= 1; i--) {

            fatorial = i * fatorial;

        }

        System.out.println("O resultado do fatorial de " + numeroFatorial + " é: " + fatorial);
        System.out.println(" A W E S O M E!   Y O U   G O T  IT");
    }

}
