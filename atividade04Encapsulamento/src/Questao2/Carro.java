package Questao2;

import java.util.Random;
import java.util.Scanner;

public class Carro {
    static private Random rand = new Random();
    static Scanner scan = new Scanner(System.in);
    static Scanner scanLine = new Scanner(System.in);
    private String cor;
    private String tipo;
    private boolean ligado;
    private int capacidadeMotor;
    private int velocidade;
    private int chave;
    private boolean cadastrado = false;

    Carro(){
        setLigado(false);
        setVelocidade(0);
        setCapacidadeMotor(180);
    }

    public void cadastrar() throws InterruptedException{
        if(getCadastrado() == false){
			clearConsole();
			System.out.println("==== Cadastro de Carro ========");
			System.out.print("Tipo: ");
			setTipo(scanLine.nextLine());
			System.out.print("Cor: ");
			setCor(scanLine.nextLine());
            setChave();
            System.out.println("Chave randomica gerada: " + getChave());
			System.out.println("Capacidade do motor ");
            System.out.println("1 - 180");
            System.out.println("2 - 220");
            System.out.println("3 - 280");
            System.out.print("Escolha: ");
            int op = scan.nextInt();
            switch (op) {
                case 1:
                    setCapacidadeMotor(180);
                    break;
            
                case 2:
                    setCapacidadeMotor(220);
                    break;

                case 3:
                    setCapacidadeMotor(280);
                    break;

                default:
                    setCapacidadeMotor(180);
                    System.out.println("\nOpção inválida.");
                    Thread.sleep(3000);
                    break;
            }
            setCadastrado(true);
		}
		else{
			System.out.println("\nJá existe um carro cadastrado.");
			Thread.sleep(3000);
		}
    }

    public void visualizar() throws InterruptedException{
        if(getCadastrado() == false){
			System.out.println("\nNão há um carro cadastrado.");
			Thread.sleep(3000);
		}
		else{
			clearConsole();
			System.out.println("======== Informações ========");
			System.out.println("Tipo: " + getTipo());
			System.out.println("Cor: " + getCor());
			System.out.println("Chave: " + getChave());
			System.out.println("Capacidade do motor: " + getCapacidadeMotor());
			System.out.println("Velocidade atual: " + getVelocidade());
			Thread.sleep(5000);
		}

    }

    public void ligar() throws InterruptedException{
        clearConsole();
        System.out.println("======== Ligar Carro ========");
        if(getLigado() == true){
            System.out.println("\nO carro já está ligado.");
        }
        else{
            System.out.println("Coloque a chave: ");
            int chave = scan.nextInt();
            if(chave == getChave()){
                System.out.println("\nO carro agora está ligado.");
                setLigado(true);
            }
            else{
                System.out.println("\nChave errada.");
            }
        }
        Thread.sleep(2000);
    }

    public void desligar() throws InterruptedException{
        clearConsole();
        System.out.println("======== Desligar Carro ========");
        if(getLigado() == false){
            System.out.println("\nO carro já está desligado.");
        }
        else{
            System.out.println("Coloque a chave: ");
            int chave = scan.nextInt();
            if(chave == getChave()){
                System.out.println("\nO carro agora está desligado.");
                setLigado(false);
            }
            else{
                System.out.println("\nChave errada.");
            }
        }
        Thread.sleep(2000);
    }

    public void acelerar() throws InterruptedException{
        clearConsole();
        System.out.println("======== Acelerar Carro ========");
        if(getLigado() == true){
            System.out.println("Informe a velocidade que deseja acelerar: ");
            int velocidade = scan.nextInt();
            velocidade = getVelocidade() + velocidade;
            if(velocidade > getCapacidadeMotor()){
                setVelocidade(capacidadeMotor);
                System.out.println("\nVocê alcançou a capacidade máxima do motor. O carro agora está a " + getVelocidade() + " por hora.");
            }
            else{
                setVelocidade(velocidade);
                System.out.println("\nO carro agora está a " + getVelocidade() + " por hora.");
            }
        }
        else{
            System.out.println("\nO carro está desligado. Impossivel acelerar.");   
        }
        Thread.sleep(3000);
    }

    public void frear() throws InterruptedException{
        clearConsole();
        System.out.println("======== Frear Carro ========");
        if(getLigado() == true){
            System.out.println("Informe a velocidade que deseja frear: ");
            int velocidade = scan.nextInt();
            velocidade = getVelocidade() - velocidade;
            if(velocidade <= 0){
                setVelocidade(0);
                System.out.println("\nVocê freou o carro totalmente. Por chegar em 0 por hora, o carro acabou desligando.");
                setLigado(false);
            }
            else{
                setVelocidade(velocidade);
                System.out.println("\nO carro agora está a " + getVelocidade() + " por hora.");
            }
        }
        else{
            System.out.println("\nO carro está desligado. Impossivel frear.");   
        }
        Thread.sleep(3000);
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return this.tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private int getCapacidadeMotor() {
        return this.capacidadeMotor;
    }

    public void setCapacidadeMotor(int capacidadeMotor) {
        this.capacidadeMotor = capacidadeMotor;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    private void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getChave() {
        return this.chave;
    }

    private void setChave() {
        int chave = rand.nextInt(1000,10001);
        this.chave = chave;
    }

    public boolean getCadastrado() {
        return this.cadastrado;
    }

    private void setCadastrado(boolean cadastrado) {
        this.cadastrado = cadastrado;
    }

    public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
