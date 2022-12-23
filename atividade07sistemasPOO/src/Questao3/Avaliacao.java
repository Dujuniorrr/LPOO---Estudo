package Questao3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Avaliacao {
    private float nota1;
    private float nota2;
    private float provaFinal;
    private int frequencia;
    private Aluno aluno;
    private Turma turma;
    

    public Avaliacao(){

    }
    
    public Avaliacao(float nota1, float nota2, float provaFinal, int frequencia, Aluno aluno, Turma turma) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.provaFinal = provaFinal;
        this.frequencia = frequencia;
        this.aluno = aluno;
        this.turma = turma;
    }

    public boolean lancarAvaliacao(float nota1, float nota2, float provaFinal, int frequencia, String nomeTurma, String matricula, ArrayList<Aluno> arrayAluno, ArrayList<Turma> arrayTurma, ArrayList<Avaliacao> arrayAvaliacao){

        Avaliacao avaliacao = new Avaliacao();
        boolean valid = false;
        int indiceA = 0, indiceT = 0;

        for(int i = 0; i < arrayAluno.size(); i++){
            Aluno aluno = arrayAluno.get(i);
            if(matricula.equals(aluno.getMatricula())){
                valid = true;
                indiceA = i;
                break;
            }
        }

        if(valid == true){
            valid = false;
            for(int i = 0; i < arrayTurma.size(); i++){
                Turma turma = arrayTurma.get(i);
                if(nomeTurma.equals(turma.getNomeTurma())){
                    valid = true;
                    indiceT = i;
                    break;
                }
            }
        }

        if(valid == true){
            valid = false;
            if( arrayAluno.get(indiceA).getCurso().getCodCurso().equals(arrayTurma.get(indiceT).getMateria().getCurso().getCodCurso()) ){
                valid = true;
            }
        }

        if(valid == true){
            avaliacao = new Avaliacao(nota1, nota2, provaFinal, frequencia, arrayAluno.get(indiceA), arrayTurma.get(indiceT));
            arrayAvaliacao.add(avaliacao);
        }
        
        return valid;
    }

    public void visualizar(ArrayList<Avaliacao> arrayAvaliacao){
        Avaliacao avaliacao = new Avaliacao();

        if(arrayAvaliacao.size() >  0){
            for(int i = 0; i < arrayAvaliacao.size(); i++){
                avaliacao = arrayAvaliacao.get(i);
                JOptionPane.showMessageDialog(
                    null,
                    "\nNota1: " + avaliacao.getNota1() + "\nNota2: " + avaliacao.getNota2() + "\nProva Final: " + avaliacao.getProvaFinal() + "\nFrequencia: " + avaliacao.getFrequencia() + "\nTurma: " + avaliacao.getTurma().getNomeTurma() + "\nAluno: " + avaliacao.getAluno().getNome()  + " - " + avaliacao.getAluno().getMatricula(),
                    "Avaliacaos", 
                    JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há avaliacaoes", "Visualizando Avaliacaoes", JOptionPane.ERROR_MESSAGE);
        }
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
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }

}
