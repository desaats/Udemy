import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        System.out.println("Escreva a pressão a temperatura e o volume do peneu: ");
        double P, V, T, pv, M, mA;
        P = sc.nextInt();
        V = sc.nextInt();
        T = sc.nextInt();
        pv = P * V;
        M = 0.37 * (T + 460);
        mA = M / pv;
        System.out.println("A massa de ar é : " + mA);
       




        sc.close();
    }
}