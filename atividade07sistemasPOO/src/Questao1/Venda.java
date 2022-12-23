package Questao1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Venda {
    private String codVenda;
    private String dtVenda;
    private double valorVenda;
    private int quantComprada;

    private Cliente cliente;
    private Vendedor vendedor;
    private Produto produto = new Produto();

    public Venda() {
    }

    public Venda(String codVenda, String dtVenda, double valorVenda, Cliente cliente, Vendedor vendedor,
            Produto produto, int quantComprada) {
        this.codVenda = codVenda;
        this.dtVenda = dtVenda;
        this.valorVenda = valorVenda;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produto = produto;
        this.quantComprada = quantComprada;
    }

    public boolean cadastrar(String codProduto, String codCliente, String codVendedor, String codVenda, String dtVenda, int quantidade, ArrayList<Cliente> arrayCliente,  ArrayList<Produto> arrayProduto,  ArrayList<Vendedor> arrayVendedor, ArrayList<Venda> arrayVenda){

        Venda venda = new Venda();
        Cliente cliente = new Cliente();
        Produto produto = new Produto();
        Vendedor vendedor = new Vendedor();

        double valorVenda;
        int iCliente = 0, iProduto = 0;
        boolean valid = true;

        for(int i = 0; i < arrayVenda.size(); i++){
            venda = arrayVenda.get(i);
            if(codVenda.equals(venda.getCodVenda())){
                valid = false;
                break;
            }
        }

        if(valid == true){
            valid = false;
            for(int i = 0; i < arrayCliente.size(); i++){
                cliente = arrayCliente.get(i);
                if(codCliente.equals(cliente.getCodCliente())){
                    iCliente = i;
                     if(cliente.getSaldo() > 0){
                        valid = true;
                        break;
                     }
                }
            }
        }

        if(valid == true){
            valid = false;
            for(int i = 0; i < arrayProduto.size(); i++){
                produto = arrayProduto.get(i);
                if(codProduto.equals(produto.getCodProduto())){
                    iProduto = i;
                     if(produto.getQuantidade() > 0 && quantidade <= produto.getQuantidade()){
                        valid = true;
                        break;
                     }
                }
            }
        }

        //se os dados passarem pelas verificações acima de forma correta, ele será true, por tanto é valido
        if(valid == true){
            produto.setQuantidade( produto.getQuantidade() - quantidade);
            cliente.setSaldo( cliente.getSaldo() - (quantidade * produto.getPreco()));
            valorVenda = quantidade * produto.getPreco();
            arrayProduto.set(iProduto, produto);
            arrayCliente.set(iCliente, cliente);
            venda = new Venda(codVenda, dtVenda, valorVenda, cliente, vendedor, produto, quantidade);
            arrayVenda.add(venda);
        }

        return valid;
    }

    public void visualizar(ArrayList<Venda> arrayVenda){
        Venda venda = new Venda();

        if(arrayVenda.size() >  0){
            for(int i = 0; i < arrayVenda.size(); i++){
                venda = arrayVenda.get(i);
                JOptionPane.showMessageDialog(
                    null,
                    "\nCodigo: " + venda.codVenda + "\nData da venda: " + venda.getDtVenda() + "\nValor da Venda: " + venda.getValorVenda() + "\nNome cliente: " + venda.getCliente().getNome() + "\nNome vendedor: " + venda.getVendedor().getNome() + "\nNome produto: " + venda.getProduto().getNome() + "\nQuantidade comprada: " + venda.getQuantComprada(),
                    "Vendas", 
                    JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há vendas", "Vendas", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public String getCodVenda() {
        return codVenda;
    }
    public void setCodVenda(String codVenda) {
        this.codVenda = codVenda;
    }
    public String getDtVenda() {
        return dtVenda;
    }
    public void setDtVenda(String dtVenda) {
        this.dtVenda = dtVenda;
    }
    public double getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQuantComprada() {
        return quantComprada;
    }

    public void setQuantComprada(int quantComprada) {
        this.quantComprada = quantComprada;
    }
}
