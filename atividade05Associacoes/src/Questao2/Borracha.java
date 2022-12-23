package Questao2;

public class Borracha {
    private float largura;
    private float altura;
    private String marca;
    private String cor;
    private String nmrFabricacao;

    Borracha(){
        setCor("Branca");
        setMarca("Faber Castell");
        setAltura(11.5f);
        setLargura(4f);
    }

    Borracha(String cor, String marca){
        setCor(cor);
        setMarca(marca);
        setAltura(11.5f);
        setLargura(4f);
    }

    Borracha(String cor, String marca, float altura){
        setCor(cor);
        setMarca(marca);
        setAltura(altura);
        setLargura(4f);
    }

    Borracha(String cor, String marca, float altura, float largura){
        setCor(cor);
        setMarca(marca);
        setAltura(altura);
        setLargura(largura);
    }

    public void apagar(Papel papel, int nmrPagina){
        papel.setPaginas(" ", nmrPagina);
        papel.setPaginasEscritas(papel.getPaginasEscritas() - 1);
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNmrFabricacao() {
        return nmrFabricacao;
    }

    public void setNmrFabricacao(String nmrFabricacao) {
        this.nmrFabricacao = nmrFabricacao;
    }

}
