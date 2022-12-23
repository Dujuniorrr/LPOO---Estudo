package Questao2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ContatoComercial extends Contato{
    private String cpnj;
    private String cargo;
    private String empresa;
    private String dtNascimento;

     public ContatoComercial(String codContato, String nome, String telefone, Endereco endereco, String cpnj,
            String cargo, String empresa, String dtNascimento) {
        super(codContato, nome, telefone, endereco);
        this.cpnj = cpnj;
        this.cargo = cargo;
        this.empresa = empresa;
        this.dtNascimento = dtNascimento;
    }

    public ContatoComercial() {
    }

    @Override
    public String informarDados(){
        String info = "Codigo: " + super.getCodContato() 
                    + "\nNome: " + super.getNome()
                    + "\nTelefone: " + super.getTelefone()
                    + "\nEndereco: " + super.getEndereco().getEstado() + ", " + super.getEndereco().getBairro() + ", " + super.getEndereco().getRua() + ", " + super.getEndereco().getNumero()
                    + "\nCPNJ: " + getCpnj()
                    + "\nCargo: " + getCargo()
                    + "\nEmpresa: " + getEmpresa()
                    + "\nData de Nascimento: " + getDtNascimento();
        return info;
    }

   
    public boolean cadastrar(String codContato, String nome, String dtNascimento, String cpnj, Endereco endereco, String cargo, String empresa, String telefone, ArrayList<ContatoComercial> arrayContatoComercial){

        ContatoComercial contatoComercial = new ContatoComercial();
        boolean valid = true;

        for(int i = 0; i < arrayContatoComercial.size(); i++){
            contatoComercial = arrayContatoComercial.get(i);
            if(codContato.equals(contatoComercial.getCodContato())){
                valid = false;
                break;
            }
        }

        if(valid == true){
            contatoComercial = new ContatoComercial(codContato, nome, telefone, endereco, cpnj, cargo, empresa, dtNascimento);
            arrayContatoComercial.add(contatoComercial);
        }
        
        return valid;
    }

    public boolean editar(String codContato, String nome, String dtNascimento, String cpnj, Endereco endereco, String cargo, String empresa, String telefone, ArrayList<ContatoComercial> arrayContatoComercial){
        ContatoComercial contatoComercial = new ContatoComercial();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayContatoComercial.size(); i++){
            contatoComercial = arrayContatoComercial.get(i);
            if(codContato.equals(contatoComercial.getCodContato())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            contatoComercial = new ContatoComercial(codContato, nome, telefone, endereco, cpnj, cargo, empresa, dtNascimento);
            arrayContatoComercial.set(indice, contatoComercial);
        }
        
        return valid;
    }

    public boolean deletar(String codContato, ArrayList<ContatoComercial> arrayContatoComercial){
        ContatoComercial contatoComercial = new ContatoComercial();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayContatoComercial.size(); i++){
            contatoComercial = arrayContatoComercial.get(i);
            if(codContato.equals(contatoComercial.getCodContato())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            arrayContatoComercial.remove(indice);
        }
        
        return valid;
    }

    public void visualizar(ArrayList<ContatoComercial> arrayContatoComercial){
        ContatoComercial contatoComercial = new ContatoComercial();

        if(arrayContatoComercial.size() >  0){
            for(int i = 0; i < arrayContatoComercial.size(); i++){
                contatoComercial = arrayContatoComercial.get(i);
                JOptionPane.showMessageDialog(null, contatoComercial.informarDados(), "Contatos Comerciais", JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há Contatos Comerciais", " Contatos Comerciais", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getCpnj() {
        return cpnj;
    }
    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getDtNascimento() {
        return dtNascimento;
    }
    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
}
