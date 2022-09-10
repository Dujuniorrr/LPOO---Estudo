import java.util.Scanner;

public class exerc2VetorDesc {
    public static void main(String[] args) throws Exception {
        int num[] = {1, 10, 26, 2, 2, 6, 3, 8, 3, 7, 15, 98, 34, 78, 24, 88, 77, 18, 61, 20};
        int numDesc[] = new int[20];
        int cont = -1, auxiliar;

        for(int i = 0; i < 20; i++){
            System.out.println(num[i]);
        }

        for(int i = 0; i < 20; i++){
            for(int x = 0; x < 20; x++){
                if(num[i] > num[x]){
                    auxiliar = num[i];
                    num[i] = num[x];
                    num[x] = auxiliar;
                }
               
            }
        }
       
        System.out.println("\nDecrescente: \n");
        for(int i = 0; i < 20; i++){
            System.out.println(num[i]);
        }
        
    }
}
