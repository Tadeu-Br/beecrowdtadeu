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
        double valor = input.nextDouble();
    
        
		double notasCem = valor / 100;
        double depoisdosCem = valor % 100;
        
        double notasCinquenta = depoisdosCem / 50;
        double depoisdosCinquenta = depoisdosCem % 50;
        
        double notasVinte = depoisdosCinquenta / 20;
        double depoisdosVinte = depoisdosCinquenta % 20;
        
        double notasDez = depoisdosVinte / 10;
        double depoisdosDez = depoisdosVinte % 10;
        
        double notasCinco = depoisdosDez / 5;
        double depoisdosCinco = depoisdosDez % 5;
        
        double notasDois = depoisdosCinco / 2;
        double depoisdosDois = depoisdosCinco % 2;
        
        double moedasUm = depoisdosDois / 1;
        double depoisdoUm = depoisdosDois % 1;
        
        double moedasCinque = depoisdoUm / 0.5;
        double depoisdoCinque = depoisdoUm % 0.5;
        
        double vintecincocent = depoisdoCinque / 0.25;
        double depoisdovintecincocent = depoisdoCinque % 0.25;
        
        double dezCent = depoisdovintecincocent / 0.1;
        double depoisdodezCent = depoisdovintecincocent % 0.1;
        
        double cincoCent = depoisdodezCent / 0.05;
        double depoisdoCinco = depoisdodezCent % 0.05;
        
        double umCent = depoisdoCinco / 0.01;
        double rumCent = depoisdoCinco % 0.01;
        
        
        umCent = umCent + rumCent;
        
    int ontCem = (int) notasCem;
    int ontCinquenta = (int) notasCinquenta;
    int ontVinte = (int) notasVinte;
    int ontDez = (int) notasDez;
    int ontCinco = (int) notasCinco;
    int ontDois = (int) notasDois;
    int ontUm = (int) moedasUm;
    int ontCinque = (int) moedasCinque;
    int ontVinteCincoCent = (int) vintecincocent;
    int ontDezCent = (int) dezCent;
    int ontCincoCent = (int) cincoCent;
    int ontUmCent = (int) umCent;

      System.out.println("NOTAS:");
        System.out.println(ontCem + " nota(s) de R$ 100.00");
        System.out.println(ontCinquenta + " nota(s) de R$ 50.00");
        System.out.println(ontVinte + " nota(s) de R$ 20.00");
        System.out.println(ontDez + " nota(s) de R$ 10.00");
        System.out.println(ontCinco + " nota(s) de R$ 5.00");
        System.out.println(ontDois + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(ontUm + " moeda(s) de R$ 1.00");
        System.out.println(ontCinque + " moeda(s) de R$ 0.50");
        System.out.println(ontVinteCincoCent + " moeda(s) de R$ 0.25");
        System.out.println(ontDezCent + " moeda(s) de R$ 0.10");
        System.out.println(ontCincoCent + " moeda(s) de R$ 0.05");
        System.out.println(ontUmCent + " moeda(s) de R$ 0.01");

             
	}
}