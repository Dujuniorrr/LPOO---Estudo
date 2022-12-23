package Questao2;

abstract class Contato {
    private String codContato;
    private String nome;
    private String telefone;
    private Endereco endereco;
    
    public Contato() {
        codContato = "nulo"; 
    }

    public Contato(String codContato, String nome, String telefone, Endereco endereco) {
        this.codContato = codContato;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String informarDados(){
        return "null";
    }

    public String getCodContato() {
        return codContato;
    }
    public void setCodContato(String codContato) {
        this.codContato = codContato;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
