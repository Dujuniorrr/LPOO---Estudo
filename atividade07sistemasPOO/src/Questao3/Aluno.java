package Questao3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa{
    private String matricula;
    private String situacao;

    public Aluno(){

    }
    public Aluno(String nome, String endereco, String telefone, Curso curso, String matricula, String situacao) {
        super(nome, endereco, telefone, curso);
        this.matricula = matricula;
        this.situacao = situacao;
    }

    public boolean cadastrar(String matricula, String nome, String endereco, String telefone, String situacao, String codCurso, ArrayList<Aluno> arrayAluno, ArrayList<Curso> arrayCurso){
        Aluno aluno = new Aluno();
        boolean valid = true;
        int indice = 0;

        for(int i = 0; i < arrayAluno.size(); i++){
            aluno = arrayAluno.get(i);
            if(matricula.equals(aluno.getMatricula())){
                valid = false;
                break;
            }
        }

        if(valid == true){
            valid = false;
            for(int i = 0; i < arrayCurso.size(); i++){
                Curso curso = arrayCurso.get(i);
                if(codCurso.equals(curso.getCodCurso())){
                    valid = true;
                    indice = i;
                    break;
                }
            }
        }

        if(valid == true){
            aluno = new Aluno(nome, endereco, telefone, arrayCurso.get(indice), matricula, situacao);
            arrayAluno.add(aluno);
        }
        
        return valid;
    }


    public boolean editar(String matricula, String nome, String endereco, String telefone, String situacao, String codCurso, ArrayList<Aluno> arrayAluno, ArrayList<Curso> arrayCurso){
        Aluno aluno = new Aluno();
        boolean valid = false;
        int indice = 0, indiceC = 0;

        for(int i = 0; i < arrayAluno.size(); i++){
            aluno = arrayAluno.get(i);
            if(matricula.equals(aluno.getMatricula())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            valid = false;
            for(int i = 0; i < arrayCurso.size(); i++){
                Curso curso = arrayCurso.get(i);
                if(codCurso.equals(curso.getCodCurso())){
                    valid = true;
                    indiceC = i;
                    break;
                }
            }
        }

        if(valid == true){
            aluno = new Aluno(nome, endereco, telefone, arrayCurso.get(indiceC), matricula, situacao);
            arrayAluno.set(indice, aluno);
        }
        
        return valid;
    }

    public boolean deletar(String materia, ArrayList<Aluno> arrayAluno){
        Aluno aluno = new Aluno();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayAluno.size(); i++){
            aluno = arrayAluno.get(i);
            if(materia.equals(aluno.getMatricula())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            arrayAluno.remove(indice);
        }
        
        return valid;
    }


    public void visualizar(ArrayList<Aluno> arrayAluno){
        Aluno aluno = new Aluno();

        if(arrayAluno.size() >  0){
            for(int i = 0; i < arrayAluno.size(); i++){
                aluno = arrayAluno.get(i);
                JOptionPane.showMessageDialog(
                    null,
                    "\nMatricula: " + aluno.getMatricula() + "\nNome: " + aluno.getNome() + "\nTelefone: " + aluno.getTelefone() +  "\nEndereço: " + aluno.getEndereco() + "\nSituação: " + aluno.getSituacao() + "\nCurso: " + aluno.getCurso().getNomeCurso(),
                    "Alunos", 
                    JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há alunos", "Visualizando alunos", JOptionPane.ERROR_MESSAGE);
        }
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