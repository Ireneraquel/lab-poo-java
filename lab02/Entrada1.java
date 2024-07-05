package lab02;
public class Entrada1 {
    // Não execute no 'Run'. Execute no Terminal
    // java 02-argumentos/Argumentos1.java romulo
    public static void main(String[] args) {
        var number0 = Integer.parseInt(args[0]);
        var number1 = Integer.parseInt(args[1]);
        var soma = number0 + number1;
        System.out.println("A some é: " + soma );
    }
}
