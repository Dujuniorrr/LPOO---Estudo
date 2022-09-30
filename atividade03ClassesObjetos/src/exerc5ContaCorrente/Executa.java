package exerc5ContaCorrente;

public class Executa {
    public static void main(String[] args) throws Exception {
        ContaCorrente conta = new ContaCorrente();
        
        conta.setCpf("123.456.789-10");
        System.out.println("\nCPF: " + conta.getCpdf());
        conta.setDinheiroDepositado(1000);
        System.out.println("\nDinheiro depositado: " + conta.getDinheiroDepositado());
        conta.addEmprestimo(1000,10);
        System.out.println("\nDinheiro depositado: " + conta.getDinheiroDepositado());
        conta.addTransferencia(100);
        System.out.println("\nDinheiro depositado: " + conta.getDinheiroDepositado());
        
        System.out.println("\n------------------------\n");
        
        ContaCorrente conta2 = new ContaCorrente();
        
        conta2.setCpf("109.876.543-21");
        System.out.println("\nCPF: " + conta2.getCpdf());
        conta2.setDinheiroDepositado(2500);
        System.out.println("\nDinheiro depositado: " + conta2.getDinheiroDepositado());
        conta2.addEmprestimo(15000,15);
        System.out.println("\nDinheiro depositado: " + conta2.getDinheiroDepositado());
        conta2.addTransferencia(1000f);
        System.out.println("\nDinheiro depositado: " + conta2.getDinheiroDepositado());
        
    }
}
