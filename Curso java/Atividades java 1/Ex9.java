import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero positivo maior que zero :");
        double  numero,quadrado, cubo, raizq, rcubo;
        numero = sc.nextDouble();
        quadrado = numero * numero;
        cubo = numero * numero * numero;
        raizq = Math.sqrt(numero);
        rcubo = Math.cbrt(numero);
        System.out.println("O numero ao quadrado é: " + quadrado);
        System.out.println("O numero ao cubo é: " + cubo);
        System.out.println("A raiz quadrada do numero é: " + raizq);
        System.out.println("A raiz cubica do numero é:  " + rcubo);
        sc.close();
    }
}