package Questao02;

public class FoneDeOuvido extends AutoFalante{
    private boolean bluetooth;
    private int bateria;

    public FoneDeOuvido(String codFabricante, String modeloQuadriaxial, int frequencia, int sensibilidade, String cor) {
        super(codFabricante, modeloQuadriaxial, frequencia, sensibilidade, cor);
        this.bluetooth = false;
        this.bateria = 100;
    }

    public FoneDeOuvido(String codFabricante, String modeloQuadriaxial, int frequencia, int sensibilidade, String cor, boolean bluetooth) {
        super(codFabricante, modeloQuadriaxial, frequencia, sensibilidade, cor);
        this.bluetooth = bluetooth;
        this.bateria = 100;
    }
    public FoneDeOuvido(String codFabricante, String modeloQuadriaxial, int frequencia, int sensibilidade, String cor, boolean bluetooth, int bateria, String tipoEntrada) {
        super(codFabricante, modeloQuadriaxial, frequencia, sensibilidade, cor, tipoEntrada);
        this.bluetooth = bluetooth;
        this.bateria = bateria;
    }

    public void conectarViaBluetooth(Celular celular){
        if(celular.isLigado() == false){
            System.out.println("Celular desligado, impossivel conectar.");
        }
        else{
            if(getBateria() <= 0){
                System.out.println("Bateria descarregada. Impossivel usar essa função.");
             }
             else{
                if(isBluetooth() == false){
                    System.out.println("Bluetooth do aparelho desligado.");
                    super.setConectado(false);
                }
               else{
                    if(celular.isBluetooth() == false){
                        System.out.println("O bluetooth do celular está desligado, não é possivel conectar");
                        super.setConectado(false);
                    }
                   else{
                       super.setConectado(true);
                       System.out.println("Aparelho conectado ao bluetooth no celular " + celular.getId() + ".");
                   }
               }
             }
        }
    }

    public void ligarBluetooth(){
        if(getBateria() <= 0){
            System.out.println("Bateria descarregada. Impossivel usar essa função.");
        }
        else{
            if(isLigado() == true) {
                System.out.println("Você ligou o bluetooth.");
                setBluetooth(true);
            }
            else {
                System.out.println("O aparelho está desligado.");
            }
        }
		
	}

	public void desligarBluetooth(){
        if(getBateria() <= 0){
            System.out.println("Bateria descarregada. Impossivel usar essa função.");
        }
        else{
            if(isLigado() == true) {
                System.out.println("Você desligou o bluetooth.");
                setBluetooth(false);
            }
            else {
                System.out.println("O aparelho está desligado.");
            }
        }
	}

    public boolean isBluetooth() {
        return bluetooth;
    }
    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
    public int getBateria() {
        return bateria;
    }
    public void setBateria(int bateria) {
        this.bateria = bateria;
    }


    
        
}
