import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeros = 0;
        int valor = 0;
        int total = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a quantidade de números");
        numeros = s.nextInt();
        for (int n=0; n<numeros; n++) {
            System.out.println("Digite um número");
            valor = s.nextInt();
            total = total+valor;
        }
        System.out.println("O total dos valores somados é " +total);
    }
}