import java.util.Scanner;
public class Ex4 {
    public static void main (String[] args){
      
        Scanner sc = new Scanner(System.in);
        int hI = sc.nextInt();
        int hF = sc.nextInt();
        int DuracaoT;
        if (hI < hF){
            DuracaoT = hF - hI;
        }
        else{
            DuracaoT = 24 - hI + hF;
        }
        System.out.println("O JOGO DUROU " +  DuracaoT  + " HORAS");
       
	
        sc.close();

        

   }  
}
