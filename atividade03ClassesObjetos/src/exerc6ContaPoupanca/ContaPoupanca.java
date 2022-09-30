package exerc6ContaPoupanca;

public class ContaPoupanca {
    private String cpf;
    private float dinheiroDepositado;
    private float dinheiroSacado;
    private int quantTransferencia = 0;
    private float transferencia;
    private int extrato = 0;

    public void setCpf(String cpfInput){
        this.cpf = cpfInput;
    }

    public String getCpdf(){
        return this.cpf;
    }

    public void setDinheiroDepositado(float dinheiroInput){
        this.dinheiroDepositado = dinheiroInput;
    }

    public float getDinheiroDepositado(){
        return this.dinheiroDepositado;
    }
   
    public void addTransferencia(float transferenciaInput){
        if(quantTransferencia < 2){
            if(transferenciaInput < 0){
                System.out.println("\n--- Você digitou um numero negativo. Essa ação é invalida ---"); 
            }
            else if(transferenciaInput > dinheiroDepositado){
                System.out.println("\n--- A quantia de transferencia é maior que o dinheiro depositado ---"); 
            }
            else{
                dinheiroDepositado = dinheiroDepositado - transferenciaInput;
                System.out.println("\n--- Transferencia feita com sucesso ---");
                transferencia = transferencia + transferenciaInput;
                quantTransferencia++;
            }
        }
        else{
            System.out.println("\n---- As duas transferencias do mês ja foram realizadas ----");
        }
    }

    public void addSaque(float saqueInput){
        if(saqueInput < 0){
             System.out.println("\n--- Você digitou um numero negativo. Essa ação é invalida ---"); 
        }
        else if(saqueInput > dinheiroDepositado){
             System.out.println("\n--- A quantia de saque é maior que o dinheiro depositado ---"); 
        }
        else{
            dinheiroDepositado = dinheiroDepositado - saqueInput;
            System.out.println("\n--- Saque feito com sucesso ---");
            dinheiroSacado = saqueInput + dinheiroSacado;
        }
    }

    public void extrato(){
        if(extrato < 2){
            extrato++;
            System.out.println("\n=========== EXTRATO ==============");
            System.out.println("CPF: " + cpf);
            System.out.println("Dinheiro depositado: " + dinheiroDepositado);
            System.out.println("Dinheiro sacado no mês: " + dinheiroSacado);
            System.out.println("Transferencias do mês: " + transferencia);
            System.out.println("Quantidade de transferências feitas: " + quantTransferencia);
            System.out.println("Extratos realizados: " + extrato);
        }
        else{
            System.out.println("\n---- Os dois extratos do mês ja foram realizadas ----");
        }
    }
    
}
