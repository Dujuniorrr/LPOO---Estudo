package Questao4;

import java.util.Scanner;

public class Aluno {
    static Scanner scanString = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);
    private String nome;
    private String matricula;
    private boolean matriculaConfirm = true;
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

    public void adicionarMaterias(String materiaInput){
        if(contMat < 10){
                materias[contMat] = materiaInput;
                contMat++;
            }
        else{
            System.out.println("Numero máximo de matérias adicionado.");
        }
        
    }

    public void adicionarNotas(){
        float soma = 0;
        clearConsole();
        System.out.println("====== Adicionar notas =====");
        System.out.println("\nDigite o id da matéria: ");
        int id = scan.nextInt() - 1;
        if(id > contMat){
            System.out.println("\n---- Opção inválida ---");
        }
        else{
            System.out.println("\nMatéria: " + materias[id]);
            for(int j=0; j<5; j++){
                System.out.println("\n--> Digite a nota " + (j+1) + ": ");
                notas[id][j] = scan.nextFloat();
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

     public void mostrarMedia() throws InterruptedException{
        clearConsole();
        System.out.println("\n---- Notas de " + nome + " ----");
        for(int i=0; i < contMat; i++){
            System.out.println("\nMatéria: " + materias[i]);
            for (int j = 0; j < 5; j++) {
                System.out.println("Nota " + (j+1) + ": " + notas[i][j]);
            }
            System.out.println("Media: " + medias[i]);
        }
        Thread.sleep(10000);
     }

    
     public void cadastrarAluno() throws InterruptedException{
        clearConsole();
        if(matriculaConfirm == true){
            System.out.println("====== Cadastro de Aluno =====\n");
            System.out.print("-> Digite o nome: ");
            setNome(scanString.nextLine());
            System.out.print("-> Digite a matricula: ");
            setMatricula(scanString.nextLine());
            System.out.print("-> Digite o tipo de ensino: ");
            setEnsino(scanString.nextLine());
            System.out.print("-> Digite quantas matérias deseja adicionar: ");
            int quant = scan.nextInt();
            System.out.println("\n");
            for(int i = 0; i < quant; i++){
                System.out.print("-> Digite o nome da materia: ");
                adicionarMaterias(scanString.nextLine());
            }
            this.matriculaConfirm = false;
        }
        else{
            System.out.println("\n-> Ja existe um aluno cadastrado.");
            Thread.sleep(3000);
        }
        
    }

    public void mostrarAluno() throws InterruptedException{
        clearConsole();
        System.out.println("====== Visualizar Aluno =====\n");
        System.out.println("-- Nome: " + getNome());
        System.out.println("-- Matricula: " + getMatricula());
        System.out.println("-- Ensino: " + getEnsino());
        System.out.println("-- Materias: ");
        for(int i = 0; i < this.contMat; i++){
            System.out.println("  ID:" + (i+1) + " - " + this.materias[i]); 
        }
        Thread.sleep(3000);
    }

    public void alterarAluno() throws InterruptedException{
        int aux = 0;
        clearConsole();
        if(matriculaConfirm == false){
            System.out.println("====== Alterar Aluno =====\n");
            System.out.println("- O que deseja alterar?");
            System.out.println("- - - - - - - - ");
            System.out.println("1 - Nome");
            System.out.println("2 - Matricula");
            System.out.println("3 - Ensino");
            System.out.println("4 - Materias");
            System.out.print("--> O que deseja alterar? ");
            int op = scan.nextInt();
            System.out.println("\n");
            switch (op) {
                case 1:
                    System.out.print("-> Altere o nome: ");
                    setNome(scanString.nextLine());
                    break;
            
                case 2:
                    System.out.print("-> Altere a matricula: ");
                    setMatricula(scanString.nextLine());
                    break;

                case 3:
                    System.out.print("-> Altere o ensino: ");
                    setEnsino(scanString.nextLine());
                    break;
            
                case 4:
                    boolean valid = false;
                    System.out.println("-> Digite o nome da materia que deseja alterar: ");
                    String nomeMat = scanString.nextLine();
                    for(int i = 0; i < this.contMat; i++){
                        if(nomeMat.equals(materias[i])){
                            aux = i;
                            valid = true;
                        }
                    }
                    if(valid == true){
                        System.out.println("\nMateria: " + materias[aux]);
                        System.out.print("--> Altere: ");
                        materias[aux] = scanString.nextLine();
                    }
                    else{
                        System.out.println("\n--> Matéria não foi encontrada");
                    }
                    break;

                default:
                    break;
            }
        }
        else{
            System.out.println("\nNão existe um aluno cadastrado.");
            Thread.sleep(3000);
        }
    }

    public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
