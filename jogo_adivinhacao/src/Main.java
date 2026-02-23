/*
Crie um programa que simula um jogo de adivinhação, que deve gerar um
número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o
número, em até 5 tentativas. A cada tentativa, o programa deve informar se o
número digitado pelo usuário é maior ou menor do que o número gerado.
 */

import java.util.Random;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(101);
        int tentativas = 0;
        int x;
        System.out.println("Seja Bem-Vindo (a) ao Jogo DESCUBRA O NÚMERO MÁGICO!");
        System.out.println("Antes de começarmos, qual é o seu nome?");
        String nome = sc.next();
        System.out.println("Olá, " + nome);
        System.out.println("Você terá 5 tentativas para descobrir o número mágico. Ele está no intervalo entre 0 e 100");

        while(tentativas < 5){

            System.out.println("Qual é o número mágico? ");
            x = sc.nextInt();


            if(x <= 100){
                if(x != numeroAleatorio){
                    if(x > numeroAleatorio){
                        System.out.println("Errou! O número aleatório é menor");
                        System.out.println("Tente novamente!");
                    } else {
                        System.out.println("Errou! O número aleatório é maior.");
                        System.out.println("Tente novamente!");
                    }
                } else {
                    System.out.println("Você acertou! Parabéns!");
                    break;
                }
            } else {
                System.out.println("Número inválido! Tente novamente!");
            }





            tentativas++;

        }

        if (tentativas == 5) {
            System.out.println("GAME OVER!");
            System.out.println("O número mágico era: " + numeroAleatorio);
        }

        sc.close();

    }

}