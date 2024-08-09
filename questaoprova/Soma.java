package questaoprova;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        var n1 = sc.nextInt();
        System.out.print("Digite o segundo número:");
        var n2 = sc.nextInt();

        int soma = 0;

        for (int i = n1; i <= n2; i++)          
                soma += i;
        
    System.out.println("O resultado da soma dos números do intervalo com os extremos é "+ soma );
    }
}
