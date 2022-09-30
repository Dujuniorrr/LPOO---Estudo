package exerc1Cliente;

public class Executa {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente.setNome("Jão");
        cliente.setIdade(18);
        cliente.setId(1);
        cliente.setCupom(20);
        cliente.addCarteira(20000);

        System.out.println(cliente.getNome());
        System.out.println(cliente.getIdade());
        System.out.println(cliente.getId());
        System.out.println(cliente.getCupom());
        System.out.println(cliente.getCarteira());

        cliente.setCupom(-1);
        cliente.retireCarteira(21000);
        cliente.addCarteira(-1);
        cliente.addCarteira(5100000);

        System.out.println('\n');

        cliente2.setNome("ana");
        cliente2.setIdade(31);
        cliente2.setId(2);
        cliente2.setCupom(30);
        cliente2.addCarteira(30000);

        System.out.println(cliente2.getNome());
        System.out.println(cliente2.getIdade());
        System.out.println(cliente2.getId());
        System.out.println(cliente2.getCupom());
        System.out.println(cliente2.getCarteira());

    }
}
