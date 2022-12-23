package MochilaFor;

import java.util.Scanner;

public class Executa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanLine = new Scanner(System.in);
        Mochila[] moch = new Mochila[5];
        double peso = 0;
        String tipo = " ", material = " ";

        for(int i = 0; i < 5; i++){
            System.out.println("\nObjeto " + i+1);
            moch[i] = new Mochila();
            System.out.println("Digite o material: ");
            moch[i].setMaterial(scanLine.nextLine());
            System.out.println("Digite o tipo: ");
            moch[i].setTipo(scanLine.nextLine());
            System.out.println("Digite o peso máximo suportado: ");
            moch[i].setPesomáximosuportado(scan.nextDouble());
        }

        for (Mochila M1 : moch) {
            if (M1.getPesomáximosuportado() > peso) {
                peso = M1.getPesomáximosuportado();
                material = M1.getMaterial();
                tipo = M1.getTipo();
            }  
        }

        System.out.println("A mochila que suporta mais peso, é a que suporta " + peso + " Kg");
        System.out.println("O seu material é " +  material);
        System.out.println("O seu tipo é " + tipo);
    }
}
