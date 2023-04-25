import java.util.*;
public class questaoString1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str;
        System.out.println("Digite o que deseja.");
        str=in.nextLine();
        str=str.toLowerCase();
        //Comandos desejados na task.
        //Numero de caracteres da sting
        System.out.println(str + " possui " + str.length() + " caracteres.");
        //String em maiusculo
        System.out.println(str.toUpperCase());
        //Contagem de vogais
        int contVog=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i'|| str.charAt(i) == 'o'|| str.charAt(i) == 'u') {
                contVog++;
            }
        }
        System.out.println("O numero de vogais é de: "  + contVog);
        //Primeiros caracteres
        if (str.startsWith("uni")) {
            System.out.println("Começa com UNI");
        }else{
            System.out.println("Nao comeca com UNI");
        }
        //Ultimos caracteres
        if (str.endsWith("cap")) {
            System.out.println("termina com CAP");
        }else{
            System.out.println("nao termina com CAP");
        }
        //Contagem digitos 0 a 9
        int contNum=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0' || str.charAt(i) == '1'|| str.charAt(i) == '2'|| str.charAt(i) == '3'|| str.charAt(i) == '4' ||str.charAt(i) == '5' || str.charAt(i) == '6'|| str.charAt(i) == '7'|| str.charAt(i) == '8'|| str.charAt(i) == '9') {
                contNum++;
            }
        }
        System.out.println("O numero de numeros de 0 a 9 na frase é de " + contNum);
        //Verificar se é palindromo.
        if (isPalindrome(str)==true) {
            System.out.println("é um palindromo");
        }else{
            System.out.println("nao é palindromo");
        }
        //O numero de palavras contidas na string
        String[] strDiv=str.split(" ");
        int i=0;
        for (i=0; i < strDiv.length; i++) {
        }
        System.out.println("O numero de palavras é de " + (i));
        //Removendo caracter especifico
        String removeC;
        System.out.println("Escolha o caracter que deseja remover");
        removeC=in.nextLine();
        removeC=str.replace(removeC, "");
        System.out.println("A string sem o caracter escolhido é " + removeC);
        //Verificando se é igual a outra string
        String str2;
        System.out.println("Informe o que deseja comparar com a string anterior.");
        str2=in.nextLine();
        if (str2.equals(str)) {
            System.out.println("Sao iguais");
        }else{
            System.out.println("sao diferentes.");
        }
        
    }

    public static boolean isPalindrome(String str) {
        String strInv=" ";
        for (int i = str.length()-1; i>=0; i-- ) {
            strInv+=str.charAt(i);
        }
       if (strInv.equals(str)) {
        return true;
       }
       return false;
    }

}
