import java.util.*;
public class ex5{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numero = sc.nextInt();
       int soma = 0;
       int cont = 0;
       while(numero <= 0){
       System.out.println("iMPOSSIVEL CALCULAR");

      
     }if(numero > 0) {
        soma = soma + numero;
        cont = cont + 1;
        numero = sc.nextInt();

     }else if(cont > 0){
     double media = (double) numero / cont;
     System.out.printf("%.2f%n", media);
     }

       sc.close();
   }
    
}
