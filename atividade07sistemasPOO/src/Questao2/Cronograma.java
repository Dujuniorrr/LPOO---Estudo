package Questao2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cronograma {
    private String codCronograma;
    private String mes;
    private int diaInicio;
    private int diaFinal;
    private ArrayList<Evento> eventos;

    public Cronograma() {
        
    }

    public Cronograma(String codCronograma, String mes, int diaInicio, int diaFinal, ArrayList<Evento> eventos) {
        this.codCronograma = codCronograma;
        this.mes = mes;
        this.diaInicio = diaInicio;
        this.diaFinal = diaFinal;
        this.eventos = eventos;
    }
    
    public boolean adicionar(String codCronograma, String mes, int diaInicio, int diaFinal, ArrayList<Evento> eventos, ArrayList<Cronograma> arrayCronograma, ArrayList<Evento> arrayEvento, ArrayList<String> codigosEvento){
        Evento eventoAux = new Evento();
        ArrayList<Evento> eventoInput = new ArrayList<>();
        Cronograma cronograma = new Cronograma();
        boolean valid = true;

        for(int i = 0; i < arrayCronograma.size(); i++){
            cronograma = arrayCronograma.get(i);
            if(codCronograma.equals(cronograma.getCodCronograma())){
                valid = false;
                break;
            }
        }

        if(valid == true){
            for(int i = 0; i < arrayEvento.size(); i++){
                eventoAux = arrayEvento.get(i);
                for(int x = 0; x < codigosEvento.size(); x++){
                    String codigo = codigosEvento.get(x);
                    if(codigo.equals(eventoAux.getCodEvento())){
                         eventoInput.add(eventoAux);
                    }
                }   
            }

            for(int i = 0; i < eventoInput.size(); i++){
                eventoAux = eventoInput.get(i);
                if(eventoAux.getDiaEvento() >= diaInicio && eventoAux.getDiaEvento() <= diaFinal ){
                    valid = true;
                }
                else{
                    valid = false;
                    break;
                }
            }
        }

        if(valid == true){
            cronograma = new Cronograma(codCronograma, mes, diaInicio, diaFinal, eventoInput);
            arrayCronograma.add(cronograma);
        }
        
        return valid;
    }


    public boolean deletar(String codCronograma, ArrayList<Cronograma> arrayCronograma){
        Cronograma cronograma = new Cronograma();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayCronograma.size(); i++){
            cronograma = arrayCronograma.get(i);
            if(codCronograma.equals(cronograma.getCodCronograma())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            arrayCronograma.remove(indice);
        }
        
        return valid;
    }


    public void visualizar(ArrayList<Cronograma> arrayCronograma){
        Cronograma cronograma = new Cronograma();

        if(arrayCronograma.size() >  0){
            for(int i = 0; i < arrayCronograma.size(); i++){
                cronograma = arrayCronograma.get(i);
                JOptionPane.showMessageDialog(null, cronograma.informarDados(), "Cronogramas", JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há Cronogramas", "Cronogramas", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean adicionarEvento(String codCronograma, String codEvento, ArrayList<Evento> arrayEvento, ArrayList<Cronograma> arrayCronograma){
        Cronograma cronogramaAux = new Cronograma();
        Evento eventoAux = new Evento();
        boolean valid = false;
        int indiceEvento = 0;
        int indiceCronograma = 0;

        if(arrayCronograma.size() > 0){
            for(int i = 0; i < arrayCronograma.size(); i++){
                cronogramaAux = arrayCronograma.get(i);
                if(codCronograma.equals(cronogramaAux.getCodCronograma())){
                     indiceCronograma = i;
                     valid = true;
                     break;
                }
            }
    
            if(valid == true){
                for(int i = 0; i < arrayEvento.size(); i++){
                    eventoAux = arrayEvento.get(i);
                    if(codEvento.equals(eventoAux.getCodEvento())){
                         indiceEvento = i;
                         valid = true;
                         break;
                    }
                    else{
                        valid = false;
                    }
                }
                if(valid == true){
                    for(int i = 0; i < arrayCronograma.get(indiceCronograma).getEventos().size(); i++){
                        eventoAux = arrayCronograma.get(indiceCronograma).getEventos().get(i);
                        if(codEvento.equals(eventoAux.getCodEvento())){
                             valid = false;
                             break;
                        }
                    }
                }
            }
    
            eventoAux = arrayEvento.get(indiceEvento);
            cronogramaAux = arrayCronograma.get(indiceCronograma);
    
            if(eventoAux.getDiaEvento() >= cronogramaAux.getDiaInicio() && eventoAux.getDiaEvento() <= cronogramaAux.getDiaFinal() && valid == true){
                valid = true;
            }
            else{
                valid = false;
            }
    
            if(valid == true){
                arrayCronograma.get(indiceCronograma).getEventos().add(eventoAux);
            }
        }
        
        return valid;

    }

    public String informarDados(){
        String info = "Codigo: " + getCodCronograma() 
                    + "\nMês: " + getMes()
                    + "\nDia de inicio: " + getDiaInicio()
                    + "\nDia final: " + getDiaFinal();

        String infoEventos = "\n\nEventos: ";
        for(int i = 0; i < getEventos().size(); i++){
            infoEventos = infoEventos + "\nNome: " + getEventos().get(i).getNomeEvento() + " - Codigo: " + getEventos().get(i).getCodEvento() + " - Dia: " + getEventos().get(i).getDiaEvento();
        }

        info = info + infoEventos;
        return info;
    }
    
    public String getCodCronograma() {
        return codCronograma;
    }
    public void setCodCronograma(String codCronograma) {
        this.codCronograma = codCronograma;
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    public int getDiaInicio() {
        return diaInicio;
    }
    public void setDiaInicio(int diaInicio) {
        this.diaInicio = diaInicio;
    }
    public int getDiaFinal() {
        return diaFinal;
    }
    public void setDiaFinal(int diaFinal) {
        this.diaFinal = diaFinal;
    }
    public ArrayList<Evento> getEventos() {
        return eventos;
    }
    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

}