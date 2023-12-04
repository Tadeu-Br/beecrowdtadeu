import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner valuesScanner = new Scanner(System.in);

        int a = valuesScanner.nextInt();
        int r;
        int x;
        r = 1;
        
         for (x = a; r < 8; x++) {
            if (r == 1){
                r++;
            }
            else{                
                if (x % 2 != 0) { // Replace 2 with the desired divisor
                System.out.println(x + "");
                r++;
                }
        }
}
}
}