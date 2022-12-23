package Questao8;

public class Executa {
    public static void main(String[] args) throws Exception {
       Medico med = new Medico();
       Paciente pac = new Paciente();
       Consulta consul = new Consulta();

       med.cadastrarMedico();
       med.mostrarMedico();
       med.alterarMedico();
       med.mostrarMedico();

       pac.cadastrarPaciente();
       pac.mostrarPaciente();
       pac.alterarPaciente();
       pac.mostrarPaciente();

       consul.marcarConsulta(pac, med);
       consul.visualizarConsulta();

    }
}
