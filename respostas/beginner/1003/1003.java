import java.io.IOException;
 import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
  * @author TadeuBr
 */
public class Main {
    public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	        	double inputum = leitor.nextDouble();
                double inputdois = leitor.nextDouble();
                double inputtres = leitor.nextDouble();
                double truresu;
                
                
               double neodoub1 = inputum * 2;
               double neodoub2 = inputdois * 3;
               double neodoub3 = inputtres * 5;
         
           truresu = (neodoub1+neodoub2+neodoub3) / 10;
		System.out.printf("MEDIA = " + "%.1f",truresu);  
}
}
