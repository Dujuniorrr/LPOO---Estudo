package Questao5;

public class Executa {
   public static void main(String[] args) {
      Cliente c1 = new Cliente("José Bezerra", "josebezerra@gmail.com", "001");
      Cliente c2 = new Cliente("Antonio dos santos", "littlebeck@gmail.com", "002");
      ContaBancaria conta1 = new ContaBancaria(c1, "0001", "LR111", 2000);
      ContaBancaria conta2 = new ContaBancaria(c2, "0002", "FF222", 1000);
      c1.setConta(conta1);
      c2.setConta(conta2);

      c1.visualizarSaldo();
      c2.visualizarSaldo();
      c1.getConta().fazerEmprestimo(c1, 1000, 20);
      c1.visualizarSaldo();
      c1.getConta().realizarTransferencia(c1, c2, "LR111", 2000);
      c1.visualizarSaldo();
      c2.visualizarSaldo();
   }
}
