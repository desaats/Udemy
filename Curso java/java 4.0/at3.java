import java.util.*;
public class at3{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i = 0; i < n; i++){
        Double teste1 = sc.nextDouble();
        double teste2 = sc.nextDouble();
        Double teste3 = sc.nextDouble();
        Double media = (teste1 * 2.0 + teste2 * 3.0 + teste3 * 5.0)/10;
        System.out.printf("media ponderada é = %.1f%n", media );


       }
      
      

       sc.close();
   }

}