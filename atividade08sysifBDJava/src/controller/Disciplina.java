package controller;

public class Disciplina {
    private int codigo;
    private String nome;
    private String descricao;
    private int cargaHoraria;
    private int codCurso;
    
    public Disciplina(String nome, String descricao, int cargaHoraria, int codCurso) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.codCurso = codCurso;
    }

    public Disciplina() {
        
    }

    public Disciplina(int codigo, String nome, String descricao, int cargaHoraria, int codCurso) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.codCurso = codCurso;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public int getCodCurso() {
        return codCurso;
    }
    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

}
