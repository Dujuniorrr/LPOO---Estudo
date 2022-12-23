package Questao02;

public class Celular{
	private String id;
	private String cor;
    private float peso;
    private double altura;
    private double largura;
    private boolean ligado;
	private boolean bluetooth;
    private String tipoEntrada;
	private Musica musica[] = new Musica[100];

	public Celular(String id, String cor, float peso, double altura, double largura, boolean ligado, boolean bluetooth,
			Musica[] musica, String tipoEntrada) {
		this.id = id;
		this.cor = cor;
		this.peso = peso;
		this.altura = altura;
		this.largura = largura;
		this.ligado = ligado;
		this.bluetooth = bluetooth;
		this.musica = musica;
		this.tipoEntrada = tipoEntrada;
	}

	public void ligar() {
		if(isLigado() == false) {
			System.out.println("Você ligou o celular.");
			setLigado(true);
		}
		else {
			System.out.println("O celular já está ligado.");
		}
	}
    
	public void desligar() {
		if(isLigado() == true) {
			System.out.println("Você desligou o celular.");
			setLigado(false);
		}
		else {
			System.out.println("O celular ja está desligado.");
		}
	}
	
	public void ligarBluetooth(){
		if(isLigado() == true) {
			System.out.println("Você ligou o bluetooth.");
			setBluetooth(true);
		}
		else {
			System.out.println("O celular está desligado.");
		}
	}

	public void desligarBluetooth(){
		if(isLigado() == true) {
			System.out.println("Você desligou o bluetooth.");
			setBluetooth(false);
		}
		else {
			System.out.println("O celular está desligado.");
		}
	}

	public void telefonar() {
		if(isLigado() == true) {
			System.out.println("Telefonando... ");
		}
		else {
			System.out.println("O celular está desligado. Impossivel realizar ligação.");
		}
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	protected boolean isLigado() {
		return ligado;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public Musica[] getMusica() {
		return musica;
	}

	public Musica getMusica(int i) {
		return musica[i];
	}

	public void setMusica(Musica[] musica) {
		this.musica = musica;
	}

	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}