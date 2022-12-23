package Questao6;

public class Executa {
   public static void main(String[] args) {
        //funcionario chefe
        Funcionario func = new Funcionario("Glauber Rocha", "002", 10000);

        //funcionarios, fiz sem usar for mesmo
        Funcionario[] funcs = new Funcionario[3];
        funcs[0] = new Funcionario("Antonio Trindade", "003", 2000);
        funcs[1] = new Funcionario("José da Silva", "004", 5000);
        funcs[2] = new Funcionario("Bento Pereira", "005", 6000);
    
        //departamento
        Departamento dpt = new Departamento("DP001", "Setor alimenticio", funcs, func);

        //informando o departamento, seu chefe e os funcionarios alocado nele
        System.out.print("\nO departamento " + dpt.getId() + " tem como chefe o funcionario " + dpt.getChefe().getNome() + " que lidera os seguintes funcionarios: ");
        for(int i = 0; i < 3; i++){
            System.out.print( dpt.getFuncionario(i).getNome() + "; ");
        }

   }
}
