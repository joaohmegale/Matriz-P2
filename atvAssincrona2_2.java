import java.util.*;
public class atvAssincrona2_2 {
    public static void main(String[] args) {
        int [][] matrizSoma = {{2,7},{5,9}};
        int k = 3;
        int soma;
        soma=calculaSomaK(matrizSoma, k);
        System.out.println(soma);
    }
    public static int calculaSomaK(int matrizA[][], int k) {
        int soma=0;
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                if (matrizA[i][j]>k) {
                    soma+=matrizA[i][j];
                }
            }
        }
        return soma; 
    }
}
