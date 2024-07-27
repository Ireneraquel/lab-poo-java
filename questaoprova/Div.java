package questaoprova;

import java.util.Scanner;


public class Div {
    public static void main(String[] args) {  
        var sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        var n = sc.nextInt();
        var div = 1;
        var i = 1; 

        while (i <= n)
            if (n % i == 0){
                i ++;
            } 
         System.out.println("O número que divide " + n + " é: " + i);
    
    }
}
