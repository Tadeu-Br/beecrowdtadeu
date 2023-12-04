import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double r;
        double k;
        Scanner valuesScanner = new Scanner(input);

        double a = valuesScanner.nextDouble();
        double b = valuesScanner.nextDouble();
        double c = valuesScanner.nextDouble();

        r = b * c;

         String rinput = scanner.nextLine();

        // Use Scanner to read values based on spaces
        Scanner dvaluesScanner = new Scanner(rinput);

        double x = dvaluesScanner.nextDouble();
        double y = dvaluesScanner.nextDouble();
        double z = dvaluesScanner.nextDouble();

        k = y * z;
        double o;
        o = r + k;


        System.out.println("VALOR A PAGAR: R$ "+ String.format("%.2f", o));


    }
}
