package com.aposentaria;

import java.util.Scanner;

public class Aposentadoria {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite seu nome:");
        String nome = leia.nextLine();

        System.out.print("Digite seu sexo M/F: ");
        String genero = leia.nextLine();

        System.out.print("Digite sua idade:");
        int idade = leia.nextInt();

        System.out.print("Digite o tempo de contribuição: ");
        int tempo = leia.nextInt();

        if (genero.equals("m")) {
            if (idade >= 65 && tempo >= 20) {
                System.out.println("VOCÊ PODE SE APOSENTAR!!");
            } else {
                System.out.println("Você não pode se aposentar!!");
            }
        } else if (genero.equals("f")) {
            if (idade >= 60 && tempo >= 15) {
                System.out.println("VOCÊ PODE SE APOSENTAR!!");
            } else {
                System.out.println("Você não pode se aposentar!!");
            }
        } else {
            System.out.println("");
        }

        System.out.println("saiu");

    }

}
