package lab03;

import java.util.Scanner;

public class Conceitoif {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
        System.out.print("Digite a nota:");
        var nota = sc.nextDouble();
        if (nota > 100){ 
            System.out.println("Não existe conceito para valores maiores que 100!");
        }   else if  (nota >=91  ) {
                System.out.println("Conceito A");
        }   else if (nota >= 81) {
                System.out.println("Conceito B");
        }   else if (nota >= 71) {
                System.out.println("Conceito C");
        }   else if (nota >= 61) {
                System.out.println("Conceito D");
        }   else if (nota <= 60) {
                System.out.println("Conceito E");
        }

        sc.close();
    }
}
