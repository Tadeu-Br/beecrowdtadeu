import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int notNum = sc.nextInt();
        if (notNum == 0) {
            System.out.println("E");
        } else if (notNum >= 1 && notNum <= 35) {
            System.out.println("D");
        } else if (notNum >= 36 && notNum <= 60) {
            System.out.println("C");
        } else if (notNum >= 61 && notNum <= 85) {
            System.out.println("B");
        } else if (notNum >= 86 && notNum <= 100) {
            System.out.println("A");
        } else {
            System.out.println("ERRO");
        }
    }
}
