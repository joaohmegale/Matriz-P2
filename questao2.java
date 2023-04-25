import java.util.Scanner;
public class questao2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[]=new int[10];
        int arrayInv[]=new int[10];
        
        for(int i=0;i<array.length;i++){
            System.out.println("Informe os valores desejados");
            array[i]=in.nextInt();
        }
        int cont=(array.length-1);
        for(int i=0;i<arrayInv.length;i++){
            arrayInv[i]=array[cont];
            cont--;
            System.out.print(arrayInv[i] + " ");
        }
    }
}
