package Questao04;

public class Vendedor {
    private String nome;
    private String cpf;
    private String sexo;
    private double saldo;
    private Terreno[] terreno = new Terreno[100];
    private Casa[] casa = new Casa[100];
    private Apartamento[] ap = new Apartamento[100];

    public Vendedor(String nome, String cpf, String sexo, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.saldo = saldo;
    }

    public Vendedor(String nome, String cpf, String sexo, double saldo, Terreno[] terreno) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.saldo = saldo;
        this.terreno = terreno;
    }

    public Vendedor(String nome, String cpf, String sexo, double saldo, Casa[] casa) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.saldo = saldo;
        this.casa = casa;
    }


    public Vendedor(String nome, String cpf, String sexo, double saldo, Apartamento[] apartamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.saldo = saldo;
        this.ap = apartamento;
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

    public Terreno[] getTerreno() {
        return terreno;
    }

    public void setTerreno(Terreno[] terreno) {
        this.terreno = terreno;
    }

    public Casa[] getCasa() {
        return casa;
    }

    public void setCasa(Casa[] casa) {
        this.casa = casa;
    }

    public Apartamento[] getAp() {
        return ap;
    }

    public void setAp(Apartamento[] ap) {
        this.ap = ap;
    }
}
