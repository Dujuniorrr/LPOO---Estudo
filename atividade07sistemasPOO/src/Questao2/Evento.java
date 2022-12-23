package Questao2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Evento {
    private String codEvento;
    private String nomeEvento;
    private String horarioEvento;
    private int diaEvento;
    private String tipoAtividade;
    private String descricao;
    private ContatoComercial contatoC;
    private ContatoPessoal contatoP ;
    private ContatoEletronico contatoE;
    
    public Evento(String codEvento, String nomeEvento, String horarioEvento, int diaEvento, String tipoAtividade,
            String descricao) {
        this.codEvento = codEvento;
        this.nomeEvento = nomeEvento;
        this.horarioEvento = horarioEvento;
        this.diaEvento = diaEvento;
        this.tipoAtividade = tipoAtividade;
        this.descricao = descricao;
        this.contatoP = new ContatoPessoal();
        this.contatoC = new ContatoComercial();
        this.contatoE = new ContatoEletronico();
        this.contatoC.setCodContato("null");
        this.contatoE.setCodContato("null");
        this.contatoP.setCodContato("null");
    }


    public Evento(String codEvento, String nomeEvento, String horarioEvento, int diaEvento, String tipoAtividade,
            String descricao, ContatoPessoal contatoP) {
        this.codEvento = codEvento;
        this.nomeEvento = nomeEvento;
        this.horarioEvento = horarioEvento;
        this.diaEvento = diaEvento;
        this.tipoAtividade = tipoAtividade;
        this.descricao = descricao;
        this.contatoP = contatoP;
        this.contatoC = new ContatoComercial();
        this.contatoE = new ContatoEletronico();
        this.contatoC.setCodContato("null");
        this.contatoE.setCodContato("null");
    }


    public Evento(String codEvento, String nomeEvento, String horarioEvento, int diaEvento, String tipoAtividade,
            String descricao, ContatoComercial contatoC) {
        this.codEvento = codEvento;
        this.nomeEvento = nomeEvento;
        this.horarioEvento = horarioEvento;
        this.diaEvento = diaEvento;
        this.tipoAtividade = tipoAtividade;
        this.descricao = descricao;
        this.contatoC = contatoC;
        this.contatoP = new ContatoPessoal();
        this.contatoE = new ContatoEletronico();
        this.contatoP.setCodContato("null");
        this.contatoE.setCodContato("null");
    }


    public Evento(String codEvento, String nomeEvento, String horarioEvento, int diaEvento, String tipoAtividade,
            String descricao, ContatoEletronico contatoE) {
        this.codEvento = codEvento;
        this.nomeEvento = nomeEvento;
        this.horarioEvento = horarioEvento;
        this.diaEvento = diaEvento;
        this.tipoAtividade = tipoAtividade;
        this.descricao = descricao;
        this.contatoE = contatoE;
        this.contatoC = new ContatoComercial();
        this.contatoP = new ContatoPessoal();
        this.contatoC.setCodContato("null");
        this.contatoP.setCodContato("null");
    }


    public Evento(String codEvento, String nomeEvento, String horarioEvento, int diaEvento, String tipoAtividade,
            String descricao, ContatoComercial contatoC, ContatoPessoal contatoP, ContatoEletronico contatoE) {
        this.codEvento = codEvento;
        this.nomeEvento = nomeEvento;
        this.horarioEvento = horarioEvento;
        this.diaEvento = diaEvento;
        this.tipoAtividade = tipoAtividade;
        this.descricao = descricao;
        this.contatoC = contatoC;
        this.contatoP = contatoP;
        this.contatoE = contatoE;
    }


    public Evento() {
       
    }

    public String informarDados(){
        String info = "Codigo: " + getCodEvento() 
                    + "\nNome: " + getNomeEvento()
                    + "\nHorario: " + getHorarioEvento()
                    + "\nDia: " + getDiaEvento()
                    + "\nDescrição: " + getDescricao();
        
        String infoContato = "\nSem contatos presentes nesse evento.";
        if(getContatoC().getCodContato().equals("null")){

        }else{
            infoContato = "\nContato Comercial presente no evento: " + getContatoC().getNome();
        }

        if(getContatoP().getCodContato().equals("null")){

        }else{
            infoContato = "\nContato Pessoal presente no evento: " + getContatoP().getNome();
        }

        if(getContatoE().getCodContato().equals("null")){
            
        }else{
            infoContato = "\nContato Eletronico presente no evento: " + getContatoE().getNome();
        }

        info = info + infoContato;
        return info;
    }

    public boolean adicionar(String codEvento, String nomeEvento, String horarioEvento, int diaEvento, String tipoAtividade, String descricao, String codContato, int opcaoContato, ArrayList<ContatoComercial> arrayContatoComercial, ArrayList<ContatoEletronico> arrayContatoEletronico, ArrayList<ContatoPessoal> arrayContatoPessoal, ArrayList<Evento> arrayEvento){

        Evento evento = new Evento();
        ContatoComercial cc = new ContatoComercial();
        ContatoEletronico ce = new ContatoEletronico();
        ContatoPessoal cp = new ContatoPessoal();

        boolean valid = true;

        for(int i = 0; i < arrayEvento.size(); i++){
            evento = arrayEvento.get(i);
            if(codEvento.equals(evento.getCodEvento())){
                valid = false;
                break;
            }
        }

        boolean contatoAdd = false;
        boolean opcaoNaoAdicionar = false;

        if(valid == true){
            switch (opcaoContato) {
                case 1:
                    for(int i = 0; i < arrayContatoComercial.size(); i++){
                        cc = arrayContatoComercial.get(i);
                        if(codContato.equals(cc.getCodContato())){
                            evento = new Evento(codEvento, nomeEvento, horarioEvento, diaEvento, tipoAtividade, descricao, cc);
                            contatoAdd = true;
                            System.out.println("a");
                        }
                    }
                    break;
            
                case 2:
                    for(int i = 0; i < arrayContatoPessoal.size(); i++){
                        cp = arrayContatoPessoal.get(i);
                        if(codContato.equals(cp.getCodContato())){
                            evento = new Evento(codEvento, nomeEvento, horarioEvento, diaEvento, tipoAtividade, descricao, cp);
                            contatoAdd = true;
                        }
                    }
                    break;
    
                case 3:
                    for(int i = 0; i < arrayContatoEletronico.size(); i++){
                        ce = arrayContatoEletronico.get(i);
                        if(codContato.equals(ce.getCodContato())){
                            evento = new Evento(codEvento, nomeEvento, horarioEvento, diaEvento, tipoAtividade, descricao, ce);
                            contatoAdd = true;
                        }
                    }
                    break;
                    
                default:
                    opcaoNaoAdicionar = true;
                    break;
            }

            if(contatoAdd == false && opcaoNaoAdicionar == false){
                evento = new Evento(codEvento, nomeEvento, horarioEvento, diaEvento, tipoAtividade, descricao);
                JOptionPane.showMessageDialog(null, "O codigo do contato não foi encontrado, por tanto o evento foi criado sem ele", "Adicionar", JOptionPane.ERROR_MESSAGE);
            }
            else if(opcaoNaoAdicionar == true){
                evento = new Evento(codEvento, nomeEvento, horarioEvento, diaEvento, tipoAtividade, descricao);
                JOptionPane.showMessageDialog(null, "Você escolheu criar um evento sem um contato presente", "Adicionar", JOptionPane.INFORMATION_MESSAGE);
            }
            arrayEvento.add(evento);
        }

        return valid;
    }

    public boolean deletar(String codEvento, ArrayList<Evento> arrayEvento){
        Evento evento = new Evento();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayEvento.size(); i++){
            evento = arrayEvento.get(i);
            if(codEvento.equals(evento.getCodEvento())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            arrayEvento.remove(indice);
        }
        
        return valid;
    }

    public void visualizar(ArrayList<Evento> arrayEvento){
        Evento evento = new Evento();

        if(arrayEvento.size() >  0){
            for(int i = 0; i < arrayEvento.size(); i++){
                evento = arrayEvento.get(i);
                JOptionPane.showMessageDialog(null, evento.informarDados(), "Eventos", JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há Eventos", "Eventos", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getCodEvento() {
        return codEvento;
    }
    public void setCodEvento(String codEvento) {
        this.codEvento = codEvento;
    }
    public String getNomeEvento() {
        return nomeEvento;
    }
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
    public String getHorarioEvento() {
        return horarioEvento;
    }
    public void setHorarioEvento(String horarioEvento) {
        this.horarioEvento = horarioEvento;
    }
    public int getDiaEvento() {
        return diaEvento;
    }
    public void setDiaEvento(int diaEvento) {
        this.diaEvento = diaEvento;
    }
    public String getTipoAtividade() {
        return tipoAtividade;
    }
    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public ContatoComercial getContatoC() {
        return contatoC;
    }

    public void setContatoC(ContatoComercial contatoC) {
        this.contatoC = contatoC;
    }

    public ContatoPessoal getContatoP() {
        return contatoP;
    }

    public void setContatoP(ContatoPessoal contatoP) {
        this.contatoP = contatoP;
    }

    public ContatoEletronico getContatoE() {
        return contatoE;
    }

    public void setContatoE(ContatoEletronico contatoE) {
        this.contatoE = contatoE;
    }
}