package Questao03;

public class Executa {
    
    public static void main(String[] args) {
        String[] produto = {"fragancia", "quimico", "n sei"};
        String[] insumo = {"rosas", "plantas aromaticas", "n sei"};

        PerfumeNatural perfN = new PerfumeNatural("Golden Double", null, "GOLDEN2022/11", 200, 20, 20, insumo);

        PerfumeSintetico perfS = new PerfumeSintetico("ExampleMAN", null, "EXAMPLEMAN2022/10", 400, 40, 19, produto, 0.3f);

        Consultor consultor = new Consultor("José Carlos", "123.456.789-09", "Masculino", 2000, 2001);

        Compra compra = new Compra();

        System.out.println(consultor.getSaldo());
        compra.realizarCompra(consultor, perfN, "7/11/2022", 3);
        
        System.out.println(consultor.getSaldo());
        compra.realizarCompra(consultor, perfN, "7/11/2022", 3);
        
        System.out.println(consultor.getSaldo());
        compra.realizarCompra(consultor, perfS, "7/11/2022", 2);

        System.out.println(consultor.getSaldo());
        compra.realizarCompra(consultor, perfS, "7/11/2022", 9);

        compra.realizarCompra(consultor, perfS, "7/11/2022", 1);

        System.out.println(consultor.getSaldo());
     }
}
