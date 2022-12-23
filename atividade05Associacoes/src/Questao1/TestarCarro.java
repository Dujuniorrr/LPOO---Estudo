package Questao1;

public class TestarCarro {
    public static void main(String[] args) {
        Motor meuMotor = new Motor("Fiat", 1.4,"Flex");
        Carro meuCarro =  new Carro("Strada", meuMotor);
        Condutor condutor = new Condutor("1222");

        System.out.println("Modelo: " + meuCarro.getModelo() + "\nMotor: " + meuCarro.getMotor().getCilindrada() + "\nCombustivel: " + meuCarro.getMotor().getCombustivel());

        condutor.dirigir(meuCarro);

    }
}
