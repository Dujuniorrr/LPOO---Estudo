package Questao04;

public class Casa extends Terreno{
    private double valorAgua;
    private double valorLuz;
    private int quartos;
    private int banheiros;

    public Casa(double areaTotal, String endereco, double preco, double valorAgua, double valorLuz, int quartos, int banheiros) {
        super(areaTotal, endereco, preco);
        this.valorAgua = valorAgua;
        this.valorLuz = valorLuz;
        this.quartos = quartos;
        this.banheiros = banheiros;
    }

    public double getValorAgua() {
        return valorAgua;
    }

    public void setValorAgua(double valorAgua) {
        this.valorAgua = valorAgua;
    }

    public double getValorLuz() {
        return valorLuz;
    }

    public void setValorLuz(double valorLuz) {
        this.valorLuz = valorLuz;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }
    
}
