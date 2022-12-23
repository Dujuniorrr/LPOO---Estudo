package Questao1;

abstract class Pessoa {
    private String nome;
    private String dtNascimento;
    private Endereco endereco;
    
    public Pessoa() {
        
    }
    
    public Pessoa(String nome, String dtNascimento, Endereco endereco) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDtNascimento() {
        return dtNascimento;
    }
    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
