package Questao2;

import java.util.Scanner;

public class Produto {
    static Scanner scanString = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);
    private String nome;
    private int id;
    private boolean idConfirm = true;
    private float preco;
    private int quant = 0;
    private float porcentagemDesconto;
    private float valDesc;

    public void setNome(String nomeInput){
        this.nome = nomeInput;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setPreco(float precoInput){
        this.preco = precoInput;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public void setId(int idInput){
        this.id = idInput;
    }
    
    public int getId(){
        return this.id;
    }

    public void setQuant(int quantInput){
        if(quantInput < 0){
            System.out.println("--- Você digitou um numero negativo. Essa ação é invalida ---");
        }
        else if(quantInput == 0){
            System.out.println("--- Nenhuma quantidade foi adicionada ---");
        }
        else{
            quant = quant + quantInput;
        }
    }

    public int getQuant(){
        return this.quant;
    }

    public void setDesconto(float descontoInput){
        if(descontoInput < 0){
            System.out.println("--- Você digitou um numero negativo. Essa ação é invalida ---");
        }
        else{
             porcentagemDesconto = descontoInput;
             valDesc = (descontoInput/100) * preco;
        }
    }

    public float getDesconto(){
        return this.porcentagemDesconto;
    }

   
    public void cadastrarProduto() throws InterruptedException{
        clearConsole();
        if(idConfirm == true){
            System.out.println("====== Cadastro de Produtos =====\n");
            System.out.print("-> Digite o nome: ");
            setNome(scanString.nextLine());
            System.out.print("-> Digite o preço: ");
            setPreco(scan.nextFloat());
            System.out.print("-> Digite o id: ");
            setId(scan.nextInt());
            System.out.print("-> Digite a quantidade em estoque: ");
            setQuant(scan.nextInt());
            System.out.print("-> Digite a porcentagem de desconto do produto: ");
            setDesconto(scan.nextFloat());
            this.idConfirm = false;
        }
        else{
            System.out.println("\n-> Ja existe um produto cadastrado.");
            Thread.sleep(3000);
        }
    }

    public void comprarProduto() throws InterruptedException{
        float valVenda;

        clearConsole();
        if(quant <= 0){
            System.out.println("-> Não há " + this.nome + " em estoque.");
        }
        else{
            System.out.print("Digite a quantidade de " + this.nome + " que deseja comprar: ");
            int quantInput = scan.nextInt();
            if(quantInput <=  this.quant){
                if(this.valDesc > 0){
                    this.quant = this.quant - quantInput;
                    valVenda = (this.preco - valDesc) * quantInput;
                    System.out.println("--------- RECIBO ---------- \nProduto: " + this.nome
                    + "\nPreço da unidade: " + (this.preco - valDesc) 
                    + "\nQuantidade sendo comprada: " + quantInput + 
                    "\n\n============================== \nValor a pagar: " + valVenda);
                    System.out.println("Compra realizada com sucesso.");
                }
                else{
                    this.quant = this.quant - quantInput;
                    valVenda = this.preco * quantInput;
                    System.out.println("--------- RECIBO ---------- \nProduto: " + this.nome
                    + "\nPreço da unidade: " + this.preco 
                    + "\nQuantidade sendo comprada: " + quantInput + 
                    "\n\n============================== \nValor a pagar: " + valVenda);
                     System.out.println("Compra realizada com sucesso.");
                }
            }
            else{
                System.out.println("Quantidade acima do total de " + this.nome + " no estoque.");
            }
        }
        Thread.sleep(3000);
    }

    public void alterarProduto() throws InterruptedException{
        clearConsole();
        if(idConfirm == false){
            System.out.println("====== Alterar Produto =====\n");
            System.out.println("- O que deseja alterar?");
            System.out.println("- - - - - - - - ");
            System.out.println("1 - Nome");
            System.out.println("2 - Preço");
            System.out.println("3 - Quantidade em estoque");
            System.out.println("4 - ID");
            System.out.println("5 - Porcentagem de desconto");
            System.out.print("--> O que deseja alterar? ");
            int op = scan.nextInt();
            System.out.println("\n");
            switch (op) {
                case 1:
                    System.out.print("-> Altere o nome: ");
                    setNome(scanString.nextLine());
                    break;
            
                case 2:
                    System.out.print("-> Altere o preço: ");
                    setPreco(scan.nextFloat());
                    break;

                case 3:
                    System.out.print("-> Altere a quantidade em estoque: ");
                    setQuant(scan.nextInt());
                    break;
            
                case 4:
                    System.out.print("-> Altere o ID: ");
                    setId(scan.nextInt());
                    break;

                case 5:
                    System.out.print("-> Altere a porcentagem de desconto: ");
                    setDesconto(scan.nextFloat());
                    break;
                default:
                    break;
            }
        }
        else{
            System.out.println("\nNão existe um produto cadastrado.");
            Thread.sleep(3000);
        }
    }

    public void mostrarProduto() throws InterruptedException{
        clearConsole();
        System.out.println("====== Visualizar Produto =====\n");
        System.out.println("-- Nome: " + getNome());
        if(valDesc > 0){
            System.out.println("-- Preco: " + (getPreco() - this.valDesc));
        }
        else{
            System.out.println("-- Preco: " + getPreco());
        }
        System.out.println("-- ID: " + getId());
        System.out.println("-- Quantidade em estoque: " + getQuant());
        System.out.println("-- Desconto de: " + getDesconto() + "%");
        Thread.sleep(3000);
    }

    public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
