package Questao02;

public class Headset extends FoneDeOuvido{
    private boolean microfone;

    public Headset(String codFabricante, String modeloQuadriaxial, int frequencia, int sensibilidade, String cor,
            boolean bluetooth, int bateria, String tipoEntrada) {
        super(codFabricante, modeloQuadriaxial, frequencia, sensibilidade, cor, bluetooth, bateria, tipoEntrada);
        this.microfone = false;
    }

    public Headset(String codFabricante, String modeloQuadriaxial, int frequencia, int sensibilidade, String cor,
            boolean bluetooth, int bateria, boolean microfone, String tipoEntrada) {
        super(codFabricante, modeloQuadriaxial, frequencia, sensibilidade, cor, bluetooth, bateria, tipoEntrada);
        this.microfone = microfone;
    }

    public void ligarMicrofone(){
        if(getBateria() <= 0){
            System.out.println("Bateria descarregada. Impossivel usar essa função.");
        }
        else{
            if(isLigado() == true) {
                System.out.println("Você ligou o microfone.");
                setMicrofone(true);
            }
            else {
                System.out.println("O aparelho está desligado.");
            }
        }
	}

	public void desligarMicrofone(){
        if(getBateria() <= 0){
            System.out.println("Bateria descarregada. Impossivel usar essa função.");
        }
        else{
            if(isLigado() == true) {
                System.out.println("Você desligou o microfone.");
                setMicrofone(false);
            }
            else {
                System.out.println("O aparelho está desligado.");
            }
        }
	}

    public boolean isMicrofone() {
        return microfone;
    }

    public void setMicrofone(boolean microfone) {
        this.microfone = microfone;
    }


}
