package questaoprova;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {  
        var sc = new Scanner(System.in);

        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Escolha uma operação: ");
        var opr = sc.nextInt();
        System.out.print("Escolha um número: ");
        var num = sc.nextInt();
        System.out.print("Escolha outro número: ");
        var num1 = sc.nextInt();
    
        var ad = num + num1;
        var su = num - num1;
        var mu = num * num1;
        var di = num / num1;

        
        switch (opr) {
            case 1 -> System.out.println(num + " + " + num1 + " = " + ad);
            case 2 -> System.out.println(num + " - " + num1 + " = " + su);
            case 3 -> System.out.println(num + " x " + num1 + " = " + mu);
            case 4 -> System.out.println(num + " ÷ " + num1 + " = " + di);
        } 
    
    }
}
