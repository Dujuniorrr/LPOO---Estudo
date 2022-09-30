package exerc6ContaPoupanca;

public class Executa {
    public static void main(String[] args) throws Exception {
        ContaPoupanca conta = new ContaPoupanca();

        conta.setCpf("123.456.789-10");
        System.out.println("\nCPF: " + conta.getCpdf());
        conta.setDinheiroDepositado(400);
        System.out.println("\nDinheiro depositado: " + conta.getDinheiroDepositado());
        conta.addTransferencia(100);
        conta.addTransferencia(100);
        conta.addTransferencia(100);
        conta.addSaque(100);
        conta.extrato();

        ContaPoupanca conta2 = new ContaPoupanca();

        conta2.setCpf("222.333.777-09");
        System.out.println("\nCPF: " + conta2.getCpdf());
        conta2.setDinheiroDepositado(1000);
        System.out.println("\nDinheiro depositado: " + conta2.getDinheiroDepositado());
        conta2.addTransferencia(50);
        conta2.addTransferencia(300);
        conta2.addTransferencia(50);
        conta2.addSaque(100);
        conta2.extrato();
        conta2.extrato();
        conta2.extrato();
    }
}
