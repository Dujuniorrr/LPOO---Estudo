package Questao3;

public class Cantor {
    private String nome;
    private String dataNascimento;
    private String nacionalidade;
    private Album[] albuns = new Album[50];
    private int nmrAlbuns = 0;

    Cantor(String nome){
        setNome(nome);
    }

    Cantor(String nome, String dataDeNascimento){
        setNome(nome);
        setDataNascimento(dataDeNascimento);
    }

    Cantor(String nome, String dataDeNascimento, String nacionalidade){
        setNome(nome);
        setDataNascimento(dataDeNascimento);
        setNacionalidade(nacionalidade);
    }

    Cantor(String nome, String dataDeNascimento, String nacionalidade, Album albuns){
        setNome(nome);
        setDataNascimento(dataDeNascimento);
        setNacionalidade(nacionalidade);
        setAlbuns(albuns);
    }

    Cantor(String nome, String dataDeNascimento, String nacionalidade, Album[] albuns){
        setNome(nome);
        setDataNascimento(dataDeNascimento);
        setNacionalidade(nacionalidade);
        setAlbuns(albuns);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public Album[] getAlbuns() {
        return albuns;
    }

    public Album getAlbuns(int i) {
        return albuns[i];
    }

    public void setAlbuns(Album[] albuns) {
        this.albuns = albuns;
    }

    public void setAlbuns(Album albuns) {
        this.albuns[nmrAlbuns] = albuns;
        setNmrAlbuns(getNmrAlbuns()+1);
    }

    public int getNmrAlbuns() {
        return nmrAlbuns;
    }

    private void setNmrAlbuns(int nmrAlbuns) {
        this.nmrAlbuns = nmrAlbuns;
    }
}
