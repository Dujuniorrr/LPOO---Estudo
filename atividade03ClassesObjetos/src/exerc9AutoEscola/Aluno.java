package exerc9AutoEscola;

public class Aluno {
    public String nome;
    public int idade;
    public float carteira;
    public int nivelAprendizagem;

    public void setNome (String nomeInput){
        this.nome = nomeInput;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idadeInput){
        this.idade = idadeInput;
    }

    public int getIdade(){
        return this.idade;
    }

    public void addCarteira(float carteiraInput){
        if(carteiraInput > 50000){
            System.out.println("-------- Sua carteira já alcançou o limite de dinheiro que pode ser gasto ------------");
        }
        else if(carteiraInput < 0){
            System.out.println("----- impossivel adicionar uma quantidade negativa na carteira ------");
        }   
        else{
            this.carteira = carteiraInput;
        }
    }

    public float getCarteira(){
        return this.carteira;
    }

    public void addNivel(int nivelInput){
        if(nivelInput > 5){
            System.out.println("-------- O aluno ja alcançou o nivel máximo de aprendizagem ------------");
        }
        else if(nivelInput < 0){
            System.out.println("----- impossivel adicionar um nivel negativo------");
        }   
        else{
            this.nivelAprendizagem = nivelInput;
        }
    }

    public int getNivel(){
        return this.nivelAprendizagem;
    }
}
