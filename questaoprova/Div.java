package questaoprova;

import java.util.Scanner;

public class Div {
    public static void main(String[] args) {  
        var sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        var num = sc.nextInt();
        var num1 = 1;
        while (num1 < num){
            if (num % num1 == 0){
                num1 =+1;      
            }
        }
        System.out.println("O número que divide " + num + " é: " + num1);
    
    }
}
