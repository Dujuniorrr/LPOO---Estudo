package Questao1;

public class Executa {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente.cadastrarCliente();
        cliente.mostrarCliente();
        cliente.alterarCliente();
        cliente.mostrarCliente();

        System.out.println("-----------------------------");

        cliente2.cadastrarCliente();
        cliente2.mostrarCliente();
        cliente2.alterarCliente();
        cliente2.mostrarCliente();

    }
}
