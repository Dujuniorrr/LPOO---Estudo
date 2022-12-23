package Questao3;

public class Album {
    private String nome;
    private String anoLancamento;
    private Cantor cantor;
    private Musica[] musicas = new Musica[25];

    Album(String nome){
        setNome(nome);
    }

    Album(String nome, String anoLancamento){
        setNome(nome);
        setAnoLancamento(anoLancamento);
    }

    Album(String nome, String anoLancamento, Cantor cantor){
        setNome(nome);
        setAnoLancamento(anoLancamento);
        setCantor(cantor);
    }

    Album(String nome, String anoLancamento, Cantor cantor, Musica musica){
        setNome(nome);
        setAnoLancamento(anoLancamento);
        setCantor(cantor);
        setMusicas(musicas);
    }

    public void visualizarMusicas(){
        int cont = 0;
        for(Musica M: musicas){
            cont++;
            System.out.println("\nMusica" + cont);
            System.out.println("Nome: " + M.getNome());
            System.out.println("Duracao: " + M.getDuracao());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Cantor getCantor() {
        return cantor;
    }

    public void setCantor(Cantor cantor) {
        this.cantor = cantor;
    }

    public Musica[] getMusicas() {
        return musicas;
    }

    public Musica getMusicas(int indice) {
        return musicas[indice];
    }

    public void setMusicas(Musica[] musicas) {
        this.musicas = musicas;
    }

}
