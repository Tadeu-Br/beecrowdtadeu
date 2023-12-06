import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Primeiro input
        String input = scanner.nextLine();
        Scanner valuesScanner = new Scanner(input);
        double a = valuesScanner.nextDouble();
        double b = valuesScanner.nextDouble();
        //Segundo input
        String input2 = scanner.nextLine();
        valuesScanner = new Scanner(input2);
        double c = valuesScanner.nextDouble();
        double d = valuesScanner.nextDouble();
        // Calcule outra parte do avião
        double x = Math.pow((c - a), 2);
        double y = Math.pow((d - b), 2);
        double z = x + y;
        double distancia;
        distancia = Math.sqrt(z);
        
        //systemoutprintln especial
        System.out.println(String.format("%.4f", distancia)); 
    }
}
