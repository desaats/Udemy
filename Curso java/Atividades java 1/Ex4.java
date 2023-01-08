import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int numeroF, horasT;
        double valorH, salario;
        numeroF = sc.nextInt();
        horasT= sc.nextInt();
        valorH = sc.nextDouble();
        salario = valorH * horasT;
        System.out.println("Numero do funcionario: " + numeroF);
        System.out.printf("Salario do funcionario: %.2f R$ %n  ",  salario);

        sc.close();
        }
}
