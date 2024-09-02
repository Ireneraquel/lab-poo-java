package lab07; 

class TesteBanco {
    public static void main(String[] args) {
        Banco bb = new Banco("Banco do Brasil");
        bb.criarContaCorrente();
        bb.criarContaCorrente();
        bb.criarContaCorrente();

        bb.exibirContas();

        System.out.println("Iniciando deposito...");
        bb.depositarEmConta();
        bb.exibirContas();

        System.out.println("Iniciando o saque");
        bb.sacarEmConta();

        bb.exibirContas();

    }


}