package exerc4Estudante;

public class Executa {
    public static void main(String[] args) throws Exception {
        Estudante alun = new Estudante();
        float notas[] = {10, 7, 6, 5, 4};

        alun.setNome("Woquiton");
        System.out.println("\nNome: " +alun.getNome());
        alun.setEnsino("Médio");
        System.out.println("Ensino: " +alun.getEnsino());
        alun.setMatricula("20211GBI02");
        System.out.println("Matricula: " +alun.getMatricula());
        alun.addMaterias("Historia");
        alun.addNotas(1, notas);
        alun.printMedia();

        Estudante alun2 = new Estudante();
        float notas2[] = {5, 5, 5, 5, 2};
        float notas3[] = {1, 1, 1, 1, 1};


        alun2.setNome("Reinaldo");
        System.out.println("\nNome: " +alun2.getNome());
        alun2.setEnsino("Superior");
        System.out.println("Ensino: " +alun2.getEnsino());
        alun2.setMatricula("20211GBI03");
        System.out.println("Matricula: " +alun2.getMatricula());
        alun2.addMaterias("Banco de dados");
        alun2.addNotas(1, notas2);
        alun2.addMaterias("Engenharia de Software");
        alun2.addNotas(2, notas3);
        alun2.printMedia();
    }
}
