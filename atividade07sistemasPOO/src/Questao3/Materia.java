package Questao3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Materia {
    private String nomeMateria;
    private String codigoMateria;
    private String descricao;
    private String cargaHoraria;
    private Curso curso;

    public Materia() {

    }

    public Materia(String nomeMateria, String codigoMateria, String descricao, String cargaHoraria, Curso curso) {
        this.nomeMateria = nomeMateria;
        this.codigoMateria = codigoMateria;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.curso = curso;
    }

    public boolean cadastrar(String nomeMateria, String codigoMateria, String descricao, String cargaHoraria,String codCurso, ArrayList<Materia> arrayMateria, ArrayList<Curso> arrayCurso){
        Materia materia = new Materia();
        boolean valid = true;
        int indice = 0;

        for(int i = 0; i < arrayMateria.size(); i++){
            materia = arrayMateria.get(i);
            if(codigoMateria.equals(materia.getCodigoMateria())){
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
            materia = new Materia(nomeMateria, codigoMateria, descricao, cargaHoraria, arrayCurso.get(indice));
            arrayMateria.add(materia);
        }
        
        return valid;
    }

    
    public boolean editar(String nomeMateria, String codigoMateria, String descricao, String cargaHoraria,String codCurso, ArrayList<Materia> arrayMateria, ArrayList<Curso> arrayCurso){
        Materia materia = new Materia();
        boolean valid = false;
        int indice = 0, indiceC = 0;

        for(int i = 0; i < arrayMateria.size(); i++){
            materia = arrayMateria.get(i);
            if(codigoMateria.equals(materia.getCodigoMateria())){
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
            materia = new Materia(nomeMateria, codigoMateria, descricao, cargaHoraria, arrayCurso.get(indiceC));
            arrayMateria.set(indice, materia);
        }
        
        return valid;
    }

    public boolean deletar(String codigoMateria, ArrayList<Materia> arrayMateria){
        Materia materia = new Materia();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayMateria.size(); i++){
            materia = arrayMateria.get(i);
            if(codigoMateria.equals(materia.getCodigoMateria())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            arrayMateria.remove(indice);
        }
        
        return valid;
    }

    public void visualizar(ArrayList<Materia> arrayMateria){
        Materia materia = new Materia();

        if(arrayMateria.size() >  0){
            for(int i = 0; i < arrayMateria.size(); i++){
                materia = arrayMateria.get(i);
                JOptionPane.showMessageDialog(
                    null,
                    "\nCodigo: " + materia.getCodigoMateria() + "\nNome: " + materia.getNomeMateria() + "\nDescrição: " + materia.getDescricao() +  "\nCarga Horaria: " + materia.getCargaHoraria() + "\nCurso: " + materia.getCurso().getNomeCurso(),
                    "Materias", 
                    JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há materias", "Visualizando materias", JOptionPane.ERROR_MESSAGE);
        }
    }


    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }
    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }


}
