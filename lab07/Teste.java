package lab07;

class Teste{

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("123", "Elias", 5000);

        ContaCorrente conta2 = new ContaCorrente("321", "Fernanda", 1000);

        System.out.println("Informações iniciais");
        conta1.exibirInformacoes();
        conta2.exibirInformacoes();
        
        conta2.transferir(conta1, 1000);
        System.out.println("Informações das contas após transferencia");
        conta1.exibirInformacoes();
        conta2.exibirInformacoes();
    }
}