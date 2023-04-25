import java.util.Scanner;

public class ficha2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura da primeira matriz
        System.out.println("Informe as dimensões da primeira matriz:");
        System.out.print("Linhas: ");
        int n1 = sc.nextInt();
        System.out.print("Colunas: ");
        int m1 = sc.nextInt();

        int[][] matriz1 = new int[n1][m1];

        System.out.println("Informe os elementos da primeira matriz:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                matriz1[i][j] = sc.nextInt();
            }
        }

        // Leitura da segunda matriz
        System.out.println("Informe as dimensões da segunda matriz:");
        System.out.print("Linhas: ");
        int n2 = sc.nextInt();
        System.out.print("Colunas: ");
        int m2 = sc.nextInt();

        int[][] matriz2 = new int[n2][m2];

        System.out.println("Informe os elementos da segunda matriz:");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                matriz2[i][j] = sc.nextInt();
            }
        }

        // Verifica se as matrizes são compatíveis para multiplicação
        if (m1 != n2) {
            System.out.println("As matrizes informadas não são compatíveis para multiplicação.");
        } else {
            // Cria a matriz resultante
            int[][] matrizResultado = new int[n1][m2];

            // Realiza a multiplicação das matrizes
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    int valor = 0;
                    for (int k = 0; k < m1; k++) {
                        valor += matriz1[i][k] * matriz2[k][j];
                    }
                    matrizResultado[i][j] = valor;
                }
            }

            // Imprime a matriz resultante
            System.out.println("Matriz resultante:");
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    System.out.print(matrizResultado[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
