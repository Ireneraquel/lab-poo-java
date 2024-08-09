package questaoprova;

import java.util.Scanner;


public class Div {
    public static void main(String[] args) {  
        var sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        var n1 = sc.nextInt();
        var div = 0;
        var i = 1; 

        while (i <= n1)
            if (n1 % i == 0){
                div ++;
            } 
    System.out.println("O número que divide " + n1 + " é: " + i);
        
    }
}
