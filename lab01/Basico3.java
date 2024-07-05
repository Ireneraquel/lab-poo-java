package lab01;

public class Basico3 {
    // Executando no terminal:
    // java lab01/Basico3.java
    public static void main(String[] args) {

        /**
         * Os operadores aritméticos são usados para realizar operações matemáticas
         * comuns, como adição, subtração, multiplicação, divisão e módulo.
         */
        int a = 100;
        int b = 20;
        System.out.println("a + b = " + (a + b)); // 30
        System.out.println("a - b = " + (a - b)); // -10
        System.out.println("a * b = " + (a * b)); // 200
        System.out.println("a / b = " + (a / b)); // 0
        System.out.println("a % b = " + (a % b)); // 10

        /**
         * Os operadores lógicos são usados para combinar múltiplas condições booleanas.
         * Eles retornam valores booleanos (true ou false).
         */
        boolean x = true;
        boolean y = false;
        System.out.println("x && y = " + (x && y)); // false and
        System.out.println("x || y = " + (x || y)); // true or 
        System.out.println("!x = " + (!x)); // false Negação 

        /**
         * Os operadores relacionais são usados para comparar dois valores. Eles
         * retornam valores booleanos (true ou false).
         */
        System.out.println("a == b = " + (a == b)); // false
        System.out.println("a != b = " + (a != b)); // true
        System.out.println("a > b = " + (a > b)); // false
        System.out.println("a < b = " + (a < b)); // true
        System.out.println("a >= b = " + (a >= b)); // false
        System.out.println("a <= b = " + (a <= b)); // true

    }
}