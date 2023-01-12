import java.util.*;
public class ex2{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Escreva uma senha");
       int senha = sc.nextInt();
       while(senha != 2002){
        System.out.println("Senha incorreta");
        senha = sc.nextInt();

       }
        System.out.println("Acesso permitido");
       
       sc.close();
   }
    
}
