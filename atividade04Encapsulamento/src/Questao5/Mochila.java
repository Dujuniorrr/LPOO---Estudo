package Questao5;

import java.util.Scanner;

public class Mochila{
    static Scanner scanLine = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);
    private String tipo;
    private float pesoMax;
    private String material;
    private boolean aberto;
    private float pesoAtual;

    Mochila(){
        setTipo("Negócios");
        setMaterial("Tecido");
        setAberto(false);
    }

    public void registrarMochila(){
        clearConsole();
        System.out.println("======= Registrar Mochila ========");
        System.out.print("Material (couro, tecido ou lona): ");
        setMaterial(scanLine.nextLine());
        System.out.print("Tipo (negócos, notebook ou viagem): ");
        setTipo(scanLine.nextLine());
        setPesoMax();
    }

    public void visualizarTipos() throws InterruptedException{
        int op = 0;
        boolean valid = true;
        while(valid == true){
            clearConsole();
            System.out.println("======== Tipos de Mochila =======");
            System.out.println("1 - Viagem");
            System.out.println("2 - Notebook");
            System.out.println("3 - Negócios");
            System.out.println("4 - Sair");
            System.out.print("O que deseja fazer?: ");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    clearConsole();
                    System.out.println("======= Mochila de Viagem ======");
                    System.out.println("Lona - Suporta até: 6kg");
                    System.out.println("Couro - Suporta até: 12kg");
                    System.out.println("Tecido - Suporta até: 24kg");
                    Thread.sleep(3000);
                    break;
                
                case 2:
                    clearConsole();
                    System.out.println("======= Mochila de Notebook ======");
                    System.out.println("Lona - Suporta até: 2kg");
                    System.out.println("Couro - Suporta até: 4kg");
                    System.out.println("Tecido - Suporta até: 6kg");
                    Thread.sleep(3000);
                    break;

                case 3:
                    clearConsole();
                    System.out.println("======= Mochila de Negócios ======");
                    System.out.println("Lona - Suporta até: 4kg");
                    System.out.println("Couro - Suporta até: 8kg");
                    System.out.println("Tecido - Suporta até: 12kg");
                    Thread.sleep(3000);
                    break;
                
                case 4:
                    valid = false;
                    break;
            
                default:
                    System.out.println("\nOpção inválida.");
                    Thread.sleep(3000);
                    break;
            }
        }
    }

    public void adicionarItem() throws InterruptedException{
        if(isAberto() == true){
            clearConsole();
            System.out.println("======== Adicionando Item =======");
            System.out.print("Digite o nome do item que deseja adicionar: ");
            String nome = scanLine.nextLine();
            System.out.print("Digite o peso do item que deseja adicionar: ");
            float peso = scan.nextFloat();
            if(peso <= pesoMax){
                setPesoAtual(peso);
            }
            else{
                System.out.println("\nPeso maior do que o suportado.");
                Thread.sleep(3000);
            }
        }
        else{
            System.out.println("\nA mochila está fechada.");
            Thread.sleep(3000);
        }
       
    }

    public void fecharMochila() throws InterruptedException{
        if(isAberto() == true){
            System.out.println("\nAgora a mochila está fechada");
            setAberto(false);
        }
        else{
            System.out.println("\nA mochila já está fechada");
        }
        Thread.sleep(2000);
    }

    public void abrirMochila() throws InterruptedException{
        if(isAberto() == false){
            System.out.println("\nAgora a mochila está aberta");
            setAberto(true);
        }
        else{
            System.out.println("\nA mochila já está aberta.");
        }
        Thread.sleep(2000);
    }

    public boolean isAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        if(tipo.equalsIgnoreCase("Notebook")){
            this.tipo = tipo;
        }
        else if(tipo.equalsIgnoreCase("Negócios")){
            this.tipo = tipo;
        }  
        else if(tipo.equalsIgnoreCase("Viagem")){
            this.tipo = tipo;
        }
        else{
            System.out.println("\nTipo inválido.");
        }
    }

    public float getPesoMax() {
        return this.pesoMax;
    }

    private void setPesoMax() {
        if(getMaterial().equalsIgnoreCase("Lona")){
            if(getTipo().equalsIgnoreCase("Notebook")){
                this.pesoMax = 2;
            }
            else if(tipo.equalsIgnoreCase("Viagem")){
                this.pesoMax = 6;
            }
            else if(tipo.equalsIgnoreCase("Negócios")){
                this.pesoMax = 4;
            }
        }
        else if(getMaterial().equalsIgnoreCase("Tecido")){
            if(getTipo().equalsIgnoreCase("Notebook")){
                this.pesoMax = 6;
            }
            else if(getTipo().equalsIgnoreCase("Viagem")){
                this.pesoMax = 24;
            }
            else if(getTipo().equalsIgnoreCase("Negócios")){
                this.pesoMax = 12;
            }
        }
        else if(getMaterial().equalsIgnoreCase("Couro")){
            if(getTipo().equalsIgnoreCase("Notebook")){
                this.pesoMax = 4;
            }
            else if(getTipo().equalsIgnoreCase("Viagem")){
                 this.pesoMax = 12;
            }
            else if(getTipo().equalsIgnoreCase("Negócios")){
                this.pesoMax = 8;
            }
        }
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        if(material.equalsIgnoreCase("Couro")){
            this.material = material;
        }
        else if(material.equalsIgnoreCase("Lona")){
            this.material = material;
        }
        else if(material.equalsIgnoreCase("Tecido")){
            this.material = material;
        }
        else{
            System.out.println("\nMaterial indisponivel.");
        }
            
    }

    public float getPesoAtual() {
        return pesoAtual;
    }

    private void setPesoAtual(float pesoAtual) throws InterruptedException {
        this.pesoAtual = this.pesoAtual + pesoAtual;
        if(this.pesoAtual > getPesoMax()){
            this.pesoAtual = this.pesoAtual - pesoAtual;
            System.out.println("\nCaso esse item seja adicionado, o peso será maior que o suportado.");
            Thread.sleep(2000);
        }
    }

    public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}