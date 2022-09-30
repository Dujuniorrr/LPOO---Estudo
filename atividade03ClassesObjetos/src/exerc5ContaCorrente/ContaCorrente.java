package exerc5ContaCorrente;

public class ContaCorrente {
    private String cpf;
    private float dinheiroDepositado;
    private float emprestimo;

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

    public void addEmprestimo(float emprestimoInput, float meses){

        if(dinheiroDepositado < 0){
            System.out.println("\nVocẽ não tem dinheiro depositado, por tanto não pode pedir emprestimo");
        }
        else{
            dinheiroDepositado = dinheiroDepositado + emprestimoInput;
            emprestimoInput = emprestimoInput + (emprestimoInput * (meses/100));
            emprestimo = emprestimo + emprestimoInput;
            System.out.println("\nVocẽ deverá pagar: " + emprestimo +" com os juros de " + meses + "% ");
        }
    }

    public void addTransferencia(float transferenciaInput){
        if(transferenciaInput < 0){
            System.out.println("\n--- Você digitou um numero negativo. Essa ação é invalida ---"); 
        }
        else if(transferenciaInput > dinheiroDepositado){
            System.out.println("\n--- A quantia de transferencia é maior que o dinheiro depositado ---"); 
        }
        else{
            dinheiroDepositado = dinheiroDepositado - transferenciaInput;
            System.out.println("\n--- Transferencia feita com sucesso ---"); 
        }
    }
}
