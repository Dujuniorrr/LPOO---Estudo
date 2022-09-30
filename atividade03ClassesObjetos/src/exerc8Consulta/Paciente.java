package exerc8Consulta;

public class Paciente {
    public String nome;
    public int idade;
    public String telefone;

    public void setNome (String nomeInput){
        this.nome = nomeInput;
    }

    public String getNome(){
        return this.nome;
    }

    public void settelefone(String telefoneInput){
        this.telefone = telefoneInput;
    }

    public String gettelefone(){
        return this.telefone;
    }

    public void setIdade(int idadeInput){
        this.idade = idadeInput;
    }

    public int getIdade(){
        return this.idade;
    }
}
