package Questao5;

public class Cliente {
    private String nome;
    private String id;
    private String email;
    private ContaBancaria conta;

    Cliente(){
        setNome("Vazio");
        setEmail("Vazio");
        setId("Vazio");
    }

    Cliente(String nome){
        setNome(nome);
        setEmail("Vazio");
        setId("Vazio");
    }
    
    Cliente(String nome, String email){
        setNome(nome);
        setEmail(email);
        setId("Vazio");
    }

    Cliente(String nome, String email, String id){
        setNome(nome);
        setEmail(email);
        setId(id);
    }

    Cliente(String nome, String email, String id, ContaBancaria conta){
        setNome(nome);
        setEmail(email);
        setId(id);
        setConta(conta);
    }

    public void visualizarSaldo(){
        System.out.print("\nO saldo de " + getNome() + " é: " + getConta().getSaldo());
        if(getConta().getEmprestimo() > 0){
            System.out.print(" Com um emprestimo de " + getConta().getEmprestimo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getConta() {
        return conta;
    }

    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }

}
