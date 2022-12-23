package Questao03;

public class Comprador {
    private String nome;
    private String cpf;
    private String sexo;
    private double saldo;
    private int pontos;

    public Comprador(String nome, String cpf, String sexo, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.saldo = saldo;
        this.pontos = 10;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getcpf() {
        return cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = getPontos() + pontos;
        if(this.pontos > 1000){
            this.pontos = 1000;
        }
    }
}
