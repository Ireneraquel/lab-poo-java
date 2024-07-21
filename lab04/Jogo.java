package lab04;

import java.util.Scanner;

public class Jogo {
    // java lab04/Jogo.java
    public static void main(String[] args) {

        /**
         * while
         * Executa um bloco de código enquanto uma condição específica for verdadeira.
         */

        var sc = new Scanner(System.in);
        var num = 15;
        var ten = 0;
        var usu_n = 0;
        System.out.println("Bem-vindo ao jogo!");

        while (num != usu_n) {
            System.out.print("Digite um número? ");
            usu_n = sc.nextInt();
            ten ++;
            if (num > usu_n) {
                System.out.println("O número sorteado é maior"); 
            } else if(num < usu_n) {
                System.out.println("O número sorteado é menor");  
            } else {
                System.out.println("Parabéns! Você acertou o número! ");
                System.out.println("Número de tentativas que você realizou foi: "+ ten);
            }
        }

    }   
}
