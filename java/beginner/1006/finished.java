import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
  float mar;
        float c;

        Scanner sc = new Scanner(System.in);
        
        float sc1 = sc.nextFloat();
        float sc2 = sc.nextFloat();
        float sc3 = sc.nextFloat();
        
        float re1, re2, re3;
        re1 = (sc1 * 2);
        re2 = (sc2 * 3);
        re3 = (sc3 * 5);

        mar = re1 + re2 + re3;
        c = mar / 10;
        
       // Format the output to display only one decimal place
        String formattedOutput = String.format("MEDIA = %.1f", c);
        System.out.println(formattedOutput);
 
    }
 
}
