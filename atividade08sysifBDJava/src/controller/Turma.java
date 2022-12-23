package controller;


import java.util.ArrayList;

public class Turma {
    private int codTurma;
    private int ano;
    private int semestre;
    private String horario;
    private int codDisciplina;
    private int codProfessor;
    private ArrayList<Aluno> alunos;
    
    public Turma() {
       
    }

    public Turma(int codTurma, int ano, int semestre, String horario, int codDisciplina, int codProfessor) {
        this.codTurma = codTurma;
        this.ano = ano;
        this.semestre = semestre;
        this.horario = horario;
        this.codDisciplina = codDisciplina;
        this.codProfessor = codProfessor;
    }


    public Turma(int ano, int semestre, String horario, int codDisciplina, int codProfessor) {
        this.ano = ano;
        this.semestre = semestre;
        this.horario = horario;
        this.codDisciplina = codDisciplina;
        this.codProfessor = codProfessor;
    }
    public int getCodDisciplina() {
        return codDisciplina;
    }
    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }
    public int getCodProfessor() {
        return codProfessor;
    }
    public void setCodProfessor(int codProfessor) {
        this.codProfessor = codProfessor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    public int getCodTurma() {
        return codTurma;
    }
    public void setCodTurma(int codTurma) {
        this.codTurma = codTurma;
    }
}
