package Questao3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Turma {
    private String nomeTurma;
    private String ano;
    private byte semestre;
    private String horario;
    private Professor professor;
    private Materia materia;
    private ArrayList<Aluno> alunos;
    
    public Turma(){

    }

    public Turma(String nomeTurma, String ano, byte semestre, String horario, Professor professor, Materia materia,
            ArrayList<Aluno> alunos) {
        this.nomeTurma = nomeTurma;
        this.ano = ano;
        this.semestre = semestre;
        this.horario = horario;
        this.professor = professor;
        this.materia = materia;
        this.alunos = alunos;
    }

    public Turma(String nomeTurma, String ano, byte semestre, String horario, Professor professor, Materia materia) {
        this.nomeTurma = nomeTurma;
        this.ano = ano;
        this.semestre = semestre;
        this.horario = horario;
        this.professor = professor;
        this.materia = materia;
        this.alunos = new ArrayList<>();
    }

    public boolean abrirTurma(String nomeTurma, String ano, String horario, String nomeProfessor, String codigoMateria, byte semestre, ArrayList<Professor> arrayProfessor, ArrayList<Materia> arrayMateria, ArrayList<Turma> arrayTurma){
        Turma turma = new Turma();
        boolean valid = true;
        int indiceP = 0, indiceM = 0;

        for(int i = 0; i < arrayTurma.size(); i++){
            turma = arrayTurma.get(i);
            if(nomeTurma.equals(turma.getNomeTurma())){
                valid = false;
                break;
            }
        }

        if(valid == true){
            valid = false;
            for(int i = 0; i < arrayProfessor.size(); i++){
                Professor professor = arrayProfessor.get(i);
                if(nomeProfessor.equals(professor.getNome())){
                    valid = true;
                    indiceP = i;
                    break;
                }
            }
        }

        if(valid == true){
            valid = false;
            for(int i = 0; i < arrayMateria.size(); i++){
                Materia materia = arrayMateria.get(i);
                if(codigoMateria.equals(materia.getCodigoMateria())){
                    valid = true;
                    indiceP = i;
                    break;
                }
            }
        }

        if(valid == true){
            valid = false;
            if((arrayProfessor.get(indiceP).getCurso().getCodCurso()).equals(arrayMateria.get(indiceM).getCurso().getCodCurso())){
                valid = true;
            }
        }


        if(valid == true){
            turma = new Turma(nomeTurma, ano, semestre, horario, arrayProfessor.get(indiceP), arrayMateria.get(indiceM));
            arrayTurma.add(turma);
        }
        
        return valid;
    }

    public boolean editar(String nomeTurma, String ano, String horario, String nomeProfessor, String codigoMateria, byte semestre, ArrayList<Professor> arrayProfessor, ArrayList<Materia> arrayMateria, ArrayList<Turma> arrayTurma){
        Turma turma = new Turma();
        boolean valid = false;
        int indice = 0, indiceP = 0, indiceM = 0;

        for(int i = 0; i < arrayTurma.size(); i++){
            turma = arrayTurma.get(i);
            if(nomeTurma.equals(turma.getNomeTurma())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            valid = false;
            for(int i = 0; i < arrayProfessor.size(); i++){
                Professor professor = arrayProfessor.get(i);
                if(nomeProfessor.equals(professor.getNome())){
                    valid = true;
                    indiceP = i;
                    break;
                }
            }
        }

        if(valid == true){
            valid = false;
            for(int i = 0; i < arrayMateria.size(); i++){
                Materia materia = arrayMateria.get(i);
                if(codigoMateria.equals(materia.getCodigoMateria())){
                    valid = true;
                    indiceM = i;
                    break;
                }
            }
        }

        if(valid == true){
            valid = false;
            if( (arrayProfessor.get(indiceP).getCurso().getCodCurso()).equals(arrayMateria.get(indiceM).getCurso().getCodCurso())){
                valid = true;
            }
        }

        if(valid == true){
            turma = new Turma(nomeTurma, ano, semestre, horario, arrayProfessor.get(indiceP), arrayMateria.get(indiceM));
            arrayTurma.set(indice, turma);
        }
        
        return valid;
    }

    public boolean deletar(String nomeTurma, ArrayList<Turma> arrayTurma){
        Turma turma = new Turma();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayTurma.size(); i++){
            turma = arrayTurma.get(i);
            if(nomeTurma.equals(turma.getNomeTurma())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            arrayTurma.remove(indice);
        }
        
        return valid;
    }

    public void visualizar(ArrayList<Turma> arrayTurma){
        Turma turma = new Turma();

        if(arrayTurma.size() >  0){

            for(int i = 0; i < arrayTurma.size(); i++){

                turma = arrayTurma.get(i);
                String infoAlunos = "";
                String info =  "\nNome da turma: " + turma.getNomeTurma() + "\nSemestre: " + turma.getSemestre() + "\nAno: " + turma.getAno() +  "\nHorario: " + turma.getHorario() + "\nMateria:  " + turma.getMateria().getNomeMateria() + "\nProfessor: " + turma.getProfessor().getNome();

                if(turma.getAlunos().size() > 0){
                    info = info + "\nAlunos:";
                    for(int x = 0; x < turma.getAlunos().size(); x++){
                        infoAlunos = "\nNome: " + turma.getAlunos().get(x).getNome()+ " - Matricula: " + turma.getAlunos().get(x).getMatricula();
                    }
                    info = info + infoAlunos;
                }

                JOptionPane.showMessageDialog(
                    null,
                    info
                    , "Visualizando turmas",
                    JOptionPane.PLAIN_MESSAGE);
               
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há turmas", "Visualizando turmas", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean adicionarAlunos(String nomeTurma, String matricula, ArrayList<Aluno> arrayAluno, ArrayList<Turma> arrayTurma){
        Turma turmaAux = new Turma();
        Aluno alunoAux = new Aluno();
        boolean valid = false;
        int indiceAluno = 0;
        int indiceTurma = 0;

        if(arrayTurma.size() > 0){
            for(int i = 0; i < arrayTurma.size(); i++){
                turmaAux = arrayTurma.get(i);
                if(nomeTurma.equals(turmaAux.getNomeTurma())){
                     indiceTurma = i;
                     valid = true;
                     break;
                }
            }
    
            if(valid == true){
                for(int i = 0; i < arrayAluno.size(); i++){
                    alunoAux = arrayAluno.get(i);
                    if(matricula.equals(alunoAux.getMatricula())){
                         indiceAluno = i;
                         valid = true;
                         break;
                    }
                    else{
                        valid = false;
                    }
                }
                if(valid == true){
                    if(arrayTurma.get(indiceTurma).getAlunos().size() > 0){
                        for(int i = 0; i < arrayTurma.get(indiceTurma).getAlunos().size(); i++){
                            alunoAux = arrayTurma.get(indiceTurma).getAlunos().get(i);
                            if(matricula.equals(alunoAux.getMatricula())){
                                 valid = false;
                                 break;
                            }
                        }
                    }
                }
            }
    
            alunoAux = arrayAluno.get(indiceAluno);
            turmaAux = arrayTurma.get(indiceTurma);
    
            if(valid == true){
                valid = false;
                if((arrayAluno.get(indiceAluno)).getCurso().getCodCurso().equals(arrayTurma.get(indiceTurma).getMateria().getCurso().getCodCurso())){
                    valid = true;
                }
            }

            if(valid == true){
                arrayTurma.get(indiceTurma).setAlunos(alunoAux);
            }
        }
        
        return valid;
    }


    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public byte getSemestre() {
        return semestre;
    }
    public void setSemestre(byte semestre) {
        this.semestre = semestre;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Materia getMateria() {
        return materia;
    }
    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(Aluno alunos) {
        this.alunos.add(alunos);
    }
    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }
}