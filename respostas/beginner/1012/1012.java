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
      

        //triangulo
        double tri;
        double o;
        tri = a * c;
        o = tri / 2;

        //circulo
          double na;
        double xo;
        na = c * c;
        xo = na * 3.14159;

        //trapézio
        double traa;
        double trab;
        double trac;
        traa = a + b;
        trab = traa * c;
        trac = trab / 2;

        //quadrado
        double quad;
        quad = b * b;

        //retangulo
        double reta;
        reta = a * b;




        System.out.println("TRIANGULO: "+ String.format("%.3f", o));
        System.out.println("CIRCULO: "+ String.format("%.3f", xo));
        System.out.println("TRAPEZIO: "+ String.format("%.3f", trac));
        System.out.println("QUADRADO: "+ String.format("%.3f", quad));
        System.out.println("RETANGULO: "+ String.format("%.3f", reta));


    }
}
