package exerc2Produto;

public class Produto {
    
    private String nome;
    private int id;
    private float preco;
    private int quant;
    private float desconto;

    public void setNome(String nomeInput){
        this.nome = nomeInput;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setPreco(float precoInput){
        this.preco = precoInput;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public void setId(int idInput){
        this.id = idInput;
    }
    
    public int getId(){
        return this.id;
    }

    public void addQuant(int quantInput){
        if(quantInput < 0){
            System.out.println("--- Você digitou um numero negativo. Essa ação é invalida ---");
        }
        else if(quantInput == 0){
            System.out.println("--- Nenhuma quantidade foi adicionada ---");
        }
        else{
            quant = quant + quantInput;
            System.out.println("--- Você tem " + this.quant + " " + this.nome + " no estoque.");
        }
    }

    public void addDesconto(float descontoInput){
        if(descontoInput < 0){
            System.out.println("--- Você digitou um numero negativo. Essa ação é invalida ---");
        }
        else if(descontoInput == 0){
            System.out.println("--- Nenhum desconto foi adicionada ---");
        }
        else{
            desconto = (descontoInput/100) * preco;
            preco = preco - desconto;
            System.out.println("--- O produto " + this.nome + " agora tem um desconto de " + descontoInput + "% e está valendo: " + preco + "R$");
        }
    }
}
