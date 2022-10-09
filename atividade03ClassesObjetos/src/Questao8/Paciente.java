package Questao8;

import java.util.Scanner;

public class Paciente {
    static Scanner scan = new Scanner(System.in);
    static Scanner scanString = new Scanner(System.in);
    private String nome;
    private int idade;
    private String telefone;
    private String cpf;
    private boolean cpfConfirm = true;

    public void setNome (String nomeInput){
        this.nome = nomeInput;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTelefone(String telefoneInput){
        this.telefone = telefoneInput;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setIdade(int idadeInput){
        this.idade = idadeInput;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setCpf(String cpfInput){
        this.cpf = cpfInput;
    }

    public String getCpf(){
        return this.cpf;
    }


    public void cadastrarPaciente(){
        clearConsole();
        if(cpfConfirm == true){
            System.out.println("====== Cadastro de Paciente =====\n");
            System.out.print("-> Digite o nome: ");
            setNome(scanString.nextLine());
            System.out.print("-> Digite a idade: ");
            setIdade(scan.nextInt());
            System.out.print("-> Digite o telefone: ");
            setTelefone(scanString.nextLine());
            System.out.print("-> Digite o cpf: ");
            setCpf(scanString.nextLine());
            cpfConfirm = false;
        }
        else{
            System.out.println("\n-> Ja existe um paciente cadastrado.");
        }
    }

    public void mostrarPaciente() throws InterruptedException{
        clearConsole();
        System.out.println("====== Visualizar Paciente =====\n");
        System.out.println("-- Nome: " + getNome());
        System.out.println("-- Idade: " + getIdade());
        System.out.println("-- CPF: " + getCpf());
        System.out.println("-- Telefone: " + getTelefone());
        Thread.sleep(3000);
    }

    public void alterarPaciente() throws InterruptedException{
        clearConsole();
        if(cpfConfirm == false){
            System.out.println("====== Alterar Paciente =====\n");
            System.out.println("- O que deseja alterar?");
            System.out.println("- - - - - - - - ");
            System.out.println("1 - Nome");
            System.out.println("2 - Idade");
            System.out.println("3 - CPF");
            System.out.println("4 - Telefone");
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
                    System.out.print("-> Altere o cpf: ");
                    setCpf(scanString.nextLine());
                    break;
            
                case 4:
                    System.out.print("-> Altere o telefone: ");
                    setTelefone(scanString.nextLine());
                    break;

                default:
                    break;
            }
        }
        else{
            System.out.println("\nNão existe um paciente cadastrado.");
            Thread.sleep(3000);
        }
    }

    public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
