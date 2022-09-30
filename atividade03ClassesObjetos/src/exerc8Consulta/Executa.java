package exerc8Consulta;

public class Executa {
    public static void main(String[] args) throws Exception {
       Medico med = new Medico();
       Paciente pac = new Paciente();
       Consulta consul = new Consulta();

       med.setNome("João Ramos");
       med.setCrm("1111");
       med.setEspecializacao("Cardiologia");
       System.out.println("Nome: " + med.getNome());
       System.out.println("CRM: " + med.getCrm());
       System.out.println("Especialização: " + med.getEspecializacao());

       System.out.println('\n');

       pac.setNome("Rafael Moreira");
       pac.setIdade(23);
       pac.settelefone("77 92777-7777");
       System.out.println("Nome: " + pac.getNome());
       System.out.println("Idade: " + pac.getIdade());
       System.out.println("Telefone: " + pac.gettelefone());

       System.out.println("\n");

       consul.setData("22-12-2022");
       consul.setHorario("7:30");
       consul.setTipoConsulta("Cardiograma");
       consul.setMedico(med.getNome());
       consul.setPaciente(pac.getNome());
       consul.printAgendamento();
    }
}
