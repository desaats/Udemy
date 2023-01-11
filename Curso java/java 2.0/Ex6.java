import java.util.Scanner;
public class Ex6 {
    public static void main (String[] args){
      
        Scanner sc = new Scanner(System.in);
        System.out.printf("Escreva um numero:");
        double number = sc.nextDouble();
       
        if (number > 0 && number < 24) {
            System.out.println("INTERVALO [0 a 25]");
            
        }else if (number >= 25 && number < 49){
            System.out.println("ITERVALO [25 a 50]");
        }else if (number >= 50 && number < 74){
            System.out.println("INTERVALO [50 a 75]");
        }else if (number >= 75 && number < 99){
            System.out.println("INTERVALO [75 a 99]");
        }else{
            System.out.println("Fora de intervalo");
        }

        



        sc.close();
    }
}    
   