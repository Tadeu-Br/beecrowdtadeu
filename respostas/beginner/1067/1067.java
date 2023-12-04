import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numbo = new Scanner(System.in);
        int num = numbo.nextInt();

        for (int x = 1; x <= num; x++) {
            if (x % 2 == 0) {
                continue;
            } else {
                System.out.println(x + "");
            }
        }
    }
}
