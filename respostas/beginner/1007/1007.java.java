import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException { {
        Scanner myObj = new Scanner(System.in);
        int input1 = myObj.nextInt();
        int input2 = myObj.nextInt();
        int input3 = myObj.nextInt();
        int input4 = myObj.nextInt();
        
        
        //mandando o resultado
        int a = input1 * input2; 
        int b = input3 * input4;
        int c = a - b;

        System.out.println("DIFERENCA = " + c);
    }
}
