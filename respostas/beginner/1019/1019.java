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
        
        Scanner sc= new Scanner(System.in);
     int N= sc.nextInt();  

    int x, y, z, a, b;
    
    x = N / 3600;
    a = N % 3600;
    y = N / 60;
    b = N % 60;
    z = b;
    System.out.println(String.format(x + ":" + y + ":" + z)); 

 
    }
 
}