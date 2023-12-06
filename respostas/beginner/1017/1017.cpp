#include <iostream>
#include <cstdio>
#include <iomanip> // Added for setprecision

using namespace std;

int main()
{
    double tempo;
    double distance;
    double sepo;
    double mogo;
    
    scanf("%lf", &tempo);
    scanf("%lf", &distance);
      
    sepo = tempo * distance;
    mogo = sepo / 12;
    
         printf("%.3f", mogo);

    return 0;
}
