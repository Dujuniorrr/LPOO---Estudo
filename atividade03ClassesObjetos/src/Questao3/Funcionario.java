package Questao3;

import java.util.Scanner;

public class Funcionario {
    static Scanner scanString = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);
    private String nome;
    private int id;
    private boolean idConfirm = true;
    private float salario;
    private float porcentagemAumento;
    private float valAumento;
    private String funcao;
    
    public void setNome(String nomeInput){
        this.nome = nomeInput;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setSalario(float salarioInput){
        if(salarioInput < 0){
            System.out.println("--- Você digitou um numero negativo. Essa ação é invalida ---");
        }
        else{
            this.salario = salarioInput;
        }
       
    }
    
    public float getSalario(){
        return this.salario;
    }
    
    public void setId(int idInput){
        this.id = idInput;
    }
    
    public int getId(){
        return this.id;
    }

    public void setFuncao(String funcaoInput){
        this.funcao = funcaoInput;
    }
    
    public String getFuncao(){
        return this.funcao;
    }
    

    public void setAumento(float aumentoInput){
        if(aumentoInput < 0){
            System.out.println("--- Você digitou um numero negativo. Essa ação é invalida ---");
        }
        else{
            porcentagemAumento = aumentoInput;
            valAumento = (aumentoInput/100) * salario;
        }
    }

    public float getAumento(){
       return this.porcentagemAumento;
    }

    public void cadastrarFuncionario(){
        clearConsole();
        if(idConfirm == true){
            System.out.println("====== Cadastro de Funcionario =====\n");
            System.out.print("-> Digite o nome: ");
            setNome(scanString.nextLine());
            System.out.print("-> Digite a função: ");
            setFuncao(scanString.nextLine());
            System.out.print("-> Digite o id: ");
            setId(scan.nextInt());
            System.out.print("-> Digite o salário: ");
            setSalario(scan.nextFloat());
            System.out.print("-> Digite a porcentagem de aumento do mês (caso exista): ");
            setAumento(scan.nextFloat());
            this.idConfirm = false;
        }
        else{
            System.out.println("\n-> Ja existe um funcionario cadastrado.");
        }
        
    }

    public void mostrarFuncionario() throws InterruptedException{
        clearConsole();
        System.out.println("====== Visualizar Funcionario =====\n");
        System.out.println("-- Nome: " + getNome());
        System.out.println("-- Função: " + getFuncao());
        System.out.println("-- ID: " + getId());
        if(valAumento > 0){
            System.out.println("-- Salario: " + (getSalario() + valAumento));
        }
        else{
            System.out.println("-- Salario: " + getSalario());
        }
        System.out.println("-- Aumento: " + getAumento() + "%");
        Thread.sleep(3000);
    }

    public void alterarFuncionario() throws InterruptedException{
        clearConsole();
        if(idConfirm == false){
            System.out.println("====== Alterar Funcionario =====\n");
            System.out.println("- O que deseja alterar?");
            System.out.println("- - - - - - - - ");
            System.out.println("1 - Nome");
            System.out.println("2 - Função");
            System.out.println("3 - Salario");
            System.out.println("4 - ID");
            System.out.println("5 - Aumento");
            System.out.print("--> O que deseja alterar? ");
            int op = scan.nextInt();
            System.out.println("\n");
            switch (op) {
                case 1:
                    System.out.print("-> Altere o nome: ");
                    setNome(scanString.nextLine());
                    break;
            
                case 2:
                    System.out.print("-> Altere a função: ");
                    setFuncao(scanString.nextLine());
                    break;

                case 3:
                    System.out.print("-> Altere o salario: ");
                    setSalario(scan.nextFloat());
                    break;
            
                case 4:
                    System.out.print("-> Altere o ID: ");
                    setId(scan.nextInt());
                    break;

                case 5:
                    System.out.print("-> Altere a porcentagem do aumento: ");
                    setAumento(scan.nextFloat());
                    break;

                default:
                    break;
            }
        }
        else{
            System.out.println("\nNão existe um funcionario cadastrado.");
            Thread.sleep(3000);
        }
    }

    public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
