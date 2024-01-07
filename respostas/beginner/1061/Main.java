import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);

        String diaentrada = entrada.nextLine();
           String[] diak = diaentrada.split("Dia ");

           
        int dia = Integer.parseInt(diak[0]);
        
        // Read the time as a string
        String time = entrada.nextLine(); 
        // Assuming the time is entered as "HH:MM:SS"

        // Split time into hours, minutes, seconds

        String[] timeParts = time.split(":");
    
        int horas = Integer.parseInt(timeParts[0].trim());
        int minutos = Integer.parseInt(timeParts[1].trim());
        int segundos = Integer.parseInt(timeParts[2].trim());

           
        int dio = Integer.parseInt(diak[0].trim());
        int die;

        die = dio - dia;

           System.out.println(die + " dia(s)");
           
        System.out.println("a" + horas);
         System.out.println("a" + minutos);
         System.out.println("a" + segundos);
         
        
         
        
        // Now you have horas, minutos, and segundos available for further use
    }
 
}
