import java.util.Scanner;

public class Exerc2VetorDesc {
    public static void main(String[] args) throws Exception {
        int num[] = {1, 10, 26, 2, 2, 6, 3, 8, 3, 7, 15, 98, 34, 78, 24, 88, 77, 18, 61, 20};
        int auxiliar;

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
