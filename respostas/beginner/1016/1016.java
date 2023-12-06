import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int input = scanner.nextInt();
        
        int tempo = input * 2;
        
        String resongo = String.format("%d minutos", tempo);
        
        // Print the formatted value
        System.out.print(resongo);
    }
}
