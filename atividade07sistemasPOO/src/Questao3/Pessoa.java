package Questao3;

abstract class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private Curso curso;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone, Curso curso) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.curso = curso;
    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
      public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
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
}
