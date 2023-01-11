import java.util.Scanner;
public class Ex5 {
    public static void main (String[] args){
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o codigo e a quantidade a pagar:");
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double total;
        if (codigo == 1) {
            total = quantidade * 4.0;

        }else if ( codigo == 2){
            total = quantidade * 4.50;

        }else if ( codigo == 3){
            total = quantidade * 5.0;

        }else if ( codigo == 4){
            total = quantidade * 2.0;
        }else{
            total = quantidade * 1.50;
        }
        System.out.printf(" O total a pagar é : %.2f%n", total);




        sc.close();

        

    }  
 }
