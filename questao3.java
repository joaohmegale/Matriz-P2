import java.util.*;
public class questao3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array=new int[10];
        int[] arraySec=new int[10];
        int j=0;
        for(int i=0;i<array.length;i++){ 
            System.out.println("Informe o valor " + i);
            array[i]=in.nextInt();
            if (i%2==0) {
                arraySec[i]=array[i]/2;
            }else{
                arraySec[i]=array[i]*3;
            }
        }
        for(int i = 0;i<array.length;i++){
            System.out.print(arraySec[i] + " ");
        }
    }
}
