import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();
        int y  = sc.nextInt();
        int soma = x + y;
        
        System.out.println("Soma dos valores:" + soma);

        sc.close();
        }
    
}

