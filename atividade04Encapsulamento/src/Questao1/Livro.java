package Questao1;

import java.util.Scanner;

public class Livro {
	private static Scanner scan = new Scanner(System.in);
	private static Scanner scanLine = new Scanner(System.in);
	private String nome;
	private String autor;
	private String editora;
	private float preco;
	private String[] paginas = new String[500];
	private int quantPaginas = 0;
	private boolean cadastrado = false;
	
	public void cadastrarLivro() throws InterruptedException {
		if(getCadastrado() == false){
			clearConsole();
			System.out.println("==== Cadastro de Livro ========");
			System.out.print("Nome: ");
			setNome(scanLine.nextLine());
			System.out.print("Autor: ");
			setAutor(scanLine.nextLine());
			System.out.print("Edidora: ");
			setEditora(scanLine.nextLine());
			System.out.print("Preco: ");
			setPreco(scan.nextFloat());
			setCadastrado();
		}
		else{
			System.out.println("\nJá existe um livro cadastrado.");
			Thread.sleep(3000);
		}
	}

	public void visualizarLivro() throws InterruptedException {
		if(getCadastrado() == false){
			System.out.println("\nNão há um livro cadastrado.");
			Thread.sleep(3000);
		}
		else{
			clearConsole();
			System.out.println("==== Informações ========");
			System.out.println("Nome: " + getNome());
			System.out.println("Autor: " + getAutor());
			System.out.println("Edidora: " + getEditora());
			System.out.println("Preco: " + getPreco());
			System.out.println("Quantidade de páginas: " + getQuantPaginas());
			Thread.sleep(4000);
		}
	}
	
	public void escreverLivro() throws InterruptedException{
		int valid = 1;
		int cont = 0;
		if(getCadastrado() == false){
			System.out.println("\nCadastre o livro.");
			Thread.sleep(3000);
		}
		else{
			while(valid == 1){
				clearConsole();
				System.out.println("======== Escrevendo =======");
				System.out.println("Pagina " + (quantPaginas+1));
				setPaginas(scanLine.nextLine());
				setQuantPaginas();
				System.out.println("\nDeseja escrever outra pagina? [ 1 - Sim | Qualquer outra tecla - Não ]" );
				valid = scan.nextInt();
			}
		}
	}

	public void lerLivro() throws InterruptedException{
		int valid = 1;
		int cont = 0;
		if(getQuantPaginas() == 0){
			System.out.println("\nNenhuma página escrita ainda.");
			Thread.sleep(3000);
		}
		else{
			while(valid != 0){
				clearConsole();
				System.out.println("Digite '<' e '>' para navegar entre as paginas e 0 para sair");
				System.out.println("\nPagina " + (cont+1) + " de " + (quantPaginas));
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
					if(cont == (quantPaginas-1)){
						cont = (quantPaginas-1);
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

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}
	
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void setPaginas(String pagina){
		this.paginas[getQuantPaginas()] = pagina;
	}

	public String getPaginas(int cont){
		return paginas[cont];
	}

	private void setQuantPaginas(){
		this.quantPaginas = this.quantPaginas+1;
	}

	public int getQuantPaginas(){
		return quantPaginas;
	}

	public void setCadastrado(){
		this.cadastrado = true;
	}

	public boolean getCadastrado(){
		return cadastrado;
	}

	public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
