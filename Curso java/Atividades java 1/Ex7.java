import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int B, H, P, A, D;
        System.out.println("Digite dois numeros: ");
        B = sc.nextInt();
        H = sc.nextInt();
        P = B + B + H + H;
        A = B * H;
        D =( B * B + H * H) / (2);
        
        System.out.println("Valor do perimetro é: " + P); 
        System.out.println("Valor do Area é: " + A); 
        System.out.println("Valor do Diagonal é: " + D); 
        sc.close();
    }
}