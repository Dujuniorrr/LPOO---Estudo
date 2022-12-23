package Questao04;

public class Compra {
    private Cliente vendedor;
    private Cliente comprador;
    private Terreno terreno;
    private Casa casa;
    private Apartamento apartamento;
    private double valorCompra;

    public Compra(Cliente vendedor, Cliente comprador, Terreno terreno) {
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.terreno = terreno;
        this.valorCompra = terreno.getPreco();
    }

    public Compra(Cliente vendedor, Cliente comprador, Casa casa) {
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.casa = casa;
        this.valorCompra = casa.getPreco();
    }

    public Compra(Cliente vendedor, Cliente comprador, Apartamento apartamento) {
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.apartamento = apartamento;
        this.valorCompra = apartamento.getPreco();
    }
        
    public Cliente getVendedor() {
        return vendedor;
    }
    public void setVendedor(Cliente vendedor) {
        this.vendedor = vendedor;
    }
    
    public Cliente getComprador() {
        return comprador;
    }
    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }
    public Terreno getTerreno() {
        return terreno;
    }
    public void setTerreno(Terreno terreno) {
        this.terreno = terreno;
    }
    public Casa getCasa() {
        return casa;
    }
    public void setCasa(Casa casa) {
        this.casa = casa;
    }
    public Apartamento getApartamento() {
        return apartamento;
    }
    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }
    public double getValorCompra() {
        return valorCompra;
    }
    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
}
