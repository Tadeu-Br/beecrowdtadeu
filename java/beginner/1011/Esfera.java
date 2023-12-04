import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        double ro;
        double pi;
        double na;
        double te;
        pi =  3.14159;
        double num = sc.nextDouble();
        ro = num * num * num;
        na = pi * ro;
        te = (4.0/3.0) * na;

        System.out.println("VOLUME = "+ String.format("%.3f", te));  // Output user input



    }
}
