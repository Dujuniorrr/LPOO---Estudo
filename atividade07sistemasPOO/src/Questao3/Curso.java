package Questao3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Curso{
    private String codCurso;
    private String nomeCurso;
    private String descricao;

    public Curso() {

    }

    public Curso( String codCurso, String nomeCurso, String descricao) {
        this.codCurso = codCurso;
        this.descricao = descricao;
        this.nomeCurso = nomeCurso;
    }

      
    public boolean cadastrar(String codCurso, String nomeCurso, String descricao, ArrayList<Curso> arrayCurso){

        Curso curso = new Curso();
        boolean valid = true;

        for(int i = 0; i < arrayCurso.size(); i++){
            curso = arrayCurso.get(i);
            if(codCurso.equals(curso.getCodCurso())){
                valid = false;
                break;
            }
        }

        if(valid == true){
            curso = new Curso(codCurso, nomeCurso, descricao);
            arrayCurso.add(curso);
        }
        
        return valid;
    }

    public boolean editar(String codCurso, String nomeCurso, String descricao, ArrayList<Curso> arrayCurso){

        Curso curso = new Curso();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayCurso.size(); i++){
            curso = arrayCurso.get(i);
            if(codCurso.equals(curso.getCodCurso())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            curso = new Curso(codCurso, nomeCurso, descricao);
            arrayCurso.set(indice, curso);
        }
        
        return valid;
    }


    public boolean deletar(String codCurso, ArrayList<Curso> arrayCurso){
        Curso curso = new Curso();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayCurso.size(); i++){
            curso = arrayCurso.get(i);
            if(codCurso.equals(curso.getCodCurso())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            arrayCurso.remove(indice);
        }
        
        return valid;
    }

    public void visualizar(ArrayList<Curso> arrayCurso){
        Curso curso = new Curso();

        if(arrayCurso.size() >  0){
            for(int i = 0; i < arrayCurso.size(); i++){
                curso = arrayCurso.get(i);
                JOptionPane.showMessageDialog(
                    null,
                    "\nCodigo: " + curso.codCurso + "\nNome: " + curso.getNomeCurso() + "\nDescrição: " + curso.getDescricao(),
                    "Cursos", 
                    JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há Cursos", "Visualizando Cursos", JOptionPane.ERROR_MESSAGE);
        }
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}
