import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);

        // primeiro dia
        String diaentrada = entrada.nextLine();
        String[] diak = diaentrada.split("Dia ");
        int dia = Integer.parseInt(diak[1]); 
        // primeiro dia

        // Read the time as a string
        String time = entrada.nextLine(); // Assuming the time is entered as "HH:MM:SS"

        // Split time into hours, minutes, seconds
        String[] timeParts = time.split(":");
    
        int horasa = Integer.parseInt(timeParts[0].trim());
        int minutosa = Integer.parseInt(timeParts[1].trim());
        int segundosa = Integer.parseInt(timeParts[2].trim());

        String dioentrada = entrada.nextLine();
        String[] diok = dioentrada.split("Dia ");
        int dio = Integer.parseInt(diok[1]);

        String timo = entrada.nextLine(); 
        String[] timePartos = timo.split(":");
    
        int horasb = Integer.parseInt(timePartos[0].trim());
        int minutosb = Integer.parseInt(timePartos[1].trim());
        int segundosb = Integer.parseInt(timePartos[2].trim());
//calculo do dia
        dia = dia + 1; //o +1 é devido o que ja estava ali.
        int die = dio - dia;
// ====
int horasx, minutosx, segundosx;


/*
 * Dia 5
08 : 12 : 23
Dia 9
06 : 13 : 23
-----------------
3 dia(s)
22 hora(s)
1 minuto(s)
0 segundo(s)
 */

horasa = horasa * 3600;
minutosa = minutosa * 60;
segundosa = segundosa;

horasb = horasb * 3600;
minutosb = minutosb * 60;
segundosb = segundosb;

int segundosinicio = horasa + minutosa + segundosa;
int segundosfim = horasb + minutosb + segundosb;

int segundosadequado = segundosinicio - segundosfim;
/*
int token = segundosadequado / 86400;
segundosadequado = segundosadequado % 86400;
*/
horasx = segundosadequado / 3600;
segundosadequado = segundosadequado % 3600;
minutosx = segundosadequado / 60;
segundosadequado = segundosadequado % 60;
segundosx = segundosadequado;


        // resultado calculo dia

        System.out.println((segundosinicio + " dia(s)"));
        System.out.println((segundosfim + " dia(s)"));


        System.out.println((die + " dia(s)"));

        System.out.println(horasx + " hora(s)");
        System.out.println(minutosx + " minuto(s)");
        System.out.println(segundosx + " segundo(s)");


        // Now you have horas, minutos, and segundos available for further use
    }
}
