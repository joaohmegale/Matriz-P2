import java.util.*;
public class atvAssincrona1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tamA,tamB;
        //Receber tamanho e indices array A
        tamA = in.nextInt();
        int [] arrayA = new int[tamA];
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = in.nextInt();   
        }
        //Receber tamanho e indices array B
        tamB = in.nextInt();
        int [] arrayB = new int[tamB];
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = in.nextInt();   
        }
        if (arrayA.length!=arrayB.length) {
            System.out.println("Os vetores devem ter o mesmo tamanho para realizar a soma");
        }else{
            int[] result=somaVetores(arrayA, arrayB);
            System.out.println("Soma: " + Arrays.toString(result));
            int result2=produtoEscalar(arrayA, arrayB);
            System.out.println("Produto escalar: " + result2);
        }

    }
    
    public static int[] somaVetores(int[] arrayA, int[] arrayB) {
        
        int[] result=new int[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            result[i]=arrayA[i]+arrayB[i];
        }
        return result;
    }

    public static int produtoEscalar(int[] arrayA, int[] arrayB) {

        int result=0;
        for (int i = 0; i < arrayA.length; i++) {
            result+=arrayA[i]*arrayB[i];
        }
        return result;
    }
}