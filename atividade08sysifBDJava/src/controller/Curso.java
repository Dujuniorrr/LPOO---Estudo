package controller;

public class Curso {
    private int codCurso;
    private String nomeCurso;
    private String descricaoCurso;

    public Curso(String nomeCurso, String descricaoCurso) {
        this.nomeCurso = nomeCurso;
        this.descricaoCurso = descricaoCurso;
    }

    public Curso(){

    }

    public Curso(int codCurso, String nomeCurso, String descricaoCurso) {
        this.codCurso = codCurso;
        this.nomeCurso = nomeCurso;
        this.descricaoCurso = descricaoCurso;
    }
    
    public int getCodCurso() {
        return codCurso;
    }
    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public String getDescricaoCurso() {
        return descricaoCurso;
    }
    public void setDescricaoCurso(String descricao) {
        this.descricaoCurso = descricao;
    }
}
