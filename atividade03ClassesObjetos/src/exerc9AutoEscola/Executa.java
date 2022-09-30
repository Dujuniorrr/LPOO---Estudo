package exerc9AutoEscola;

public class Executa {
    public static void main(String[] args) throws Exception {
        Aluno alun1 = new Aluno();
        Professor prof1 = new Professor();
        Agendamento agen1 = new Agendamento();

        alun1.setNome("Jô Soares");
        alun1.setIdade(19);
        alun1.addCarteira(1000f);
        alun1.addNivel(2);

        System.out.println("Nome: " + alun1.getNome());
        System.out.println("Idade: " + alun1.getIdade());
        System.out.println("Carteira: " + alun1.getCarteira());
        System.out.println("Nivel: " + alun1.getNivel());

        prof1.setNome("Silvio Santos");
        prof1.setData("02/12/2022 12:12:12");
        prof1.addNivel(3);

        System.out.println("\n");
        System.out.println("Nome: " + prof1.getNome());
        System.out.println("Nivel: " + prof1.getNivel());
        System.out.println("Data disponivel: " + prof1.getData());

        System.out.println("\n");
        agen1.setNomeAluno(alun1.getNome());
        agen1.setNomeProfessor(prof1.getNome());
        agen1.setNivel(alun1.getNivel(), prof1.getNivel());
        agen1.setCarteiraAluno(alun1.getCarteira());
        agen1.setDataDisponivelProf(prof1.getData());
        agen1.setReservaData("02/12/2022 12:12:12");
        agen1.getAgendamento();

        //---------------------------------------------------------------------------//

        System.out.println("\n");
        
        Aluno alun2 = new Aluno();
        Professor prof2 = new Professor();
        Agendamento agen2 = new Agendamento();

        alun2.setNome("Bon Jovi");
        alun2.setIdade(19);
        alun2.addCarteira(500f);
        alun2.addNivel(4);

        System.out.println("Nome: " + alun2.getNome());
        System.out.println("Idade: " + alun2.getIdade());
        System.out.println("Carteira: " + alun2.getCarteira());
        System.out.println("Nivel: " + alun2.getNivel());

        prof2.setNome("David Bowie");
        prof2.setData("02/22/2022 22:22:22");
        prof2.addNivel(3);

        System.out.println("\n");
        System.out.println("Nome: " + prof2.getNome());
        System.out.println("Nivel: " + prof2.getNivel());
        System.out.println("Data disponivel: " + prof2.getData());

        System.out.println("\n");
        agen2.setNomeAluno(alun2.getNome());
        agen2.setNomeProfessor(prof2.getNome());
        agen2.setNivel(alun2.getNivel(), prof2.getNivel());
        agen2.setCarteiraAluno(alun2.getCarteira());
        agen2.setDataDisponivelProf(prof2.getData());
        agen2.setReservaData("02/12/2022 12:12:12");
        agen2.getAgendamento();

    }
}

