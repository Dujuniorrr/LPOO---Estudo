package exerc8Consulta;

public class Medico {
    private String nome;
    private String especializacao;
    private String crm;
    
    public void setNome (String nomeInput){
        this.nome = nomeInput;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEspecializacao(String especializacaoInput){
        this.especializacao = especializacaoInput;
    }

    public String getEspecializacao(){
        return this.especializacao;
    }

    public void setCrm(String crmInput){
        this.crm = crmInput;
    }

    public String getCrm(){
        return this.crm;
    }
}