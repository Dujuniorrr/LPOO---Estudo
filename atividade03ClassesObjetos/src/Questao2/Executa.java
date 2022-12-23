package Questao2;

public class Executa {
    public static void main(String[] args) throws Exception {
        Produto prod = new Produto();
        Produto prod2 = new Produto();

        prod.cadastrarProduto();
        prod.comprarProduto();
        prod.alterarProduto();
        prod.mostrarProduto();

        System.out.println("-----------------------------");

        prod2.cadastrarProduto();
        prod2.comprarProduto();
        prod2.alterarProduto();
        prod2.mostrarProduto();

        
    }
}
