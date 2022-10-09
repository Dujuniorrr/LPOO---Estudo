package Questao4;

public class Executa {
    public static void main(String[] args) throws Exception {
        Aluno alun = new Aluno();
        Aluno alun2 = new Aluno();
        
        alun.cadastrarAluno();
        alun.mostrarAluno();
        alun.alterarAluno();
        alun.mostrarAluno();
        alun.adicionarNotas();
        alun.mostrarMedia();

        alun2.cadastrarAluno();
        alun2.mostrarAluno();
        alun2.alterarAluno();
        alun2.mostrarAluno();
        alun2.adicionarNotas();
        alun2.mostrarMedia();
    }
}
