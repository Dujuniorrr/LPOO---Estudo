package exerc3Funcionario;

public class Executa {
    public static void main(String[] args) throws Exception {
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        Funcionario func3 = new Funcionario();

        func1.setId(1);
        System.out.println("ID: " + func1.getId());
        func1.setNome("Chico Buarque");
        System.out.println("Nome: " + func1.getNome());
        func1.setSalario(1200f);
        System.out.println("Salário: " + func1.getSalario());
        func1.setFuncao("Secretário");
        System.out.println("Função: " + func1.getFuncao());
        func1.addAumento(15);
        
        System.out.println("\n");

        func2.setId(2);
        System.out.println("ID: " + func2.getId());
        func2.setNome("Tom Jobim");
        System.out.println("Nome: " + func2.getNome());
        func2.setSalario(2300f);
        System.out.println("Salário: " + func2.getSalario());
        func2.setFuncao("Gerente do setor de vendas");
        System.out.println("Função: " + func2.getFuncao());
        func2.addAumento(35);
        
        System.out.println("\n");

        func3.setId(3);
        System.out.println("ID: " + func3.getId());
        func3.setNome("Caetano Veloso");
        System.out.println("Nome: " + func3.getNome());
        func3.setSalario(-1);
        System.out.println("Salário: " + func3.getSalario());
        func3.setFuncao("Faxineiro");
        System.out.println("Função: " + func3.getFuncao());
        func3.addAumento(-1);
        
    }
}
