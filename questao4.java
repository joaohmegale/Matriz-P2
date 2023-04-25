import java.util.*;
public class questao4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] pessoas=new String[10];
        String pessoa;
        boolean resp=false;
        int aux=0;
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Digite os nomes");
            pessoas[i] = in.nextLine();
        }
        System.out.println("Pesquise o nome que voce deseja: ");
        pessoa=in.nextLine();

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoa.equals(pessoas[i])) {
                resp=true;     
            }
    }
    if (resp==true) {
        System.out.println("achei");
    }else{
        System.out.println("nao achei");
    }
}
}
