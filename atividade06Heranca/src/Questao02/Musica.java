package Questao02;

public class Musica {
    private String nome;
    private float duracao;
    private String letra;
    
    Musica(){
        setDuracao(0);
        setLetra("Sem letra.");
    }

    Musica(String nome){
        setNome(nome);
        setDuracao(0);
        setLetra("Sem letra.");
    }

    Musica(String nome, float duracao){
        setNome(nome);
        setDuracao(duracao);
        setLetra("Sem letra.");
    }

    Musica(String nome, float duracao, String letra){
        setNome(nome);
        setDuracao(duracao);
        setLetra(letra);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}
