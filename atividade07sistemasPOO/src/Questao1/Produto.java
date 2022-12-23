package Questao1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Produto {
    private String codProduto;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(String codProduto, String nome, double preco, int quantidade) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public boolean cadastrar(String codProduto, String nome, double preco, int quantidade, ArrayList<Produto> arrayProduto){

        Produto produto = new Produto();
        boolean valid = true;

        for(int i = 0; i < arrayProduto.size(); i++){
            produto = arrayProduto.get(i);
            if(codProduto.equals(produto.getCodProduto())){
                valid = false;
                break;
            }
        }

        if(valid == true){
            this.setCodProduto(codProduto);
            this.setNome(nome);
            this.setPreco(preco);
            this.setQuantidade(quantidade);
            produto = new Produto(codProduto, nome, preco, quantidade);
            arrayProduto.add(produto);
        }
        
        return valid;
    }

    public boolean editar(String codProduto, String nome, double preco, int quantidade, ArrayList<Produto> arrayProduto){

        Produto produto = new Produto();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayProduto.size(); i++){
            produto = arrayProduto.get(i);
            if(codProduto.equals(produto.getCodProduto())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            produto = new Produto(codProduto, nome, preco, quantidade);
            arrayProduto.set(indice, produto);
        }
        
        return valid;
    }

    public boolean deletar(String codProduto, ArrayList<Produto> arrayProduto){
        Produto produto = new Produto();
        boolean valid = false;
        int indice = 0;

        for(int i = 0; i < arrayProduto.size(); i++){
            produto = arrayProduto.get(i);
            if(codProduto.equals(produto.getCodProduto())){
                valid = true;
                indice = i;
                break;
            }
        }

        if(valid == true){
            arrayProduto.remove(indice);
        }
        
        return valid;
    }    

    public void visualizar(ArrayList<Produto> arrayProduto){
        Produto produto = new Produto();

        if(arrayProduto.size() >  0){
            for(int i = 0; i < arrayProduto.size(); i++){
                produto = arrayProduto.get(i);
                JOptionPane.showMessageDialog(
                    null,
                    "\nCodigo: " + produto.codProduto + "\nNome: " + produto.getNome() + "\nPreço: " + produto.getPreco() + "\nQuantidade em estoque: "  + produto.getQuantidade(),
                    "Visualizando Produtos", 
                    JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há Produtos", "Produtos", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getCodProduto() {
        return codProduto;
    }
    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
