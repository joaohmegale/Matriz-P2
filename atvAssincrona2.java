public class atvAssincrona2 {
    public static void main(String[] args) {
        int [][] matrizA = {{2,5},{2,7}};
        int [][] matrizB = {{2,2},{2,2}};
        int [][] resultado = calculaProdInterno(matrizA, matrizB);

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] calculaProdInterno(int matrizA[][],int matrizB[][]) {
        int resultado[][]= new int[matrizA.length][matrizA[0].length];
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                resultado[i][j]=matrizA[i][j]*matrizB[i][j];
            }
        }
        return resultado;
    }
}
