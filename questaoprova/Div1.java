package questaoprova;

import java.util.Scanner;

public class Div1 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.print("Digite um número:");
        var n1 = sc.nextInt();
        int div = 0;

        for (int i = 1; i <= n1; i++)          
            if (n1 % i == 0){
                div ++;
            }
        
    System.out.println("O número "+ n1 + "possui"+ div + "divisores");
    }
}
