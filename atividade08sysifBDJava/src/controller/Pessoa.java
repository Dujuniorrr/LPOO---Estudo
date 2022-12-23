package controller;

public class Pessoa {
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private int codCurso;


    public Pessoa(String nome, String endereco, String telefone, int codCurso) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.codCurso = codCurso;
    }

    public Pessoa(int codigo, String nome, String endereco, String telefone, int codCurso) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.codCurso = codCurso;
    }

    public Pessoa(int codigo, String nome, String endereco, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }
}
