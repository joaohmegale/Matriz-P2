import java.util.*;
    public class ficha2Q5{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Numero de linhas");
            int m=in.nextInt();
            System.out.println("Numero de colunas ");
            int n=in.nextInt();

            int [][] matriz= new int[m][n];
            System.out.println("Preencha matriz");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    matriz[i][j] = in.nextInt();
                }
            }
            System.out.println("digite, na ordem, a linha que quer trocar por outra");
            int l1=in.nextInt();
            int l2=in.nextInt();

            int[] temp;
            temp=matriz[l1];
            matriz[l1]=matriz[l2];
            matriz[l2]=temp;

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }