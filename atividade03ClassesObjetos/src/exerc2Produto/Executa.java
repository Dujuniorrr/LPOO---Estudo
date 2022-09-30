package exerc2Produto;

public class Executa {
    public static void main(String[] args) throws Exception {
        Produto prod = new Produto();
        Produto prod2 = new Produto();

        prod.setNome("feijão");
        System.out.println("Nome do produto: " + prod.getNome());
        prod.setId(1);
        System.out.println("ID do produto: " + prod.getId());
        prod.setPreco(4.50f);
        System.out.println("Preço do produto: " + prod.getPreco());
        prod.addQuant(12);
        prod.addDesconto(20);

        System.out.println("\n");
        prod2.setNome("arroz");
        System.out.println("Nome do produto: " + prod2.getNome());
        prod2.setId(2);
        System.out.println("ID do produto: " + prod2.getId());
        prod2.setPreco(3.50f);
        System.out.println("Preço do produto: " + prod2.getPreco());
        prod2.addQuant(30);
        prod2.addDesconto(50);
    }
}
