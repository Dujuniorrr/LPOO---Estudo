package Questao10;

public class Cliente {
        
    private String nome;
    private int idade;
    private int id;
    private int cupom;
    private float carteira = 0;

    public void setNome(String nomeInput){
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

    public void setId(int idInput){
        this.id = idInput;
    }

    public int getId(){
        return this.id;
    }

    public void setCupom(int cupomInput){
        if(cupomInput < 0){
            System.out.println("----- Impossivel adicionar uma quantidade negativa no cupom ------");
        }
        else{
            this.cupom = cupomInput;
        }
    }

    public int getCupom(){
        return this.cupom;
    }

    public void addCarteira(float carteiraInput){
        if(carteiraInput > 50000){
            System.out.println("-------- A carteira já alcançou o limite de dinheiro que pode ser gasto ------------");
        }
        else if(carteiraInput < 0){
            System.out.println("----- Impossivel adicionar uma quantidade negativa na carteira ------");
        }   
        else{
            this.carteira = carteiraInput;
        }
    }

    public void retireCarteira(float carteiraInput){
        if(carteira < carteiraInput){
            System.out.println("-------- O cliente não tem dinheiro o bastante para retirar da carteira ------------");
        }
        else{
            this.carteira = this.carteira - carteiraInput;
        }
    }

    public float getCarteira(){
        return this.carteira;
    }

}