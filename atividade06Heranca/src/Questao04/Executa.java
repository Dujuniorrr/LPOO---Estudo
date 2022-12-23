package Questao04;

public class Executa {
    public static void main(String[] args) {
        Apartamento ap = new Apartamento(200, "Avenida Barão do Rio Branco", 3700, 100, 200, 5, 2, 5, false, true);

        Cliente comprador = new Cliente("Leoncio Gonçalves", "123.456.789-09", "Masculino", 50000);

        Cliente vend = new Cliente("José Bezerra", "987.654.321-08", "Masculino", 27000, ap);

        Questao04.Compra compra = new Compra(vend, comprador, ap);

        System.out.println("COMPRA");
        System.out.println("Vendedor: " + compra.getVendedor().getNome());
        System.out.println("Comprador: " + compra.getComprador().getNome());
        System.out.println("Foi comprado um apartamento com uma area total de " + compra.getApartamento().getAreaTotal() + " ao quadrado.");
        System.out.println("Valor da compra: " + compra.getValorCompra());
    }
}
