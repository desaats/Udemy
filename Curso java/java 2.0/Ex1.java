import java.util.Locale;
import java.util.Scanner;


public class Ex1 {
   
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        System.out.println("Escreva um numero:");
   
        
		int N = sc.nextInt();
        
    
		if (N < 0) {
			System.out.println(" NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}
   
    sc.close();

   }   
}