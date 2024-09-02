package lab07;

class ContaCorrente {
    String numeroConta;
    String titular;
    double saldo;

    ContaCorrente(String num, String ti , double s){
        numeroConta = num;
        titular = ti; 
        saldo = s;
    }
    void depositar(double valor){
        if (valor > 0 && saldo >= valor){
            saldo += valor;
        } else{
            System.out.println("Valor invalido.");
        }
    }
    void sacar(double valor){
        if(valor > 0 && saldo >= valor){
            saldo -= valor;
        } else {
            System.out.println("Valor invalido");
        }
    }

    void transferir(ContaCorrente outraConta, double valor){
        if (valor > 0 && saldo >= valor) {
            sacar(valor);
            outraConta.depositar(valor);
        } else{
            System.out.println("Valor invalido");
        }
    }


    // Metodo
    // Recuperar saldo 
    double getSaldo(){
        return saldo;
    }

    String getNumeroConta(){
        return numeroConta;
    }

    void exibirInformacoes(){
        System.out.println("Conta: " + numeroConta + 
        "| Titular: " + titular + 
        "| Saldo: " + saldo);
    }
}