package br.com.dio.exercicios.loops;

//Faça um programa que leia 5 números e informe o maior número e a média desses números.
//

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int numero;
        int count = 0;
        int soma = 0;
        int maior = 0;

        do {
            System.out.println("Informe um número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior ) maior = numero;
            count = ++count;

        } while (count < 5);
        System.out.println("O maior número digitado, foi: " + maior);
        System.out.println("A média dos número digitados foi: " + (soma/5));
        System.out.println("T H A N K    Y O U ! ! !");
    }
}
