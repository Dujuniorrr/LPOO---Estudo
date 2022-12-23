package Questao5;

public class ContaBancaria{
    private String agencia;
    private Cliente cliente;
    private String senha;
    private double saldo;
    private double emprestimo;
    private double jurosEmprestimo;

    ContaBancaria(){
        setAgencia("0001");
        setSenha("Vazia");
        setSaldo(0);
        setEmprestimo(0);
        setJurosEmprestimo(0);
    }

    ContaBancaria(Cliente cliente){
        setCliente(cliente);
        setAgencia("Vazia");
        setSenha("Vazia");
        setSaldo(0);
        setEmprestimo(0);
        setJurosEmprestimo(0);
    }

    ContaBancaria(Cliente cliente, String agencia){
        setCliente(cliente);
        setAgencia(agencia);
        setSenha("Vazia");
        setSaldo(0);
        setEmprestimo(0);
        setJurosEmprestimo(0);
    }

    ContaBancaria(Cliente cliente, String agencia, String senha){
        setCliente(cliente);
        setAgencia(agencia);
        setSenha(senha);
        setSaldo(0);
        setEmprestimo(0);
        setJurosEmprestimo(0);
    }

    ContaBancaria(Cliente cliente, String agencia, String senha, double saldo){
        setCliente(cliente);
        setAgencia(agencia);
        setSenha(senha);
        setSaldo(saldo);
        setEmprestimo(0);
        setJurosEmprestimo(0);
    }

    public void realizarTransferencia(Cliente cliente, Cliente clienteRecebe, String senha, double transferencia){

        if(cliente.getId() == getCliente().getId()){
            if(senha.equals(getSenha())){
                if(transferencia > (getSaldo())){
                    System.out.println("\nTransferencia maior que o saldo disponivel");
                }
                else{
                    setSaldo(getSaldo() - transferencia);
                    clienteRecebe.getConta().setSaldo(clienteRecebe.getConta().getSaldo() + transferencia);
                    System.out.println("\nTransferencia realizada com sucesso! " + cliente.getNome() + " transferiu " + transferencia + " para " + clienteRecebe.getNome());
                }
            }
            else{
                System.out.println("\n--> Senha incorreta.");
            }
        }
        else{
            System.out.println("\nO cliente não é dono dessa conta, por tanto não pode realizar a transferencia.");
        }
       
    }

    public void cadastrarConta(Cliente cliente, String agencia, String senha, double saldo){
        if(getSenha().equals("Vazia")){
            setCliente(cliente);
            setAgencia(agencia);
            setSenha(senha);
            setSaldo(saldo);
        }
        else{
            System.out.println("\nJa existe uma conta cadastrado.");
        }
    }

    public void fazerEmprestimo(Cliente cliente, double emprestimo, int meses){
        if(cliente.getId() == getCliente().getId()){
            setEmprestimo(emprestimo);
            setJurosEmprestimo((getEmprestimo()/100) * (meses * 10));
            setSaldo(getSaldo()+getEmprestimo());
            System.out.println("\nVocê pagará " + getEmprestimo() + " de emprestimo em " + meses + " meses. Com juros de " + getJurosEmprestimo() + " reais.");
        }
        else{
            System.out.println("Essa conta bancaria não pertence a esse cliente.");
        }
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getEmprestimo() {
        return emprestimo;
    }

    private void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }

    public double getJurosEmprestimo() {
        return jurosEmprestimo;
    }

    public void setJurosEmprestimo(double jurosEmprestimo) {
        this.jurosEmprestimo = jurosEmprestimo;
    }

}