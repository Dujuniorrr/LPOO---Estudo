package controller;

public class Avaliacao {
    private float nota1;
    private float nota2;
    private float provaFinal;
    private int frequencia;
    private int codAluno;
    private int codTurma;
    

    public Avaliacao() {
        
    }

    public Avaliacao(float nota1, float nota2, float provaFinal, int frequencia, int codAluno, int codTurma) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.provaFinal = provaFinal;
        this.frequencia = frequencia;
        this.codAluno = codAluno;
        this.codTurma = codTurma;
    }

    public float getNota1() {
        return nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public float getNota2() {
        return nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    public float getProvaFinal() {
        return provaFinal;
    }
    public void setProvaFinal(float provaFinal) {
        this.provaFinal = provaFinal;
    }
    public int getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
    public int getCodAluno() {
        return codAluno;
    }
    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }
    public int getCodTurma() {
        return codTurma;
    }
    public void setCodTurma(int codTurma) {
        this.codTurma = codTurma;
    }
}
