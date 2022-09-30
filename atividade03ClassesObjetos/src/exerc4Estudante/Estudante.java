package exerc4Estudante;

public class Estudante {
    private String nome;
    private String matricula;
    private String tipoEnsino;
    private String[] materias = new String[10];
    private int contMat = 0;
    private float notas[][] = new float[10][5];
    private float[] medias = new float[10];
          
    public void setNome(String nomeInput){
        this.nome = nomeInput;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    
    public void setMatricula(String matricInput){
        this.matricula = matricInput;
    }
    
    public String getMatricula(){
        return this.matricula;
    }

    public void setEnsino(String ensinoInput){
        this.tipoEnsino = ensinoInput;
    }
    
    public String getEnsino(){
        return this.tipoEnsino;
    }

    public void addMaterias(String materiaInput){
        if(contMat < 10){
                materias[contMat] = materiaInput;
                contMat++;
            }
        else{
            System.out.println("Numero máximo de matérias adicionado.");
        }
        
    }

    public void addNotas(int id, float[] notaInput){
        float soma = 0;
        id = id -1;
        if(id > contMat){
            System.out.println("\n---- Opção inválida ---");
        }
        else{
            for(int j=0; j<5; j++){
                notas[id][j] = notaInput[j];
                if(notas[id][j] > 10){
                    System.out.println("Numero acima de 10, a nota 10 foi adicionada.");
                    notas[id][j] = 10;
                    soma =  soma + 10;

                }else{
                    soma =  soma + notas[id][j];
                }
                
            }
            medias[id] = soma / 5;
        }
     }

     public void printMedia(){
        System.out.println("\n---- Notas de " + nome + " ----");
        for(int i=0; i < contMat; i++){
            System.out.println("\nMatéria: " + materias[i]);
            for (int j = 0; j < 5; j++) {
                System.out.println("Nota " + (j+1) + ": " + notas[i][j]);
            }
            System.out.println("Media: " + medias[i]);
        }
     }

    
}
