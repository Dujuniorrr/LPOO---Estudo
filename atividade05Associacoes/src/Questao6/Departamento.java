package Questao6;

public class Departamento {
    private String id;
    private String nome;
    private Funcionario[] funcionario = new Funcionario[100];
    private Funcionario chefe;
    
    Departamento(){
        setId("000");
        setNome("Vazio");
    }

    Departamento(String id) {
        setId(id);
        setNome("Vazio");
    }

    Departamento(String id, String nome) {
        setId(id);
        setNome(nome);
    }

    Departamento(String id, String nome, Funcionario[] funcionario) {
        setId(id);
        setNome(nome);
        setFuncionario(funcionario);
    }

    Departamento(String id, String nome, Funcionario[] funcionario, Funcionario chefe) {
        setId(id);
        setNome(nome);
        setFuncionario(funcionario);
        setChefe(chefe);
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

    public Funcionario[] getFuncionario() {
        return funcionario;
    }

    public Funcionario getFuncionario(int i) {
        return funcionario[i];
    }

    public void setFuncionario(Funcionario[] funcionario) {
        this.funcionario = funcionario;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }
}
