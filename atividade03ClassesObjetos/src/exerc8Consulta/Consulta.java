package exerc8Consulta;

public class Consulta {
    public String data;
    public String horario;
    public String tipoConsulta;
    public String paciente;
    public String medico;

    public void setData (String dataInput){
        this.data = dataInput;
    }

    public void setHorario (String horarioInput){
        this.horario = horarioInput;
    }

    public void setTipoConsulta (String tipoInput){
        this.tipoConsulta = tipoInput;
    }

    public void setPaciente (String pacienteInput){
        this.paciente = pacienteInput;
    }

    public void setMedico (String medicoInput){
        this.medico = medicoInput;
    }

    public void printAgendamento(){
        System.out.println("------- Consulta -------");
        System.out.println("Data: " + data);
        System.out.println("Horario: " + horario);
        System.out.println("Tipo da consulta: " + tipoConsulta);
        System.out.println("Medico: " + medico);
        System.out.println("Paciente: " + paciente);
    }
}
