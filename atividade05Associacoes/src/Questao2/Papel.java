package Questao2;

import java.util.Scanner;

public class Papel {
    private Scanner scanLine = new Scanner(System.in);
    private String[] paginas = new String[500];
    private int paginasEscritas;

    Papel(){
        setPaginas(" ");
        setPaginasEscritas(0);   
    }

    public void lerPapel() throws InterruptedException{
		int valid = 1;
		int cont = 0;
		if(getPaginasEscritas() == 0){
			System.out.println("\nNenhuma página escrita ainda.");
			Thread.sleep(3000);
		}
		else{
			while(valid != 0){
				clearConsole();
				System.out.println("Digite '<' e '>' para navegar entre as paginas e 0 para sair");
				System.out.println("\nPagina " + (cont+1) + " de " + (getPaginasEscritas()));
				System.out.println(getPaginas(cont));
				System.out.println("\n");
				String nav = scanLine.nextLine();
				if(nav.equals("<")){
					if(cont == 0){
						cont = 0;
					}
					else{
						cont--;
					}
				}
				else if(nav.equals(">")){
					if(cont == (getPaginasEscritas()-1)){
						cont = (getPaginasEscritas()-1);
					}
					else{
						cont++;
					}
				}
				else if(nav.equals("0")){
					valid = 0;
				}
				else{
					System.out.println("\nOpção invalida.");
					Thread.sleep(3000);
				}
			}
		}	
	}

    public String getPaginas(int indice) {
        return paginas[indice];
    }

    public String[] getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas[paginasEscritas] = paginas;
        setPaginasEscritas(getPaginasEscritas()+1);;
    }

    public void setPaginas(String paginas, int indice) {
        this.paginas[indice] = paginas;
    }

    public int getPaginasEscritas() {
        return paginasEscritas;
    }

    protected void setPaginasEscritas(int paginasEscritas) {
        this.paginasEscritas = paginasEscritas;
    }

    private static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
