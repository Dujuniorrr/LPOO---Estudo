package Questao8;

import java.util.Scanner;

public class Consulta {
    static Scanner scan = new Scanner(System.in);
    private String data;
    private String horario;
    private String tipoConsulta;
    private String paciente;
    private String cpfPaciente;
    private String medico;
    private String crmMedico;

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

    public void setCpf(String cpfInput){
        this.cpfPaciente = cpfInput;
    }

    public void setCrm(String crmInput){
        this.crmMedico = crmInput;
    }

    public void marcarConsulta(Paciente pac, Medico med) throws InterruptedException{
        clearConsole();
        System.out.println("======= Marcar Consulta ========\n");
        setPaciente(pac.getNome());
        setCpf(pac.getCpf());
        setMedico(med.getNome());
        setCrm(med.getCrm());
        System.out.println("Medico: " + this.medico);
        System.out.println("CRM: " + this.crmMedico);
        System.out.println("Paciente: " + this.paciente);
        System.out.println("Cpf: " + this.cpfPaciente);
        System.out.print("Digite a data da consulta: ");
        setData(scan.nextLine());
        System.out.print("Digite o horario da consulta: ");
        setHorario(scan.nextLine());
        System.out.print("Digite o tipo da consulta: ");
        String tipoConsul = scan.nextLine();
        if(tipoConsul.equals(med.getEspecializacao())){
            setTipoConsulta(tipoConsul);
        }
        else{
            System.out.println("O médico escolhido não tem essa especialização.");
            Thread.sleep(3000);
        }
    }

    public void visualizarConsulta() throws InterruptedException{
        clearConsole();
        System.out.println("------- Consulta -------");
        System.out.println("Data: " + this.data);
        System.out.println("Horario: " + this.horario);
        System.out.println("Tipo da consulta: " + this.tipoConsulta);
        System.out.println("Medico: " + this.medico);
        System.out.println("CRM: " + this.crmMedico);
        System.out.println("Paciente: " + this.paciente);
        System.out.println("Cpf: " + this.cpfPaciente);
        Thread.sleep(3000);
    }

    public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
