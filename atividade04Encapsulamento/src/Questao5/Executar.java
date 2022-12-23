package Questao5;

public class Executar {
    
    public static void main(String[] args) throws InterruptedException {
        Mochila mochila = new Mochila();

        mochila.visualizarTipos();
        mochila.registrarMochila();
        mochila.adicionarItem();
        mochila.abrirMochila();
        mochila.adicionarItem();
        mochila.adicionarItem();
        mochila.fecharMochila();
    }
}
