package exerc10ClienteCRUD;

public class Executa {
    public static void main(String[] args) throws Exception {
        Cliente[] cliente = new Cliente[100];
        Dashboard painel = new Dashboard();

        painel.inserir(cliente);
        painel.pesquisar(cliente);
        painel.alterar(cliente);
        painel.deletar(cliente);
    }
}
