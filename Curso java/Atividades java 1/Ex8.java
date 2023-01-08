import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int custo, preço, quantidadeC;
        System.out.println("Digite o custo do evento e o preço do ingresso: ");
        custo = sc.nextInt();
        preço = sc.nextInt();
        quantidadeC = custo / preço;
        System.out.println("Devem ser vendidos " + quantidadeC);
        
        sc.close();
    }
}