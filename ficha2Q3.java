import java.util.Scanner;

public class ficha2Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz: ");
        int ordem = input.nextInt();

        int[][] matriz = new int[ordem][ordem];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("Elementos da diagonal principal:");

        for (int i = 0; i < ordem; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}
