package Questao03;

public class Consultor extends Comprador{
    private int dtDeFiliacao;
    
    public Consultor(String nome, String cPF, String sexo, double saldo, int dtDeFiliacao) {
        super(nome, cPF, sexo, saldo);
        this.dtDeFiliacao = dtDeFiliacao;
    }

    public int getDtDeFiliacao() {
        return dtDeFiliacao;
    }

    public void setDtDeFiliacao(int dtDeFiliacao) {
        this.dtDeFiliacao = dtDeFiliacao;
    }

}
