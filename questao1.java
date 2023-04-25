import java.util.*;

public class questao1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        int array[]= new int[10];
        for(int i=0; i<array.length;i++){
            System.out.println("Receba o numero " + (i+1) + "");
            array[i]=in.nextInt();
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for(int i=(array.length-1);i>=0;i--){
            System.out.print(array[i] + " ");
        }
    }    
}
