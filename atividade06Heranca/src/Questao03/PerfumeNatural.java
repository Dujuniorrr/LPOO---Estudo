package Questao03;

public class PerfumeNatural extends Perfume {
    private String insumos[] = new String[5];

    public PerfumeNatural(String nomeDeFantasia, String nomeTecnico, String dataDeCriacao, double preco, float indiceRetencao, int quantidade,
            String[] insumos) {
        super(nomeDeFantasia, nomeTecnico, dataDeCriacao, indiceRetencao, quantidade, preco);
        this.insumos = insumos;
    }

    public void visualizarInformações(){
        System.out.println("O nome é " + super.getNomeDeFantasia());
        System.out.println("O nome tecnico é " + super.getNomeTecnico());
        System.out.println("A data de criação é " + super.getNomeTecnico());
        System.out.println("O indice de retenção é " + super.getIndiceRetencao() + "%");
        System.out.println("A quantidade em estoque é " + super.getQuantidade());
        System.out.println("Insumos utilizados: ");
        for(int i = 0; i < getInsumos().length; i++){
            System.out.println(getInsumos(i)); 
        }
    }

    public String[] getInsumos() {
        return insumos;
    }

    public String getInsumos(int i) {
        return insumos[i];
    }

    public void setInsumos(String[] insumos) {
        this.insumos = insumos;
    }


}
