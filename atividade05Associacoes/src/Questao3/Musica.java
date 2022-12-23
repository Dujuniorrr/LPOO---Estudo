package Questao3;

public class Musica {
    private Cantor cantor;
    private Album album;
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

    Musica(String nome, Cantor cantor){
        setNome(nome);
        setCantor(cantor);
        setDuracao(0);
        setLetra("Sem letra.");
    }

    Musica(String nome, Cantor cantor, Album album){
        setNome(nome);
        setCantor(cantor);
        setAlbum(album);
        setDuracao(0);
        setLetra("Sem letra.");
    }

    Musica(String nome, Cantor cantor, Album album, float duracao){
        setNome(nome);
        setCantor(cantor);
        setAlbum(album);
        setDuracao(duracao);
        setLetra("Sem letra.");
    }

    Musica(String nome, Cantor cantor, Album album, float duracao, String letra){
        setNome(nome);
        setCantor(cantor);
        setAlbum(album);
        setDuracao(duracao);
        setLetra(letra);
    }

    public Cantor getCantor() {
        return cantor;
    }

    public void setCantor(Cantor cantor) {
        this.cantor = cantor;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
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
