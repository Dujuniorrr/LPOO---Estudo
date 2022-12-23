package Questao3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Professor extends Pessoa{
    private String titulacaoMax;

    public Professor(){

    }

    public Professor(String nome, String endereco, String telefone, Curso curso, String titulacaoMax) {
        super(nome, endereco, telefone, curso);
        this.titulacaoMax = titulacaoMax;
    }

    public boolean cadastrar(String nome, String titualacaoMax, String endereco, String telefone, String codCurso, ArrayList<Professor> arrayProfessor, ArrayList<Curso> arrayCurso){
        Professor professor = new Professor();
        boolean valid = true;
        int indice = 0;

        for(int i = 0; i < arrayProfessor.size(); i++){
            professor = arrayProfessor.get(i);
            if(nome.equals(professor.getNome())){
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
            professor = new Professor(nome, endereco, telefone, arrayCurso.get(indice), titualacaoMax);
            arrayProfessor.add(professor);
        }
        
        return valid;
    }

    public boolean editar(String nome, String titualacaoMax, String endereco, String telefone, String codCurso, ArrayList<Professor> arrayProfessor, ArrayList<Curso> arrayCurso){
        Professor professor = new Professor();
        boolean valid = false;
        int indice = 0, indiceC = 0;

        for(int i = 0; i < arrayProfessor.size(); i++){
            professor = arrayProfessor.get(i);
            if(nome.equals(professor.getNome())){
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
            professor = new Professor(nome, endereco, telefone, arrayCurso.get(indiceC), titualacaoMax);
            arrayProfessor.set(indice, professor);
        }
        
        return valid;
    }

    public boolean deletar(String nome, ArrayList<Professor> arrayProfessor){
        Professor professor = new Professor();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayProfessor.size(); i++){
            professor = arrayProfessor.get(i);
            if(nome.equals(professor.getNome())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            arrayProfessor.remove(indice);
        }
        
        return valid;
    }

    public void visualizar(ArrayList<Professor> arrayProfessor){
        Professor professor = new Professor();

        if(arrayProfessor.size() >  0){
            for(int i = 0; i < arrayProfessor.size(); i++){
                professor = arrayProfessor.get(i);
                JOptionPane.showMessageDialog(
                    null,
                    "\nNome: " + professor.getNome() + "\nTelefone: " + professor.getTelefone() + "\nEndereço: " + professor.getEndereco() + "\nTitualção máxima: " + professor.getTitulacaoMax() + "\nCurso: " + professor.getCurso().getNomeCurso(),
                    "Professors", 
                    JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há professores", "Visualizando Professores", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getTitulacaoMax() {
        return titulacaoMax;
    }

    public void setTitulacaoMax(String titulacaoMax) {
        this.titulacaoMax = titulacaoMax;
    }

}