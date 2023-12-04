import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Scanner valuesScanner = new Scanner(input);
		 int a = valuesScanner.nextInt();
        int b = valuesScanner.nextInt();
        int c = valuesScanner.nextInt();
        
        int maxThree = Math.max(a, Math.max(b, c));

         System.out.println(maxThree + " eh o maior");
        }

	}
