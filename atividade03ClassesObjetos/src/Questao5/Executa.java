package Questao5;

public class Executa {
    public static void main(String[] args) throws Exception {
        ContaCorrente conta = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        
        conta.cadastrarConta();
        conta.fazerEmprestimo();
        conta.realizarTransferencia();

        conta2.cadastrarConta();
        conta2.fazerEmprestimo();
        conta2.realizarTransferencia();
    }
}
