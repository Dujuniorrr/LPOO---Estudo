package Questao5;

import java.util.Scanner;

public class ContaCorrente {
    static Scanner scanString = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);
    private String agencia;
    private String cpf;
    private boolean cpfConfirm = true;
    private String senha;
    private float saldo;
    private float emprestimo;
    private float jurosEmprestimo;

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

    public void setEmprestimo(float emprestimoInput){
        this.emprestimo = emprestimoInput;
    }

    public float getEmprestimo(){
        return this.emprestimo;
    }

    public void setJurosEmprestimo(float jurosEmprestimoInput){
        this.jurosEmprestimo = jurosEmprestimoInput;
    }

    public float getJurosEmprestimo(){
        return this.jurosEmprestimo;
    }
    
    public void cadastrarConta(){
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
        }
        else{
            System.out.println("\n-> Ja existe uma conta cadastrado.");
        }
    }

    public void fazerEmprestimo() throws InterruptedException{
        clearConsole();
        System.out.println("====== Emprestimo =====\n");
        System.out.print("Quanto de emprestimo deseja adquirir?: ");
        this.emprestimo = scan.nextFloat();
        System.out.print("\nEm quantos meses deseja pagar o emprestimo?: ");
        int meses = scan.nextInt();
        this.jurosEmprestimo = (this.emprestimo/100) * (meses * 10);
        this.saldo = this.saldo + this.emprestimo;
        System.out.println("\nVocê pagará " + this.emprestimo + " de emprestimo em " + meses + " meses. Com juros de " + this.jurosEmprestimo + " reais.");
        Thread.sleep(3000);
    }

    public void realizarTransferencia(){
        String chave;
        clearConsole();
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
                System.out.println("\nTransferencia realizada com sucesso!");
            }
        }
        else{
            System.out.println("\n--> Senha incorreta.");
        }
       
    }

    public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
