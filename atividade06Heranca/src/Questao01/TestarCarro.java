package Questao01;

public class TestarCarro {
    public static void main(String[] args) {
        // Motor meuMotor = new Motor("Fiat", 1.4,"Flex");
        // Carro meuCarro =  new Carro("Strada", meuMotor);
        // Condutor condutor = new Condutor("1222");

        // System.out.println("Modelo: " + meuCarro.getModelo() + "\nMotor: " + meuCarro.getMotor().getCilindrada() + "\nCombustivel: " + meuCarro.getMotor().getCombustivel());

        // condutor.dirigir(meuCarro);

        Motor meuMotor = new Motor("Volks", 1.0,"Flex");

        Taxi taxi = new Taxi("Onix", 120, meuMotor, 3500.00, "1245-9", 600);

        System.out.println(taxi.getModelo());
        Condutor condutor = new Condutor("Woquiton", 'M', 42, "1222");
        System.out.println(condutor.getNome());
        System.out.println(condutor.getCodHabilitacao());

    }
}
