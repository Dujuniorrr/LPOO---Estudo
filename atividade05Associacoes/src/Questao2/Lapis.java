package Questao2;

public class Lapis {
    private String tipo;
    private float altura;
    private String codigoDeBarras;

    Lapis(){
        setTipo("Graffite");
        setAltura(7);
    }

    Lapis(String tipo){
        setTipo(tipo);
        setAltura(7);
    }

    Lapis(String tipo, float altura){
        setTipo(tipo);
        setAltura(altura);
    }

    public void escrever(Papel papel, String escrita){
        papel.setPaginas(escrita);

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
    
}
