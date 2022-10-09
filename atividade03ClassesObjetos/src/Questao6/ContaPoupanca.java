package Questao6;

import java.util.Scanner;

public class ContaPoupanca {
    static Scanner scanString = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);
    private String agencia;
    private String cpf;
    private boolean cpfConfirm = true;
    private String senha;
    private float saldo;
    private int extrato = 0;
    private int transferenciaQuant = 0;
    private float dinheiroSaque;
    private int saqueQuant = 0;
    private float transferencia;


    public void setAgencia(String agenciaInput){
        this.agencia = agenciaInput;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public void setSenha(String senhaInput){
        this.senha = senhaInput;
    }

    public String setSenha(){
        return this.senha;
    }

    public void setCpf(String cpfInput){
        this.cpf = cpfInput;
    }

    public String getCpdf(){
        return this.cpf;
    }

    public void setSaldo(float dinheiroInput){
        this.saldo = dinheiroInput;
    }

    public float getSaldo(){
        return this.saldo;
    }
    
    public void cadastrarConta() throws InterruptedException{
        clearConsole();
        if(cpfConfirm == true){
            System.out.println("====== Cadastro de Conta =====\n");
            System.out.print("-> Digite a agencia: ");
            setAgencia(scanString.nextLine());
            System.out.print("-> Digite o cpf: ");
            setCpf(scanString.nextLine());
            System.out.print("-> Digite o saldo: ");
            setSaldo(scan.nextFloat());
            System.out.print("-> Digite a senha: ");
            setSenha(scanString.nextLine());
            cpfConfirm = false;
        }
        else{
            System.out.println("\n-> Ja existe uma conta cadastrado.");
            Thread.sleep(3000);
        }
    }

    public void realizarTransferencia() throws InterruptedException{
        String chave;
        clearConsole();
        if(transferenciaQuant < 2){
            System.out.println("====== Transferencia =====\n");
            System.out.print("Digite a chave do individuo para quem deseja transferir: ");
            chave = scanString.nextLine();
            System.out.print("Digite quanto deseja transferir: ");
            float transferencia = scan.nextFloat();
            System.out.print("Digite sua senha: ");
            String senha = scanString.nextLine();
            if(senha.equals(this.senha)){
                if(transferencia > (this.saldo)){
                    System.out.println("\nTransferencia maior que o saldo disponivel");
                }
                else{
                    this.saldo = this.saldo - transferencia;
                    this.transferencia = this.transferencia + transferencia;
                    System.out.println("\nTransferencia realizada com sucesso!");
                    this.transferenciaQuant++;
                }
            }
            else{
                System.out.println("\n--> Senha incorreta.");
            }
        }
        else{
            System.out.println("\nVocê ja realizou as duas transferencias do mês.");
        }
        Thread.sleep(3000);
    }
    public void fazerSaque() throws InterruptedException{
        clearConsole();
        if(saqueQuant < 2){
            System.out.println("======= Saque =======");
            System.out.print("Digite a quantidade que deseja sacar: ");
            float saqueInput = scan.nextFloat();
            if(saqueInput < 0){
                System.out.println("\n--- Você digitou um numero negativo. Essa ação é invalida ---"); 
            }
            else if(saqueInput > saldo){
                System.out.println("\n--- A quantia de saque é maior que o dinheiro depositado ---"); 
            }
            else{
                this.saldo = this.saldo - saqueInput;
                System.out.println("\n--- Saque feito com sucesso ---");
                this.dinheiroSaque = saqueInput + dinheiroSaque;
            }
        }
        else{
            System.out.println("\nOs dois saques do mês ja foram realizados");
            Thread.sleep(3000);
        }
    }

    public void realizarExtrato() throws InterruptedException{
        clearConsole();
        if(extrato < 2){
            System.out.println("\n=========== EXTRATO ==============");
            System.out.println("CPF: " + cpf);
            System.out.println("Dinheiro depositado: " + saldo);
            System.out.println("Dinheiro sacado no mês: " + dinheiroSaque);
            System.out.println("Transferencias do mês: " + transferencia);
            System.out.println("Quantidade de transferências feitas: " + transferenciaQuant);
            System.out.println("Extratos realizados: " + (extrato + 1));
            extrato++;
        }
        else{
            System.out.println("\n---- Os dois extratos do mês ja foram realizadas ----");
        }
        Thread.sleep(3000);
    }
    
    public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
