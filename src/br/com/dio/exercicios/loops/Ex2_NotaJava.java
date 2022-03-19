package br.com.dio.exercicios.loops;

//Faça um programa que peça uma nota, entre zero e dez.
//        Mostre uma mensagem caso o valor seja inválido.
//        Cavalcante, 8/24/21, 7:43 PM. first commit
//        e continue pedindo até que o usuário informe um valor válido.

import java.util.Scanner;

public class Ex2_NotaJava {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Insira uma nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10){

            System.out.println("Seu número é inválido, por favor escolher uma nota entre 0 e 10!");
            nota = scan.nextInt();
        }
                   System.out.println("Você escolher o número: " + nota);

    }

}
