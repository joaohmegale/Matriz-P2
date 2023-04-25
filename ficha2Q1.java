import java.util.*;
    public class ficha2Q1{
        
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("Escreva o numero de linhas da matriz");
            int l;
            l=in.nextInt();
            System.out.println("Escreva a quantidade de colunas da matriz");
            int c;
            c=in.nextInt();
            double [][] matriz=new double[l][c];
            System.out.println("Escreva os valores da matriz");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    matriz[i][j]=in.nextDouble();
                }
            }
            double resultado = media(matriz);
            System.out.println("a media dos valores da matriz é de " + resultado);
        }

        public static double media(double[][] matriz) {
            double media;
            double divisao=matriz.length*matriz[0].length;
            double somaValores=0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    somaValores+=matriz[i][j];
                }
            }
            media=somaValores/divisao;
            return media;
        }
    }
