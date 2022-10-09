package Questao6;

public class Executa {
    public static void main(String[] args) throws Exception {
        ContaPoupanca conta = new ContaPoupanca();

        conta.cadastrarConta();
        conta.fazerSaque();
        conta.realizarTransferencia();
        conta.realizarExtrato();

        
    }
}
