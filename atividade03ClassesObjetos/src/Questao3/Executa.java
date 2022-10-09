package Questao3;

public class Executa {
    public static void main(String[] args) throws Exception {
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();

        func1.cadastrarFuncionario();
        func1.mostrarFuncionario();
        func1.alterarFuncionario();
        func1.mostrarFuncionario();

        func2.cadastrarFuncionario();
        func2.mostrarFuncionario();
        func2.alterarFuncionario();
        func2.mostrarFuncionario();
        
    }
}
