import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        System.out.println("Ecreva uma temperatura em Farenheit.");
        double temperatura, F, C;
        temperatura = sc.nextDouble();
        F = (temperatura * 9 / 5) + 32;
        C = (F - 32) * 5/9; 
        System.out.println("Ecreva uma temperatura em celsios é: " + C);



        sc.close();
    }
}