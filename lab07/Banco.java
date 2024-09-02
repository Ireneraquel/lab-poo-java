package  lab07;
import java.util.ArrayList;
import java.util.Scanner;

class Banco {
    String nome;
    ArrayList<ContaCorrente> contas;

    Banco(String n){
        nome = n;
        //  Criar lista 
        contas = new ArrayList<ContaCorrente>();
    }

    void criarContaCorrente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome titular: ");
        String titular = sc.next();
        System.out.println("Digite o nome da conta: ");
        String numeroConta = sc.next();

        ContaCorrente conta = new ContaCorrente(numeroConta, titular, 0);
        contas.add(conta);
    }

    void exibirContas(){
        //dentro da lista contas, vou chamar as posições 
        for(ContaCorrente c: contas){
            c.exibirInformacoes();
        }
    }
    ContaCorrente buscarConta(String n){
        for (ContaCorrente conta: contas) {
            if(conta.numeroConta.equals(n)){
                return conta;
            }   
        }
        return null;
    }

    void depositarEmConta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta:");
        String n = sc.next();
        System.out.println("Digite o valor para depositar:");
        double valor = sc.nextDouble();

        ContaCorrente conta = buscarConta(n);
        conta.depositar(valor);
    }

    void sacarEmConta() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual é o número da conta?");
        String n2 = sc.next();

        System.out.println("Qual é o valor que voce que sacar?");
        double v2 = sc.nextDouble();

        ContaCorrente conta = buscarConta(n2);
        var zero = 0;
        if ( conta.saldo != zero){
            conta.sacar(v2);
        }
        else{
            System.out.println("Não tem saldo suficiente");
        }
        

    }

    
   


}
