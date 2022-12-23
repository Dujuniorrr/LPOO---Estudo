package controller;

public class Professor extends Pessoa{
    String titualacaoMax;


    public Professor(String nome, String endereco, String telefone, int codCurso, String titualacaoMax) {
        super(nome, endereco, telefone, codCurso);
        this.titualacaoMax = titualacaoMax;
    }

    public Professor() {
    }

    public Professor(int codigo, String nome, String endereco, String telefone, int codCurso, String titualacaoMax) {
        super(codigo, nome, endereco, telefone, codCurso);
        this.titualacaoMax = titualacaoMax;
    }

    public Professor(int codigo, String nome, String endereco, String telefone, String titualacaoMax) {
        super(codigo, nome, endereco, telefone);
        this.titualacaoMax = titualacaoMax;
    }

    public String getTitualacaoMax() {
        return titualacaoMax;
    }

    public void setTitualacaoMax(String titualacaoMax) {
        this.titualacaoMax = titualacaoMax;
    }

}
