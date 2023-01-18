import java.util.*;
public class at4{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for( int i = 0; i < n; i++){
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double div = x / y;
         if(y == 0) {
            System.out.println("divisão imporssivel" );
    
           }else {
         
            System.out.println(" " + div);
           }
       }
      
       sc.close();
   }

}
