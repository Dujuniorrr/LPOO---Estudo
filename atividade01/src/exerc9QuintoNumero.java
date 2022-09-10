public class exerc9QuintoNumero {
    public static void main(String[] args) throws Exception {
        int num = 1000, cont = 0, valor = 0;
        while(cont != 5){
            num++;
            if(num > 1000 && num%11 == 5){
                valor = num;
                cont++;
            }
        }

        System.out.println("Quinto número maior que 1000, cuja divisão por 11 tem resto 5: " + valor);
    }
}