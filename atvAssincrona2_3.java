import java.util.*;
public class atvAssincrona2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [][] matrizRelu = {{6,-7},{8,9}};
        double resultado[][]=relu(matrizRelu);

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] relu(double[][] matriz) {
        int linha = matriz.length;
        int coluna = matriz[0].length;
        double[][] resultado = new double[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                resultado[i][j]=Math.max(0, matriz[i][j]);
            }
        }
        return resultado;
    }
}
