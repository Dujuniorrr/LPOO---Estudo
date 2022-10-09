package Questao1;

import java.util.Scanner;

public class Cliente {
    static Scanner scanString = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);
    private String nome;
    private int idade;
    private int id;
    private boolean idConfirm = true;
    private int cupom;
    private float carteira = 0;

    public void setNome(String nomeInput){
        this.nome = nomeInput;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idadeInput){
        this.idade = idadeInput;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setId(int idInput){
        this.id = idInput;
    }

    public int getId(){
        return this.id;
    }

    public void setCupom(int cupomInput){
        if(cupomInput < 0){
            System.out.println("----- impossivel adicionar uma quantidade negativa no cupom ------");
        }
        else{
            this.cupom = cupomInput;
        }
    }

    public int getCupom(){
        return this.cupom;
    }

    public void setCarteira(float carteiraInput){
        if(carteiraInput > 50000){
            System.out.println("-------- Sua carteira já alcançou o limite de dinheiro que pode ser armazenado ------------");
        }
        else if(carteiraInput < 0){
            System.out.println("----- impossivel adicionar uma quantidade negativa na carteira ------");
        }   
        else{
            this.carteira = carteiraInput;
        }
    }

    public void retireCarteira(float carteiraInput){
        if(carteira < carteiraInput){
            System.out.println("-------- Vocẽ não tem dinheiro o bastante para retirar da carteira ------------");
        }
        else{
            this.carteira = carteiraInput;
        }
    }

    public float getCarteira(){
        return this.carteira;
    }

    public void cadastrarCliente() throws InterruptedException{
        clearConsole();
        if(idConfirm == true){
            System.out.println("====== Cadastro de Clientes =====\n");
            System.out.print("-> Digite o nome: ");
            setNome(scanString.nextLine());
            System.out.print("-> Digite a idade: ");
            setIdade(scan.nextInt());
            System.out.print("-> Digite o id: ");
            setId(scan.nextInt());
            System.out.print("-> Digite o cupom: ");
            setCupom(scan.nextInt());
            System.out.print("-> Digite o dinheiro na carteira: ");
            setCarteira(scan.nextFloat());
            this.idConfirm = false;
        }
        else{
            System.out.println("\n-> Ja existe um cliente cadastrado.");
            Thread.sleep(3000);
        }
    }

    public void mostrarCliente() throws InterruptedException{
        clearConsole();
        System.out.println("====== Visualizar Cliente =====\n");
        System.out.println("-- Nome: " + getNome());
        System.out.println("-- Idade: " + getIdade());
        System.out.println("-- ID: " + getId());
        System.out.println("-- Cupom: " + getCupom());
        System.out.println("-- Carteira: " + getCarteira());
        Thread.sleep(3000);
    }

    public void alterarCliente() throws InterruptedException{
        clearConsole();
        if(idConfirm == false){
            System.out.println("====== Alterar Cliente =====\n");
            System.out.println("- O que deseja alterar?");
            System.out.println("- - - - - - - - ");
            System.out.println("1 - Nome");
            System.out.println("2 - Idade");
            System.out.println("3 - Cupom");
            System.out.println("4 - ID");
            System.out.println("5 - Carteira");
            System.out.print("--> O que deseja alterar? ");
            int op = scan.nextInt();
            System.out.println("\n");
            switch (op) {
                case 1:
                    System.out.print("-> Altere o nome: ");
                    setNome(scanString.nextLine());
                    break;
            
                case 2:
                    System.out.print("-> Altere a idade: ");
                    setIdade(scan.nextInt());
                    break;

                case 3:
                    System.out.print("-> Altere o cupom: ");
                    setCupom(scan.nextInt());
                    break;
            
                case 4:
                    System.out.print("-> Altere o ID: ");
                    setId(scan.nextInt());
                    break;

                case 5:
                    System.out.print("-> Altere o dinheiro na carteira: ");
                    setCarteira(scan.nextFloat());
                    break;
                default:
                    break;
            }
        }
        else{
            System.out.println("\nNão existe um cliente cadastrado.");
            Thread.sleep(3000);

        }
    }

    public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}