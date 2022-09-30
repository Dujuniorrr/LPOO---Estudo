package exerc9AutoEscola;

public class Agendamento {
    public String nomeAluno;
    public String nomeProfessor;
    public String dataReserva;
    public String dataDisponivelProf;
    public int nivel;
    public float preco;
    public float carteiraAluno;
    public int invalid = 0;

    public void setNomeAluno(String nomeInput){
        this.nomeAluno = nomeInput;
    }

    public void setNomeProfessor(String nomeInput){
        this.nomeProfessor = nomeInput;
    }

    public void setDataDisponivelProf(String dataInput){
        this.dataDisponivelProf = dataInput;
    }

    public void setReservaData(String dataInput){
        if(dataInput.equals(dataDisponivelProf)){
            this.dataReserva = dataInput;
        }
        else{
            System.out.println("----- Conflito de horarios ----");
            invalid++;
        }
    }

    public void setNivel(int nivelAlunoInput, int nivelProfInput){
        if(nivelAlunoInput <= nivelProfInput){
            this.nivel = nivelAlunoInput;
            switch (nivel) {
                case 1:
                    preco = 20f;
                    break;
    
                case 2:
                    preco = 40f;
                    break;
                
                case 3:
                    preco = 60f;
                    break;
                
                case 4:
                    preco = 80f;
                    break;
                
                case 5:
                    preco = 100f;
                    break;
            }
        }
        else{
            System.out.println("------- O professor não tem o nivel necessário para ensinar o aluno ----");
            invalid++;
        }
    }
    
    public float setCarteiraAluno (float carteiraInput){
        if(carteiraInput < preco){
            System.out.println("Não há dinheiro o bastante para pagar a aula");
            invalid++;
        }
        else{
            this.carteiraAluno = carteiraInput;
            this.carteiraAluno = this.carteiraAluno - preco;
        }

        return this.carteiraAluno;
    }

    public void getAgendamento(){
        if(invalid > 0){
            System.out.println("----- Informações em falta para fazer agendamento ----");
        }
        else{
            System.out.println("------- AULA ---------");
            System.out.println("-- Professor: " + this.nomeProfessor);
            System.out.println("-- Aluno: " + this.nomeAluno);
            System.out.println("-- Data: " + this.dataReserva);
            System.out.println("-- Nivel da aula: " + this.nivel);
            System.out.println("-- Preço: " + this.preco);
        }
    }
    
}
