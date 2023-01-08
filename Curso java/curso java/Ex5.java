import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int peca1, peca2, numero1, numero2;
        double valor1, valor2, valorP;
        peca1 = sc.nextInt();
        numero1 = sc.nextInt();
        valor1 = sc.nextDouble();
        peca2 = sc.nextInt();
        numero2= sc.nextInt();
        valor2 = sc.nextDouble();
        valorP = peca1 * valor1 + peca2 * valor2;
        System.out.printf("O valor a ser pago é : R$ %.2f%n", valorP);
        sc.close();
        }
}