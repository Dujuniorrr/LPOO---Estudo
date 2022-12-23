package Questao01;

public class Condutor extends Pessoa{
    private String codHabilitacao;

    public Condutor(String nome, char sexo, int idade, String codHabilitacao) {
        super(nome, sexo, idade);
        this.codHabilitacao = codHabilitacao;
    }

    public void dirigir(Carro carro){
        System.out.println("Condutor: " + getCodHabilitacao() + " dirigindo um carro");
        System.out.println("É um modelo " + carro.getModelo());
        System.out.println("Motor: " + carro.getMotor().getCilindrada());
    }

    public String getCodHabilitacao() {
        return codHabilitacao;
    }

    public void setCodHabilitacao(String codHabilitacao) {
        this.codHabilitacao = codHabilitacao;
    }

}