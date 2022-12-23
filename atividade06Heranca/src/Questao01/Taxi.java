package Questao01;

public class Taxi extends Carro{

    private String licenca;
    private double taxaAnual;

    public Taxi(String modelo, int velocidadeMaxima, Motor motor, double preco, String licenca, double taxaAnual){

        super(modelo, motor, velocidadeMaxima, preco);
        setLicenca(licenca);
        setTaxaAnual(taxaAnual);
    }

    public String getLicenca() {
        return licenca;
    }

    public void setLicenca(String licenca) {
        this.licenca = licenca;
    }

    public double getTaxaAnual() {
        return taxaAnual;
    }

    public void setTaxaAnual(double taxaAnual) {
        this.taxaAnual = taxaAnual;
    }

}  
