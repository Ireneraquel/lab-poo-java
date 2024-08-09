package lab07;

public class ContaCorrente{
    String usuario;
    String senha;
    double saldo; 
    String agencia;

    // int, boolean, char, flout, double 

    String realizarExtrato(){
        return "Seu saldo é" + saldo;
    }
    void depositar(double valor){
        saldo += valor;
    }
    
}