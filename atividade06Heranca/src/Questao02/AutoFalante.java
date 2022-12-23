package Questao02;

public class AutoFalante {
    
    private String codFabricante;
    private String modeloQuadriaxial;
    private int frequencia; //hz
    private int sensibilidade; //db 
    private String cor;
    private boolean ligado;
    private boolean conectado;
    private String tipoEntrada;

    public AutoFalante(){
        this.codFabricante = "0001";
        this.modeloQuadriaxial = "SH.601";
        this.frequencia = 200;
        this.sensibilidade = 90;
        this.cor = "Preto";
        this.ligado = false;
        this.conectado = false;
        this.tipoEntrada = "Tipo P3";
    }

    public AutoFalante(String codFabricante) {
        this.codFabricante = codFabricante;
        this.modeloQuadriaxial = "SH.601";
        this.frequencia = 200;
        this.sensibilidade = 90;
        this.cor = "Preto";
        this.ligado = false;
        this.conectado = false;
        this.tipoEntrada = "Tipo P3";
    }

    public AutoFalante(String codFabricante, String modeloQuadriaxial) {
        this.codFabricante = codFabricante;
        this.modeloQuadriaxial = modeloQuadriaxial;
        this.frequencia = 200;
        this.sensibilidade = 90;
        this.cor = "Preto";
        this.ligado = false;
        this.conectado = false;
        this.tipoEntrada = "Tipo P3";
    }
    
    public AutoFalante(String codFabricante, String modeloQuadriaxial, int frequencia) {
        this.codFabricante = codFabricante;
        this.modeloQuadriaxial = modeloQuadriaxial;
        this.frequencia = frequencia;
        this.sensibilidade = 90;
        this.cor = "Preto";
        this.ligado = false;
        this.conectado = false;
        this.tipoEntrada = "Tipo P3";
    }
    
    public AutoFalante(String codFabricante, String modeloQuadriaxial, int frequencia, int sensibilidade) {
        this.codFabricante = codFabricante;
        this.modeloQuadriaxial = modeloQuadriaxial;
        this.frequencia = frequencia;
        this.sensibilidade = sensibilidade;
        this.cor = "Preto";
        this.ligado = false;
        this.conectado = false;
        this.tipoEntrada = "Tipo P3";
    }

    public AutoFalante(String codFabricante, String modeloQuadriaxial, int frequencia, int sensibilidade, String cor) {
        this.codFabricante = codFabricante;
        this.modeloQuadriaxial = modeloQuadriaxial;
        this.frequencia = frequencia;
        this.sensibilidade = sensibilidade;
        this.cor = cor;
        this.ligado = false;
        this.conectado = false;
        this.tipoEntrada = "Tipo P3";
    }

    public AutoFalante(String codFabricante, String modeloQuadriaxial, int frequencia, int sensibilidade, String cor, String tipoEntrada) {
        this.codFabricante = codFabricante;
        this.modeloQuadriaxial = modeloQuadriaxial;
        this.frequencia = frequencia;
        this.sensibilidade = sensibilidade;
        this.cor = cor;
        this.ligado = false;
        this.conectado = false;
        this.tipoEntrada = tipoEntrada;
    }
    
    public void ligar(){
        if(isLigado() == false){
            setLigado(true);
            System.out.println("Você ligou o aparelho.");
        }
        else{
            System.out.println("O aparelho já está ligado.");
        }
    }

    public void desligar(){
        if(isLigado() == true){
            setLigado(false);
            System.out.println("Você desligou o aparelho.");
        }
        else{
            System.out.println("O aparelho já está desligado.");
        }
    }

    public void conectarViaCabo(Celular celular){
        if(isLigado() == false){
            System.out.println("Ligue o aparelho primeiro.");
        }
        else{
            if(celular.isLigado() == true){
                if((celular.getTipoEntrada()).equalsIgnoreCase(tipoEntrada)){
                    setConectado(true);
                    System.out.println("Aparelho conectado via cabo no celular " + celular.getId() + ".");
                }
                else{
                    setConectado(false);
                    System.out.println("O celular não tem a entrada igual a do cabo. O cabo do aparelho é " + getTipoEntrada());
                }
            }
            else{
                System.out.println("O celular está desligado, impossivel conectar.");
            } 
        }
    }

    public void escutarMusica(Celular celular, int i){
        if(isConectado() == false){
            System.out.println("Não está conectado no celular. Impossivel escutar musica.");
        }
        else{
            System.out.println("-> Você está ouvindo a musica " + celular.getMusica(i).getNome() + "\n-> Duração: " + celular.getMusica(i).getDuracao() + " minutos");
            System.out.println("Letra: ");
            System.out.println(celular.getMusica(i).getLetra());
        }
    }

    public String getCodFabricante() {
        return codFabricante;
    }

    public void setCodFabricante(String codFabricante) {
        this.codFabricante = codFabricante;
    }

    public String getModeloQuadriaxial() {
        return modeloQuadriaxial;
    }

    public void setModeloQuadriaxial(String modeloQuadriaxial) {
        this.modeloQuadriaxial = modeloQuadriaxial;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public int getSensibilidade() {
        return sensibilidade;
    }

    public void setSensibilidade(int sensibilidade) {
        this.sensibilidade = sensibilidade;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}
}
