public class Exerc3Rainha {
    public static void main(String[] args) throws Exception {
        double total = 0, grao = 1;
        int  casa = 64;

        for(int i =  0; i < casa; i++){
            total = total + grao;
            grao = grao * 2;
        }
        System.out.println(total);
    }
}
