package Questao6;

public class Funcionario {
    private String id;
    private String nome;
    private double salario;

    Funcionario(){
        setNome("Vazio");
        setId("000");
        setSalario(0);
    }

    Funcionario(String nome){
        setNome(nome);
        setId("000");
        setSalario(0);
    }

    Funcionario(String nome, String id){
        setNome(nome);
        setId(id);
        setSalario(0);
    }

    Funcionario(String nome, String id, double salario){
        setNome(nome);
        setId(id);
        setSalario(salario);
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
