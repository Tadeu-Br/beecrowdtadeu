import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double hora;
        double avgspeed;
        double dist;
        double restu;
        Scanner scanner = new Scanner(System.in);

        hora = scanner.nextDouble();
        avgspeed = scanner.nextDouble();
        
        dist = hora * avgspeed;
        
        restu = dist / 12;
        String resongo = String.format(Locale.US, "%.3f", restu);

 System.out.printf(Locale.US, "%.3f%n", restu);
    }
}
