package exerc9AutoEscola;

public class Professor {
    public String nome;
    public int nivelEnsino;
    public String dataDisponivel;

    public void setNome (String nomeInput){
        this.nome = nomeInput;
    }

    public String getNome(){
        return this.nome;
    }

    public void addNivel(int nivelInput){
        if(nivelInput > 5){
            System.out.println("-------- O aluno ja alcançou o nivel máximo de aprendizagem ------------");
        }
        else if(nivelInput < 1){
            System.out.println("----- Nivel inválido ------");
        }   
        else{
            this.nivelEnsino = nivelInput;
        }
    }

    public int getNivel(){
        return this.nivelEnsino;
    }

    public void setData(String dataInput){
        this.dataDisponivel = dataInput;
    }

    public String getData(){
        return this.dataDisponivel;
    }

}
