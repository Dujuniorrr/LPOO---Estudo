package Questao2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ContatoEletronico extends Contato{
    private String email;
    private String homePage;
    private String instagram;

    public ContatoEletronico() {
    }

    public ContatoEletronico(String codContato, String nome, String telefone, Endereco endereco, String email,
            String homePage, String instagram) {
        super(codContato, nome, telefone, endereco);
        this.email = email;
        this.homePage = homePage;
        this.instagram = instagram;
    }

    @Override
    public String informarDados(){
        String info = "Codigo: " + super.getCodContato() 
                    + "\nNome: " + super.getNome()
                    + "\nTelefone: " + super.getTelefone()
                    + "\nEndereço: " + super.getEndereco().getEstado() + ", " + super.getEndereco().getBairro() + ", " + super.getEndereco().getRua() + ", " + super.getEndereco().getNumero()
                    + "\nEmail: " + getEmail()
                    + "\nLink HomePage: " + getHomePage()
                    + "\nInstagram: " + getInstagram();
        return info;
    }

    public boolean cadastrar(String codContato, String nome, Endereco endereco, String email, String homePage, String instagram, String telefone, ArrayList<ContatoEletronico> arrayContatoEletronico){

        ContatoEletronico contatoEletronico = new ContatoEletronico();
        boolean valid = true;

        for(int i = 0; i < arrayContatoEletronico.size(); i++){
            contatoEletronico = arrayContatoEletronico.get(i);
            if(codContato.equals(contatoEletronico.getCodContato())){
                valid = false;
                break;
            }
        }

        if(valid == true){
            contatoEletronico = new ContatoEletronico(codContato, nome, telefone, endereco, email, homePage, instagram);
            arrayContatoEletronico.add(contatoEletronico);
        }
        
        return valid;
    }

    public boolean editar(String codContato, String nome, Endereco endereco, String email, String homePage, String instagram, String telefone, ArrayList<ContatoEletronico> arrayContatoEletronico){
        ContatoEletronico contatoEletronico = new ContatoEletronico();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayContatoEletronico.size(); i++){
            contatoEletronico = arrayContatoEletronico.get(i);
            if(codContato.equals(contatoEletronico.getCodContato())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            contatoEletronico = new ContatoEletronico(codContato, nome, telefone, endereco, email, homePage, instagram);
            arrayContatoEletronico.set(indice, contatoEletronico);
        }
        
        return valid;
    }

    public boolean deletar(String codContato, ArrayList<ContatoEletronico> arrayContatoEletronico){
        ContatoEletronico contatoEletronico = new ContatoEletronico();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayContatoEletronico.size(); i++){
            contatoEletronico = arrayContatoEletronico.get(i);
            if(codContato.equals(contatoEletronico.getCodContato())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            arrayContatoEletronico.remove(indice);
        }
        
        return valid;
    }

    public void visualizar(ArrayList<ContatoEletronico> arrayContatoEletronico){
        ContatoEletronico contatoEletronico = new ContatoEletronico();

        if(arrayContatoEletronico.size() >  0){
            for(int i = 0; i < arrayContatoEletronico.size(); i++){
                contatoEletronico = arrayContatoEletronico.get(i);
                JOptionPane.showMessageDialog(null, contatoEletronico.informarDados(), "Contatos Eletronicos", JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há Contatos Eletronicos", "Contatos Eletronicos", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getHomePage() {
        return homePage;
    }
    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }
    public String getInstagram() {
        return instagram;
    }
    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }    
}
