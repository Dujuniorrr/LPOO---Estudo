package Questao8;

import java.util.Scanner;

public class Medico {
    static Scanner scan = new Scanner(System.in);
    static Scanner scanString = new Scanner(System.in);
    private String nome;
    private String especializacao;
    private String crm;
    private int id;
    private boolean idConfirm = true;
    
    public void setNome (String nomeInput){
        this.nome = nomeInput;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEspecializacao(String especializacaoInput){
        this.especializacao = especializacaoInput;
    }

    public String getEspecializacao(){
        return this.especializacao;
    }

    public void setCrm(String crmInput){
        this.crm = crmInput;
    }

    public String getCrm(){
        return this.crm;
    }

    public void setId(int idInput){
        this.id = idInput;
    }

    public int getId(){
        return this.id;
    }

    public void cadastrarMedico(){
        clearConsole();
        if(idConfirm == true){
            System.out.println("====== Cadastro de Medico =====\n");
            System.out.print("-> Digite o nome: ");
            setNome(scanString.nextLine());
            System.out.print("-> Digite a escpecialização: ");
            setEspecializacao(scanString.nextLine());
            System.out.print("-> Digite o crm: ");
            setCrm(scanString.nextLine());
            System.out.print("-> Digite o id: ");
            setId(scan.nextInt());
            idConfirm = false;
        }
        else{
            System.out.println("\n-> Ja existe um médico cadastrado.");
        }
    }

    public void mostrarMedico() throws InterruptedException{
        clearConsole();
        System.out.println("====== Visualizar Medico =====\n");
        System.out.println("-- Nome: " + getNome());
        System.out.println("-- Id: " + getId());
        System.out.println("-- CRM: " + getCrm());
        System.out.println("-- Especialização: " + getEspecializacao());
        Thread.sleep(3000);
    }

    public void alterarMedico() throws InterruptedException{
        clearConsole();
        if(idConfirm == false){
            System.out.println("====== Alterar Medico =====\n");
            System.out.println("- O que deseja alterar?");
            System.out.println("- - - - - - - - ");
            System.out.println("1 - Nome");
            System.out.println("2 - CRM");
            System.out.println("3 - ID");
            System.out.println("4 - Especialização");
            System.out.print("--> O que deseja alterar? ");
            int op = scan.nextInt();
            System.out.println("\n");
            switch (op) {
                case 1:
                    System.out.print("-> Altere o nome: ");
                    setNome(scanString.nextLine());
                    break;
            
                case 2:
                    System.out.print("-> Altere o CRM: ");
                    setCrm(scanString.nextLine());
                    break;

                case 3:
                    System.out.print("-> Altere o ID: ");
                    setId(scan.nextInt());
                    break;
            
                case 4:
                    System.out.print("-> Altere a especialização: ");
                    setEspecializacao(scanString.nextLine());
                    break;

                default:
                    break;
            }
        }
        else{
            System.out.println("\nNão existe um médico cadastrado.");
            Thread.sleep(3000);
        }
    }

    public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}