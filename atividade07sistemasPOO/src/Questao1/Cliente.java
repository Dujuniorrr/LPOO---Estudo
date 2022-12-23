package Questao1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cliente extends Pessoa {
    private String codCliente;
    private double saldo;

    public Cliente(){

    }

    public Cliente(String nome, String dtNascimento, Endereco endereco, String codCliente, double saldo) {
        super(nome, dtNascimento, endereco);
        this.codCliente = codCliente;
        this.saldo = saldo;
    }

    public boolean cadastrar(String codCliente, String nome, String dtNascimento, Endereco endereco, ArrayList<Cliente> arrayCliente, double saldo){

        Cliente cliente = new Cliente();
        boolean valid = true;

        for(int i = 0; i < arrayCliente.size(); i++){
            cliente = arrayCliente.get(i);
            if(codCliente.equals(cliente.getCodCliente())){
                valid = false;
                break;
            }
        }

        if(valid == true){
            cliente = new Cliente(nome, dtNascimento, endereco, codCliente, saldo);
            arrayCliente.add(cliente);
        }
        
        return valid;
    }

    public boolean editar(String codCliente, String nome, String dtNascimento, Endereco endereco, ArrayList<Cliente> arrayCliente, double saldo){

        Cliente cliente = new Cliente();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayCliente.size(); i++){
            cliente = arrayCliente.get(i);
            if(codCliente.equals(cliente.getCodCliente())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            cliente = new Cliente(nome, dtNascimento, endereco, codCliente, saldo);
            arrayCliente.set(indice, cliente);
        }
        
        return valid;
    }

    public boolean deletar(String codCliente, ArrayList<Cliente> arrayCliente){
        Cliente Cliente = new Cliente();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayCliente.size(); i++){
            Cliente = arrayCliente.get(i);
            if(codCliente.equals(Cliente.getCodCliente())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            arrayCliente.remove(indice);
        }
        
        return valid;
    }

    public void visualizar(ArrayList<Cliente> arrayCliente){
        Cliente cliente = new Cliente();

        if(arrayCliente.size() >  0){
            for(int i = 0; i < arrayCliente.size(); i++){
                cliente = arrayCliente.get(i);
                JOptionPane.showMessageDialog(
                    null,
                    "\nCodigo: " + cliente.codCliente + "\nNome: " + cliente.getNome() + "\nSaldo: " + cliente.getSaldo() + "\nData de Nascimento: "  + cliente.getDtNascimento() + "\nEndereço: " + cliente.getEndereco().getEstado() + ", " + cliente.getEndereco().getBairro() + ", " + cliente.getEndereco().getRua() + ", " + cliente.getEndereco().getNumero(),
                    "Visualizando Clientes", 
                    JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há Clientes", "Clientes", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }
   
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
