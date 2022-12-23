package Questao2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ContatoPessoal extends Contato{
    private String cpf;
    private String dtNascimento;

    public ContatoPessoal(){

    }

    public ContatoPessoal(String codContato, String nome, String telefone, Endereco endereco, String cpf,
            String dtNascimento) {
        super(codContato, nome, telefone, endereco);
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
    }

    @Override
    public String informarDados(){
        String info = "Codigo: " + super.getCodContato() 
                    + "\nNome: " + super.getNome()
                    + "\nTelefone: " + super.getTelefone()
                    + "\nEndereco: " + super.getEndereco().getEstado() + ", " + super.getEndereco().getBairro() + ", " + super.getEndereco().getRua() + ", " + super.getEndereco().getNumero()
                    + "\nCPF: " + getCpf()
                    + "\nData de Nascimento: " + getDtNascimento();
        return info;
    }

    public boolean cadastrar(String codContato, String nome, String dtNascimento,  Endereco endereco, String cpf,String telefone, ArrayList<ContatoPessoal> arrayContatoPessoal){

        ContatoPessoal contatoPessoal = new ContatoPessoal();
        boolean valid = true;

        for(int i = 0; i < arrayContatoPessoal.size(); i++){
            contatoPessoal = arrayContatoPessoal.get(i);
            if(codContato.equals(contatoPessoal.getCodContato())){
                valid = false;
                break;
            }
        }

        if(valid == true){
            contatoPessoal = new ContatoPessoal(codContato, nome, telefone, endereco, cpf, dtNascimento);
            arrayContatoPessoal.add(contatoPessoal);
        }
        
        return valid;
    }

    public boolean editar(String codContato, String nome, String dtNascimento, Endereco endereco, String cpf,String telefone, ArrayList<ContatoPessoal> arrayContatoPessoal){

        ContatoPessoal contatoPessoal = new ContatoPessoal();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayContatoPessoal.size(); i++){
            contatoPessoal = arrayContatoPessoal.get(i);
            if(codContato.equals(contatoPessoal.getCodContato())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            contatoPessoal = new ContatoPessoal(codContato, nome, telefone, endereco, cpf, dtNascimento);
            arrayContatoPessoal.set(indice, contatoPessoal);
        }
        
        return valid;
    }

    public boolean deletar(String codContato, ArrayList<ContatoPessoal> arrayContatoPessoal){
        ContatoPessoal contatoPessoal = new ContatoPessoal();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayContatoPessoal.size(); i++){
            contatoPessoal = arrayContatoPessoal.get(i);
            if(codContato.equals(contatoPessoal.getCodContato())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            arrayContatoPessoal.remove(indice);
        }
        
        return valid;
    }

    public void visualizar(ArrayList<ContatoPessoal> arrayContatoPessoal){
        ContatoPessoal contatoPessoal = new ContatoPessoal();

        if(arrayContatoPessoal.size() >  0){
            for(int i = 0; i < arrayContatoPessoal.size(); i++){
                contatoPessoal = arrayContatoPessoal.get(i);
                JOptionPane.showMessageDialog(null, contatoPessoal.informarDados(), "Contatos Pessoais", JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há Contatos Pessoais", "Visualizando Contatos Pessoais", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDtNascimento() {
        return dtNascimento;
    }
    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

}