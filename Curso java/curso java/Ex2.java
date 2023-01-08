import java.util.Locale;
import java.util.Scanner;


public class Ex2 {
   
    public static void main (String[] args){

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);
    double area, raio;
    double pi = 3.14159;
    raio = sc.nextDouble();
    area = pi * raio * raio;
    System.out.printf("Area do circulo é:%.4f%n", + area);

    sc.close();

   }   
}
  