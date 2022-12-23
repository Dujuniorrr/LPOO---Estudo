package Questao2;

public class Executa {
    
    public static void main(String[] args) throws InterruptedException {
        Carro car = new Carro();

        car.cadastrar();
        car.visualizar();
        car.ligar();
        car.desligar();
        car.acelerar();
        car.ligar();
        car.acelerar();
        car.acelerar();
        car.frear();
        car.frear();
    }
}
