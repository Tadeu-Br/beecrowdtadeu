import java.util.Scanner;

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
    
        
		int notasCem = valor / 100;
        int depoisdosCem = valor % 100;
        
        int notasCinquenta = depoisdosCem / 50;
        int depoisdosCinquenta = depoisdosCem % 50;
        
        
        int notasVinte = depoisdosCinquenta / 20;
        int depoisdosVinte = depoisdosCinquenta % 20;
        
        int notasDez = depoisdosVinte / 10;
        int depoisdosDez = depoisdosVinte % 10;
        
        int notasCinco = depoisdosDez / 5;
        int depoisdosCinco = depoisdosDez % 5;
        
        int notasDois = depoisdosCinco / 2;
        int depoisdosDois = depoisdosCinco % 2;
        
        
        
        int notasUm = depoisdosDois;
        
        System.out.println(valor);
        System.out.println(notasCem + " nota(s) de R$ 100,00");
        System.out.println(notasCinquenta + " nota(s) de R$ 50,00");
        System.out.println(notasVinte + " nota(s) de R$ 20,00");
        System.out.println(notasDez + " nota(s) de R$ 10,00");
        System.out.println(notasCinco + " nota(s) de R$ 5,00");
        System.out.println(notasDois + " nota(s) de R$ 2,00");
        System.out.println(notasUm + " nota(s) de R$ 1,00");
	}
}
