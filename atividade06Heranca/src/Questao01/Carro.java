package Questao01;

public class Carro {

    private String modelo; // pode ser uma ferrari, um chevet, maverik…
    private int velocidadeMaxima;
    private int velocidadeAtual;
    private Motor motor;
    private Double preco;

    public Carro() { // método construtor
        this.modelo = "Carro Qualquer";
        this.velocidadeMaxima = 120;
        this.velocidadeAtual = 0;
    }

    public Carro(String modelo, Motor motor){
        this.modelo = modelo;
        this.motor = motor;
    }

    public Carro(String modelo, Motor motor, int velocidadeMaxima, double preco){
        this.modelo = modelo;
        this.motor = motor;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
    }
    
    public void ligarCarro() {
    
        System.out.println("O carro está ligado.");
    
    }
    
    public void desligarCarro() {
    
        System.out.println("O carro está desligado.");
    
    }
    
    public void acelera(int veloc) {
    
    // verifica se a velocidade adicionada não ultrapassa a
    //velocidade maxima do carro
    
        if (this.velocidadeAtual + veloc <= this.velocidadeMaxima) {
    
            this.velocidadeAtual += veloc;
    
            System.out.println("acelerando, Velocidade Atual: " + this.velocidadeAtual);
    
    // this -> indica que é a variavel privada da classe      
    
        }else {
    
            this.velocidadeAtual = this.velocidadeMaxima;
            System.out.println("Velocidade maxima atingida! \n"+	"Velocidade atual: "+this.velocidadeAtual);
    
        }
    }
    
    
    public void reduzir(int veloc) {
    
        if (this.velocidadeAtual - veloc > 0) {
    
            this.velocidadeAtual -= veloc;
            System.out.println("reduzindo, Velocidade Atual: " + this.velocidadeAtual);
        } else {
    
        pararCarro();
    
        }
    }
    
    public void pararCarro() {
    
        this.velocidadeAtual = 0;
        System.out.println("O carro parou, Velocidade Atual: "+this.velocidadeAtual);
    
    }
    
    public void setModelo(String modelo) {
    
        this.modelo = modelo;
    
    }
    
    public String getModelo() { // esqueci desse no diagrama
        
        return this.modelo;
    
    }
    
    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}