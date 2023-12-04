import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int input1 = myObj.nextInt();
        int input2 = myObj.nextInt(); // Taking input2 as an integer
        float input3 = myObj.nextFloat();
        
        // Casting input2 to float during the calculation
        float resu = (float)input2 * input3;

        System.out.println("NUMBER = " + input1);
        System.out.printf("SALARY = U$ %.2f%n", resu);
    }
}
