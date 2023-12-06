/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
#include <sstream> 

using namespace std;

int main()
{
    int numnovo;
    int novonum;
    scanf("%d", &numnovo);
    
    novonum = numnovo * 2;
    
    //tem que ajustar pra o que o treco gosta
    
    std::stringstream formattedValue; // Cria um stringstream
    formattedValue << novonum << " minutos"; // Formata a string desejada

    std::cout << formattedValue.str(); // Imprime a string formatada

    
    return 0;
}