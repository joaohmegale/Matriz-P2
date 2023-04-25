import java.util.*;
public class questao7 {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);    
    int tam=0;

    System.out.println("Informe o tamanho dos vetores");
    tam=in.nextInt();
    int array1[]=new int[tam];
    int array2[]=new int[tam];
    for(int i=0; i<array1.length;i++){
        System.out.println("Informe os valores dos dois vetores:");
        array1[i]=in.nextInt();
        array2[i]=in.nextInt();
        }    
        verifArray(array1, array2);
        if (verifArray(array1, array2)==true) {
            System.out.println("ESTAO IGUAIS");
        }else{
            System.out.println("ESTAO DIFERENTES");
        }
    }
 
    public static boolean verifArray(int[] array1, int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            if (array1[i]!=array2[i]) {
                return false;
            }else{
                return true;
            }
        }
        return false;
    }
}