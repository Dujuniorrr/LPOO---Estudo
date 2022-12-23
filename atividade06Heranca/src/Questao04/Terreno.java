package Questao04;

public class Terreno {
    private double areaTotal;
    private String endereco;
    private double preco;
    
    public Terreno(double areaTotal, String endereco, double preco) {
        this.areaTotal = areaTotal;
        this.endereco = endereco;
        this.preco = preco;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }


}
