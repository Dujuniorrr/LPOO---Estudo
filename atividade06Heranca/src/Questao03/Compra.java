package Questao03;

public class Compra {
    private Consultor consultor;
    private PerfumeNatural perfumeNatural;
    private PerfumeSintetico perfumeSintetico;
    private String dataDaCompra;
    private Double valorDaCompra; 
    private int quantidade;

    public Compra(){

    }

    public Compra(Consultor consultor, PerfumeNatural perfumeNatural,
    String dataDaCompra, Double valorDaCompra, int quantidade) {
        this.consultor = consultor;
        this.perfumeNatural = perfumeNatural;
        this.dataDaCompra = dataDaCompra;
        this.valorDaCompra = valorDaCompra;
        this.quantidade = quantidade;
    }

    public Compra(Consultor consultor, PerfumeSintetico perfumeSintetico,
            String dataDaCompra, Double valorDaCompra, int quantidade) {
        this.consultor = consultor;
        this.perfumeSintetico = perfumeSintetico;
        this.dataDaCompra = dataDaCompra;
        this.valorDaCompra = valorDaCompra;
        this.quantidade = quantidade;
    }

    public void realizarCompra(Consultor consul, PerfumeNatural perf, String dataDaCompra, int quantidade){
        double valor = 0;
        setConsultor(consul);
        setPerfumeNatural(perf);
        setDataDaCompra(dataDaCompra);
        setQuantidade(quantidade);
        if(quantidade > perf.getQuantidade()){
            System.out.println("Não há quantidade o suficiente");
        }
        else{
            if(getConsultor().getDtDeFiliacao() < 2010){
                 valor =  ((getPerfumeNatural().getPreco() * quantidade) - consul.getPontos()) - 100;
            }
            else{
                valor = (getPerfumeNatural().getPreco() * quantidade) - consul.getPontos();
            }

            if(valor > consul.getSaldo()){
                System.out.println("O valor da compra é maior que o saldo do cliente.");
            }
            else{
                setValorDaCompra(valor);
                perf.setQuantidade(perf.getQuantidade() - quantidade);
                consul.setSaldo(consul.getSaldo() - getValorDaCompra());
                consul.setPontos(10);
                System.out.println("Compra realizada com sucesso.");
            }
        }
    }

    public void realizarCompra(Consultor consul, PerfumeSintetico perf, String dataDaCompra, int quantidade){
        double valor;
        setConsultor(consul);
        setPerfumeSintetico(perf);
        setDataDaCompra(dataDaCompra);
        setQuantidade(quantidade);
        if(quantidade > perf.getQuantidade()){
            System.out.println("Não há quantidade o suficiente");
        }
        else{
            if(getConsultor().getDtDeFiliacao() < 2010){
                valor =  ((getPerfumeSintetico().getPreco() * quantidade) - consul.getPontos()) - 100;
           }
           else{
               valor = (getPerfumeSintetico().getPreco() * quantidade) - consul.getPontos();
           }

            if(valor > consul.getSaldo()){
                System.out.println("O valor da compra é maior que o saldo do cliente.");
            }
            else{
                setValorDaCompra(valor);
                perf.setQuantidade(perf.getQuantidade() - quantidade);
                consul.setSaldo(consul.getSaldo() - getValorDaCompra());
                consul.setPontos(10);
                System.out.println("Compra realizada com sucesso.");
            }
        }
    }

    public Consultor getConsultor() {
        return consultor;
    }
    public void setConsultor(Consultor consultor) {
        this.consultor = consultor;
    }
    public PerfumeNatural getPerfumeNatural() {
        return perfumeNatural;
    }
    public void setPerfumeNatural(PerfumeNatural perfumeNatural) {
        this.perfumeNatural = perfumeNatural;
    }
    public PerfumeSintetico getPerfumeSintetico() {
        return perfumeSintetico;
    }
    public void setPerfumeSintetico(PerfumeSintetico perfumeSintetico) {
        this.perfumeSintetico = perfumeSintetico;
    }
    public String getDataDaCompra() {
        return dataDaCompra;
    }
    public void setDataDaCompra(String dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }
    public Double getValorDaCompra() {
        return valorDaCompra;
    }
    public void setValorDaCompra(Double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
