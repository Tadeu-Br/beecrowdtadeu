import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner valuesScanner = new Scanner(System.in);

      	int a = valuesScanner.nextInt();
        double b = valuesScanner.nextDouble();
     double rod;
     rod = (double) a / b;
            String formattedOutput = String.format("%.3f km/l", rod);
        System.out.println(formattedOutput);
      }

	}
