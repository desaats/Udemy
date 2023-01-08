import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C;
		double aT;
		double aC;
		double pi = 3.14159;
		double aTrapezio;
		double aQ;
		double aR;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		aT = A * C / 2.0;
		aC =  pi * C * C;
		aTrapezio = (A + B) * C / 2;
		aQ = B * B;
		aR = A * B;

		System.out.printf("Area do TRIANGULO é: %.3f%n ", + aT);
		System.out.printf("Area do CIRCULO é: %.3f%n", + aC);
		System.out.printf("Area do TRAPEZIO é: %.3f%n", + aTrapezio);
		System.out.printf("Area do QUADRADO é: %.3f%n", + aQ);
		System.out.printf("Area do RETANGULO é: %.3f%n", + aR);





		

	    

	    
		sc.close();
	} 
}