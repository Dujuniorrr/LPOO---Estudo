package Questao1;

public class Endereco {
    private String estado;
    private String rua;
    private String bairro;
    private int numero;

    public Endereco() {
    }

    public Endereco(String estado, String rua, String bairro, int numero) {
        this.estado = estado;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }
    
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
