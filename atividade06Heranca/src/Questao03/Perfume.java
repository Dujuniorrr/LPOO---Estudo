package Questao03;

public class Perfume {
    private String nomeDeFantasia;
    private String nomeTecnico;
    private String dataDeCriacao;
    private float indiceRetencao;
    private int quantidade;
    private double preco;

    public Perfume(String nomeDeFantasia, String nomeTecnico, String dataDeCriacao, float indiceRetencao, int quantidade, double preco) {
        this.nomeDeFantasia = nomeDeFantasia;
        this.nomeTecnico = nomeTecnico;
        this.dataDeCriacao = dataDeCriacao;
        this.indiceRetencao = indiceRetencao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNomeDeFantasia() {
        return nomeDeFantasia;
    }
    public void setNomeDeFantasia(String nomeDeFantasia) {
        this.nomeDeFantasia = nomeDeFantasia;
    }
    public String getNomeTecnico() {
        return nomeTecnico;
    }
    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }
    public String getDataDeCriacao() {
        return dataDeCriacao;
    }
    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }
    public float getIndiceRetencao() {
        return indiceRetencao;
    }
    public void setIndiceRetencao(float indiceRetencao) {
        this.indiceRetencao = indiceRetencao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
