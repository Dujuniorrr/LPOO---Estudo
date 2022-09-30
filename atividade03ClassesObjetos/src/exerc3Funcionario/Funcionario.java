package exerc3Funcionario;

public class Funcionario {
    private String nome;
    private int id;
    private float salario;
    private float aumentoSalario;
    private String funcao;
    
    public void setNome(String nomeInput){
        this.nome = nomeInput;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setSalario(float salarioInput){
        if(salarioInput < 0){
            System.out.println("--- Você digitou um numero negativo. Essa ação é invalida ---");
        }
        else{
            this.salario = salarioInput;
        }
       
    }
    
    public float getSalario(){
        return this.salario;
    }
    
    public void setId(int idInput){
        this.id = idInput;
    }
    
    public int getId(){
        return this.id;
    }

    public void setFuncao(String funcaoInput){
        this.funcao = funcaoInput;
    }
    
    public String getFuncao(){
        return this.funcao;
    }
    

    public void addAumento(float aumentoInput){
        if(aumentoInput < 0){
            System.out.println("--- Você digitou um numero negativo. Essa ação é invalida ---");
        }
        else if(aumentoInput == 0){
            System.out.println("--- Nenhum aumento foi adicionada ---");
        }
        else{
            aumentoSalario = (aumentoInput/100) * salario;
            salario = salario + aumentoSalario;
            System.out.println("--- O funcionario " +  this.nome + " agora tem um aumento de " + aumentoInput + "% e está recebendo: " + salario + "R$");
        }
    }


}
