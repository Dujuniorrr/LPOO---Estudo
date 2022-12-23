package Questao04;

public class Apartamento extends Casa{
    private int andar;
    private boolean sacada;
    private boolean interfone;
    
    public Apartamento(double areaTotal, String endereco, double preco, double valorAgua, double valorLuz, int quartos, int banheiros, int andar, boolean sacada, boolean interfone) {
        super(areaTotal, endereco, preco, valorAgua, valorLuz, quartos, banheiros);
        this.andar = andar;
        this.sacada = sacada;
        this.interfone = interfone;
    }

    public int getAndar() {
        return andar;
    }
    public void setAndar(int andar) {
        this.andar = andar;
    }
    public boolean isSacada() {
        return sacada;
    }
    public void setSacada(boolean sacada) {
        this.sacada = sacada;
    }
    public boolean isinterfone() {
        return interfone;
    }
    public void setinterfone(boolean interfone) {
        this.interfone = interfone;
    }

}
