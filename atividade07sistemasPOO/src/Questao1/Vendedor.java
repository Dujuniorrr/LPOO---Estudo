package Questao1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Vendedor extends Pessoa{
    private String cpnj;
    private String codVendedor;

    public Vendedor() {
       
    }

    public Vendedor(String nome, String dtNascimento, Endereco endereco, String cpnj, String codVendedor) {
        super(nome, dtNascimento, endereco);
        this.cpnj = cpnj;
        this.codVendedor = codVendedor;
    }
    
    public boolean cadastrar(String codVendedor, String nome, String dtNascimento, String cpnj, Endereco endereco, ArrayList<Vendedor> arrayVendedor){

        Vendedor vendedor = new Vendedor();
        boolean valid = true;

        for(int i = 0; i < arrayVendedor.size(); i++){
            vendedor = arrayVendedor.get(i);
            if(codVendedor.equals(vendedor.getCodVendedor())){
                valid = false;
                break;
            }
        }

        if(valid == true){
            vendedor = new Vendedor(nome, dtNascimento, endereco, cpnj, codVendedor);
            arrayVendedor.add(vendedor);
        }
        
        return valid;
    }

    public boolean editar(String codVendedor, String nome, String dtNascimento, String cpnj, Endereco endereco, ArrayList<Vendedor> arrayVendedor){

        Vendedor vendedor = new Vendedor();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayVendedor.size(); i++){
            vendedor = arrayVendedor.get(i);
            if(codVendedor.equals(vendedor.getCodVendedor())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            vendedor = new Vendedor(nome, dtNascimento, endereco, cpnj, codVendedor);
            arrayVendedor.set(indice, vendedor);
        }
        
        return valid;
    }

    public boolean deletar(String codVendedor, ArrayList<Vendedor> arrayVendedor){
        Vendedor vendedor = new Vendedor();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayVendedor.size(); i++){
            vendedor = arrayVendedor.get(i);
            if(codVendedor.equals(vendedor.getCodVendedor())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            arrayVendedor.remove(indice);
        }
        
        return valid;
    }

    public void visualizar(ArrayList<Vendedor> arrayVendedor){
        Vendedor vendedor = new Vendedor();

        if(arrayVendedor.size() >  0){
            for(int i = 0; i < arrayVendedor.size(); i++){
                vendedor = arrayVendedor.get(i);
                JOptionPane.showMessageDialog(
                    null,
                    "\nCodigo: " + vendedor.codVendedor + "\nNome: " + vendedor.getNome() + "\nCPNJ: " + vendedor.getCpnj() + "\nData de Nascimento: " + vendedor.getDtNascimento() + "\nEndereço: " + vendedor.getEndereco().getEstado() + ", " + vendedor.getEndereco().getBairro() + ", " + vendedor.getEndereco().getRua() + ", " + vendedor.getEndereco().getNumero(),
                    "Vendedores", 
                    JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há vendedores", "Visualizando vendedores", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getCpnj() {
        return cpnj;
    }
    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }
    public String getCodVendedor() {
        return codVendedor;
    }
    public void setCodVendedor(String codVendedor) {
        this.codVendedor = codVendedor;
    }
}