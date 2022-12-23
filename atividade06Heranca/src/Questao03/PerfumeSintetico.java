package Questao03;

public class PerfumeSintetico extends Perfume{
    private String[] produto = new String[5];
    private float fatorDeRisco;
    
    public PerfumeSintetico(String nomeDeFantasia, String nomeTecnico, String dataDeCriacao, double preco, float indiceRetencao, int quantidade,
            String[] produto, float fatorDeRisco) {
        super(nomeDeFantasia, nomeTecnico, dataDeCriacao, indiceRetencao, quantidade, preco);
        this.produto = produto;
        this.fatorDeRisco = fatorDeRisco;
    }

    public void visualizarInformações(){
        System.out.println("O nome é " + super.getNomeDeFantasia());
        System.out.println("O nome tecnico é " + super.getNomeTecnico());
        System.out.println("A data de criação é " + super.getNomeTecnico());
        System.out.println("O indice de retenção é " + super.getIndiceRetencao() + "%");
        System.out.println("A quantidade em estoque é " + super.getQuantidade());
        System.out.println("O fator de risco é: " + getFatorDeRisco() + "%");
        System.out.println("Produtos utilizados: ");
        for(int i = 0; i < getProduto().length; i++){
            System.out.println(getProduto(i)); 
        }
    }

    public String[] getProduto() {
        return produto;
    }

    public String getProduto(int i) {
        return produto[i];
    }

    public void setProduto(String[] produto) {
        this.produto = produto;
    }
    public float getFatorDeRisco() {
        return fatorDeRisco;
    }
    public void setFatorDeRisco(float fatorDeRisco) {
        this.fatorDeRisco = fatorDeRisco;
    }

}
