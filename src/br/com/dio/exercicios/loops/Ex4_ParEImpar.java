package br.com.dio.exercicios.loops;

import java.util.Scanner;

//Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeros;
        int quantNumeros;
        int numeroImpar = 0, numeroPar = 0;


        System.out.println("Informe a quantidade de números: ");
        quantNumeros = scan.nextInt();
        int count = 0;
        do {
            System.out.println("Informe um número: ");
            numeros = scan.nextInt();

            if ( numeros %2 == 0) numeroPar++;
                    else numeroImpar++;
            count++;
        }
        while (count < quantNumeros);
        System.out.println("Quantidade de números impares digitados: " + numeroImpar);
        System.out.println("Quantidade de números pares digitados: " + numeroPar);
        System.out.println(" P A R A B É N S !! V O C Ê  C O N S E G U I U - C O N T I N U E  A S S I M <3");
    }
}
