package controller;

public class Aluno extends Pessoa{
    private String matricula;
    private String situacao;

    public Aluno(String nome, String endereco, String telefone, int codCurso, String matricula, String situacao) {
        super(nome, endereco, telefone, codCurso);
        this.matricula = matricula;
        this.situacao = situacao;
    }
    public Aluno() {
    }
    public Aluno(int codigo, String nome, String endereco, String telefone, int codCurso, String matricula,
            String situacao) {
        super(codigo, nome, endereco, telefone, codCurso);
        this.matricula = matricula;
        this.situacao = situacao;
    }
    public Aluno(int codigo, String nome, String endereco, String telefone, String matricula, String situacao) {
        super(codigo, nome, endereco, telefone);
        this.matricula = matricula;
        this.situacao = situacao;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }


}
